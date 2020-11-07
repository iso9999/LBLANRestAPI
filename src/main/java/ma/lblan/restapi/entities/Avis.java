package ma.lblan.restapi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Avis {

    @Id
    private Avis_PK pk;
    private int note;
    private String commentaire;

    public Avis() {
    }

    public Avis(Avis_PK pk, int note, String commentaire) {
        this.pk = pk;
        this.note = note;
        this.commentaire = commentaire;
    }

    public Avis(Client client, Prestataire prestataire, int note, String commentaire) {
        this.pk= new Avis_PK(client, prestataire);
        this.note = note;
        this.commentaire = commentaire;
    }


    public Avis_PK getPk() {
        return pk;
    }

    public void setPk(Avis_PK pk) {
        this.pk = pk;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
