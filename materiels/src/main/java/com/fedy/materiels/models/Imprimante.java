package com.fedy.materiels.models;

import com.fasterxml.jackson.annotation.*;
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
public class Imprimante {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int  IdImprimante;
    private String Marque;
    private String Modele;
    private String Type;
    private String TypeConnexion;
    private Boolean Couleur;
    private Boolean RectoVerso;
    private String TypeImpression;
    private Boolean MultiFonction;
    private Date DateAjout;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="idordina")
    @JsonBackReference
    private Ordinateur ordina;

    /**public Imprimante(String marque, String modele, String type, String typeConnexion, Boolean couleur, Boolean rectoVerso, String typeImpression, Boolean multiFonction, Date dateAjout) {
        super();
        Marque = marque;
        Modele = modele;
        Type = type;
        TypeConnexion = typeConnexion;
        Couleur = couleur;
        RectoVerso = rectoVerso;
        TypeImpression = typeImpression;
        MultiFonction = multiFonction;
        DateAjout = dateAjout;
    }

    public Imprimante() {
        super();
    }

    public int getIdImprimante() {
        return IdImprimante;
    }

    public void setIdImprimante(int idImprimante) {
        IdImprimante = idImprimante;
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

    public String getTypeConnexion() {
        return TypeConnexion;
    }

    public void setTypeConnexion(String typeConnexion) {
        TypeConnexion = typeConnexion;
    }

    public Boolean getCouleur() {
        return Couleur;
    }

    public void setCouleur(Boolean couleur) {
        Couleur = couleur;
    }

    public Boolean getRectoVerso() {
        return RectoVerso;
    }

    public void setRectoVerso(Boolean rectoVerso) {
        RectoVerso = rectoVerso;
    }

    public String getTypeImpression() {
        return TypeImpression;
    }

    public void setTypeImpression(String typeImpression) {
        TypeImpression = typeImpression;
    }

    public Boolean getMultiFonction() {
        return MultiFonction;
    }

    public void setMultiFonction(Boolean multiFonction) {
        MultiFonction = multiFonction;
    }

    public Date getDateAjout() {
        return DateAjout;
    }

    public void setDateAjout(Date dateAjout) {
        DateAjout = dateAjout;
    }

    @Override
    public String toString() {
        return "imprimante{" +
                "IdImprimante=" + IdImprimante +
                ", Marque='" + Marque + '\'' +
                ", Modele='" + Modele + '\'' +
                ", Type='" + Type + '\'' +
                ", TypeConnexion='" + TypeConnexion + '\'' +
                ", Couleur=" + Couleur +
                ", RectoVerso=" + RectoVerso +
                ", TypeImpression='" + TypeImpression + '\'' +
                ", MultiFonction=" + MultiFonction +
                ", DateAjout=" + DateAjout +
                '}';
    }**/
}