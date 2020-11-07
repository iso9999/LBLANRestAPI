package ma.lblan.restapi.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Client implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
    private String titre;
    private String adresse;
    private boolean ban;
    private boolean verifie;
    private String ville;
    private String summary;


    @OneToMany(mappedBy = "client")
    private Set<Poste> postes;

    /*@ManyToOne
    @JoinColumn(name="idVille", nullable=true)
    private Ville villeClient;*/


    @OneToMany(mappedBy = "pk.client")
    private Set<Avis> avis;

    @OneToOne
    @JoinColumn(name="idImage")
    private Image image;

    public Client() {
    }

    public Client(String nom, String prenom, String titre, String adresse, boolean ban, boolean verifie, String ville, String summary, Set<Poste> postes, Set<Avis> avis, Image image) {
        this.nom = nom;
        this.prenom = prenom;
        this.titre = titre;
        this.adresse = adresse;
        this.ban = ban;
        this.verifie = verifie;
        this.ville = ville;
        this.summary = summary;
        this.postes = postes;
        this.avis = avis;
        this.image = image;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public boolean isBan() {
        return ban;
    }

    public void setBan(boolean ban) {
        this.ban = ban;
    }

    public boolean isVerifie() {
        return verifie;
    }

    public void setVerifie(boolean verifie) {
        this.verifie = verifie;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Set<Poste> getPostes() {
        return postes;
    }

    public void setPostes(Set<Poste> postes) {
        this.postes = postes;
    }


    public Set<Avis> getAvis() {
        return avis;
    }

    public void setAvis(Set<Avis> avis) {
        this.avis = avis;
    }
}
