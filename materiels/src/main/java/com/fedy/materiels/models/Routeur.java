package com.fedy.materiels.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Routeur {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int IdRouteur;
    private String Marque;
    private String Type;
    private Boolean Ontenne;
    private String Port;
    private String Abonnement;
    private Date DateAjout;

    /**public Routeur() {
        super();
    }

    public Routeur(String marque, String type, Boolean ontenne, String port, String abonnement, Date dateAjout) {
        super();
        Marque = marque;
        Type = type;
        Ontenne = ontenne;
        Port = port;
        Abonnement = abonnement;
        DateAjout = dateAjout;
    }

    public int getIdRouteur() {
        return IdRouteur;
    }

    public void setIdRouteur(int idRouteur) {
        IdRouteur = idRouteur;
    }

    public String getMarque() {
        return Marque;
    }

    public void setMarque(String marque) {
        Marque = marque;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Boolean getOntenne() {
        return Ontenne;
    }

    public void setOntenne(Boolean ontenne) {
        Ontenne = ontenne;
    }

    public String getPort() {
        return Port;
    }

    public void setPort(String port) {
        Port = port;
    }

    public String getAbonnement() {
        return Abonnement;
    }

    public void setAbonnement(String abonnement) {
        Abonnement = abonnement;
    }

    public Date getDateAjout() {
        return DateAjout;
    }

    public void setDateAjout(Date dateAjout) {
        DateAjout = dateAjout;
    }

    @Override
    public String toString() {
        return "routeurAP{" +
                "IdRouteur=" + IdRouteur +
                ", Marque='" + Marque + '\'' +
                ", Type='" + Type + '\'' +
                ", Ontenne=" + Ontenne +
                ", Port='" + Port + '\'' +
                ", Abonnement='" + Abonnement + '\'' +
                ", DateAjout=" + DateAjout +
                '}';
    }**/
}