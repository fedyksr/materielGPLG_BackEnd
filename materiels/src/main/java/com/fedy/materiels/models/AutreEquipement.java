package com.fedy.materiels.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class AutreEquipement{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAutreEquipement;
    private String nomAutreEquipement;
    private String marque;
    private String description;
    private Date dateAjout;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "ordinateur")
    private Ordinateur ordinateur;

    /**public AutreEquipement() {
        super();
    }

    public AutreEquipement(String nomAutreEquipement, String marque, String description, Date dateAjout) {
        super();
        NomAutreEquipement = nomAutreEquipement;
        Marque = marque;
        Description = description;
        DateAjout = dateAjout;
    }

    public int getIdAutreEquipement() {
        return IdAutreEquipement;
    }

    public void setIdAutreEquipement(int idAutreEquipement) {
        IdAutreEquipement = idAutreEquipement;
    }

    public String getNomAutreEquipement() {
        return NomAutreEquipement;
    }

    public void setNomAutreEquipement(String nomAutreEquipement) {
        NomAutreEquipement = nomAutreEquipement;
    }

    public String getMarque() {
        return Marque;
    }

    public void setMarque(String marque) {
        Marque = marque;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Date getDateAjout() {
        return DateAjout;
    }

    public void setDateAjout(Date dateAjout) {
        DateAjout = dateAjout;
    }

    @Override
    public String toString() {
        return "autreEquipement{" +
                "IdAutreEquipement=" + IdAutreEquipement +
                ", NomAutreEquipement='" + NomAutreEquipement + '\'' +
                ", Marque='" + Marque + '\'' +
                ", Description='" + Description + '\'' +
                ", DateAjout=" + DateAjout +
                '}';
    }**/
}