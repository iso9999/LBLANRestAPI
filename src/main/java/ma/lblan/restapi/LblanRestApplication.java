package ma.lblan.restapi;

import ma.lblan.restapi.dao.*;
import ma.lblan.restapi.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class LblanRestApplication implements CommandLineRunner {


    @Autowired
    PosteDao posteDao;

    @Autowired
    ClientDao clientDao;

    @Autowired
    PrestataireDao prestataireDao;

    @Autowired
    AvisDao avisDao;

    @Autowired
    ImageDao imageDao;
    public static void main(String[] args) {
        SpringApplication.run(LblanRestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("LBLAN INIT !");
        //allimenter la base
        initForTest();
    }

    private void initForTest()
    {
        Image image_ofcl=new Image("par_defaut",null,null,null);
        Prestataire prestataire = new Prestataire("9ttal","manareddine","ismail","911 Safi",false,false,'f',"BLABLABLA","Safi",null,null,null);
        Client client = new Client("ismail","ismail","SBBAGH","505050 Safi",false,true,"Safi","BLABLA",null,null,null);
        Avis avisc1o1 = new Avis(client, prestataire,5,"NADI");
        Image image=new Image("par_defaut2",null,null,null);
        Set<Image> images = new HashSet<Image>();
        images.add(image);
        Poste poste = new Poste("test","BLABLA",LocalDate.now(),10,10,10,10,1,true,"Safi","DAYS",null,images,client);
        Poste poste1 = new Poste("test2","BLABLA",LocalDate.now(),10,10,10,10,1,true,"Safi","DAYS", prestataire,null,client);
        Poste poste2 = new Poste("test3","BLABLA",LocalDate.now(),10,10,10,10,1,true,"Safi","DAYS",null,null,client);
        Poste poste3 = new Poste("test4","BLABLA",LocalDate.now(),10,10,10,10,1,true,"Safi","DAYS", prestataire,null,client);
        Set<Poste> postes = new HashSet<Poste>();
        postes.add(poste);
        postes.add(poste1);
        postes.add(poste2);
        postes.add(poste3);
        image.setPoste(poste);
        client.setPostes(postes);
        Set<Avis> avis=new HashSet<Avis>();
        avis.add(avisc1o1);
        client.setAvis(avis);
        prestataire.setAvis(avis);
        Client client1 = new Client("manareddine","manareddine","SBBAGH","5050595190 Safi",false,true,"Safi","BLABLA",null,null,null);
        client.setImage(image_ofcl);

        imageDao.save(image_ofcl);
        clientDao.save(client);
        clientDao.save(client1);
        prestataireDao.save(prestataire);
        posteDao.save(poste);
        posteDao.save(poste1);
        posteDao.save(poste2);
        posteDao.save(poste3);
        avisDao.save(avisc1o1);
        imageDao.save(image);
    }
}
