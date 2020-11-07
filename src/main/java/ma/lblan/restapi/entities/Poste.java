package ma.lblan.restapi.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;


@Entity
public class Poste {

    @Id
    @GeneratedValue
    private Long id;
    private String titre;
    private String descreption;
    private LocalDate date;
    private int DureeMax;
    private int DureeMin;
    private double prixMin;
    private double prixMax;
    private Integer etatProjet;
    private boolean payementEnLigne;
    private String ville;
    private String typePeriod;

    @ManyToOne
    @JoinColumn(name="idPrestataire")
    private Prestataire prestataire;
    /*
    @ManyToOne
    @JoinColumn(name="idVille", nullable=true)
    private Ville villePost;
*/
    @OneToMany(mappedBy="poste")
    private Set<Image> images;

    @ManyToOne
    @JoinColumn(name="idClient")
    private Client client;

    public Poste() {
    }

    public Poste(String titre, String descreption, LocalDate date, int dureeMax, int dureeMin, double prixMin, double prixMax, Integer etatProjet, boolean payementEnLigne, String ville, String typePeriod, Prestataire prestataire, Set<Image> images, Client client) {
        this.titre = titre;
        this.descreption = descreption;
        this.date = date;
        DureeMax = dureeMax;
        DureeMin = dureeMin;
        this.prixMin = prixMin;
        this.prixMax = prixMax;
        this.etatProjet = etatProjet;
        this.payementEnLigne = payementEnLigne;
        this.ville = ville;
        this.typePeriod = typePeriod;
        this.prestataire = prestataire;
        this.images = images;
        this.client = client;
    }

    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getDureeMax() {
        return DureeMax;
    }

    public void setDureeMax(int dureeMax) {
        DureeMax = dureeMax;
    }

    public int getDureeMin() {
        return DureeMin;
    }

    public void setDureeMin(int dureeMin) {
        DureeMin = dureeMin;
    }

    public double getPrixMin() {
        return prixMin;
    }

    public void setPrixMin(double prixMin) {
        this.prixMin = prixMin;
    }

    public double getPrixMax() {
        return prixMax;
    }

    public void setPrixMax(double prixMax) {
        this.prixMax = prixMax;
    }

    public Integer getEtatProjet() {
        return etatProjet;
    }

    public void setEtatProjet(Integer etatProjet) {
        this.etatProjet = etatProjet;
    }

    public boolean isPayementEnLigne() {
        return payementEnLigne;
    }

    public void setPayementEnLigne(boolean payementEnLigne) {
        this.payementEnLigne = payementEnLigne;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTypePeriod() {
        return typePeriod;
    }

    public void setTypePeriod(String typePeriod) {
        this.typePeriod = typePeriod;
    }
    public Prestataire getOffreur() {
        return prestataire;
    }

    public void setOffreur(Prestataire prestataire) {
        this.prestataire = prestataire;
    }

/*

    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }
*/
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
