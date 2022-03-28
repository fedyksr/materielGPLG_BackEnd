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
public class Scanner{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int IdScanner;
    private String Marque;
    private String Modele;
    private String Type;
    private Date DateAjout;
    private Boolean Actif;

    /**public Scanner() {
        super();
    }

    public Scanner(String marque, String modele, String type, Date dateAjout, Boolean actif) {
        super();
        Marque = marque;
        Modele = modele;
        Type = type;
        DateAjout = dateAjout;
        Actif = actif;
    }

    public int getIdScanner() {
        return IdScanner;
    }

    public void setIdScanner(int idScanner) {
        IdScanner = idScanner;
    }

    public String getMarque() {
        return Marque;
    }

    public void setMarque(String marque) {
        Marque = marque;
    }

    public String getModele() {
        return Modele;
    }

    public void setModele(String modele) {
        Modele = modele;
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

    public Boolean getActif() {
        return Actif;
    }

    public void setActif(Boolean actif) {
        Actif = actif;
    }

    @Override
    public String toString() {
        return "scanner{" +
                "IdScanner=" + IdScanner +
                ", Marque='" + Marque + '\'' +
                ", Modele='" + Modele + '\'' +
                ", Type='" + Type + '\'' +
                ", DateAjout=" + DateAjout +
                ", Actif=" + Actif +
                '}';
    }**/
}
