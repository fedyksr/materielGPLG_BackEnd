package com.fedy.materiels.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Onduleur{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int IdOnduleur;
    private String Marque;
    private String Puissance;
    private Boolean Online;
    private String Type;
    private Date DateAjout;

    /**public Onduleur() {
        super();
    }

    public Onduleur(String marque, String puissance, Boolean online, String type, Date dateAjout) {
        super();
        Marque = marque;
        Puissance = puissance;
        Online = online;
        Type = type;
        DateAjout = dateAjout;
    }

    public int getIdOnduleur() {
        return IdOnduleur;
    }

    public void setIdOnduleur(int idOnduleur) {
        IdOnduleur = idOnduleur;
    }

    public String getMarque() {
        return Marque;
    }

    public void setMarque(String marque) {
        Marque = marque;
    }

    public String getPuissance() {
        return Puissance;
    }

    public void setPuissance(String puissance) {
        Puissance = puissance;
    }

    public Boolean getOnline() {
        return Online;
    }

    public void setOnline(Boolean online) {
        Online = online;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Date getDateAjout() {
        return DateAjout;
    }

    public void setDateAjout(Date dateAjout) {
        DateAjout = dateAjout;
    }

    @Override
    public String toString() {
        return "onduleur{" +
                "IdOnduleur=" + IdOnduleur +
                ", Marque='" + Marque + '\'' +
                ", Puissance='" + Puissance + '\'' +
                ", Online=" + Online +
                ", Type='" + Type + '\'' +
                ", DateAjout=" + DateAjout +
                '}';
    }**/
}
