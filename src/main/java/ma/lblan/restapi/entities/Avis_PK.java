package ma.lblan.restapi.entities;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;


@Embeddable
public class Avis_PK implements Serializable {

    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name="idClient")
    private Client client;

    @ManyToOne
    @JoinColumn(name="idPrestataire")
    private Prestataire prestataire;

    public Avis_PK() {
    }

    public Avis_PK(Client client, Prestataire prestataire) {
        this.client = client;
        this.prestataire = prestataire;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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
}
