package com.fedy.materiels.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="telephone")
public class Telephone{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdTelephone;
    private String Marque;
    private Boolean Afficheur;
    private String Type;
    private int NumCommit;
    private Date DateAjout;

    /** public Telephone() {
        super();
    }

    public Telephone(String marque, Boolean afficheur, String type, int numCommit, Date dateAjout) {
        super();
        Marque = marque;
        Afficheur = afficheur;
        Type = type;
        NumCommit = numCommit;
        DateAjout = dateAjout;
    }

    public int getIdTelephone() {
        return IdTelephone;
    }

    public void setIdTelephone(int idTelephone) {
        IdTelephone = idTelephone;
    }

    public String getMarque() {
        return Marque;
    }

    public void setMarque(String marque) {
        Marque = marque;
    }

    public Boolean getAfficheur() {
        return Afficheur;
    }

    public void setAfficheur(Boolean afficheur) {
        Afficheur = afficheur;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getNumCommit() {
        return NumCommit;
    }

    public void setNumCommit(int numCommit) {
        NumCommit = numCommit;
    }

    public Date getDateAjout() {
        return DateAjout;
    }

    public void setDateAjout(Date dateAjout) {
        DateAjout = dateAjout;
    }

    @Override
    public String toString() {
        return "telephone{" +
                "IdTelephone=" + IdTelephone +
                ", Marque='" + Marque + '\'' +
                ", Afficheur=" + Afficheur +
                ", Type='" + Type + '\'' +
                ", NumCommit=" + NumCommit +
                ", DateAjout=" + DateAjout +
                '}';
    }**/
}
