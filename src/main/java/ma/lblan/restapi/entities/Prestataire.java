package ma.lblan.restapi.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Prestataire {

    @Id
    @GeneratedValue
    private Long id;
    private String titre;
    private String nom;
    private String prenom;
    private String adresse;
    private boolean ban;
    private boolean verifie;
    private char type;
    private String summary;
    private String ville;



    @OneToMany (mappedBy="pk.prestataire")
    private Set<Avis> avis = new HashSet<>();


    @OneToMany(mappedBy = "prestataire")
    private Set<Poste> postes;

    @OneToOne
    @JoinColumn(name="id")
    private Image image;

    public Prestataire() {
    }

    public Prestataire(String titre, String nom, String prenom, String adresse, boolean ban, boolean verifie, char type, String summary, String ville, Set<Avis> avis, Set<Poste> postes, Image image) {
        this.titre = titre;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ban = ban;
        this.verifie = verifie;
        this.type = type;
        this.summary = summary;
        this.ville = ville;
        this.avis = avis;
        this.postes = postes;
        this.image = image;
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

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Set<Avis> getAvis() {
        return avis;
    }

    public void setAvis(Set<Avis> avis) {
        this.avis = avis;
    }

    public Set<Poste> getPostes() {
        return postes;
    }

    public void setPostes(Set<Poste> postes) {
        this.postes = postes;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
