package ma.lblan.restapi.entities;

import javax.persistence.*;

@Entity
public class Image {

    @Id
    @GeneratedValue
    private long id;
    private String url;

    @OneToOne(mappedBy="image")
    private Client client;

    @OneToOne(mappedBy="image")
    private Prestataire prestataire;


    @ManyToOne
    @JoinColumn(name="idPoste")
    private Poste poste;

    public Image() {
    }

    public Image(String url, Client client, Prestataire prestataire, Poste poste) {
        this.id = id;
        this.url = url;
        this.client = client;
        this.prestataire = prestataire;
        this.poste = poste;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Prestataire getOffreur() {
        return prestataire;
    }

    public void setOffreur(Prestataire prestataire) {
        this.prestataire = prestataire;
    }

    public Poste getPoste() {
        return poste;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }
}
