package com.fedy.materiels.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
public class DisqueDur {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idDisqueDur;
    private String type;
    private String marque;
    private String capacite;
    private Double usb;
    private Date dateAjout;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "ordinateur")
    private Ordinateur ordinateur;

/**    public DisqueDur() {
        super();
    }

    public DisqueDur(String type, String marque, String capacite, Double USB, Date dateAjout) {
        super();
        Type = type;
        Marque = marque;
        Capacite = capacite;
        this.USB = USB;
        DateAjout = dateAjout;
    }

    public int getIdDisqueDur() {

        return IdDisqueDur;
    }

    public void setIdDisqueDur(int idDisqueDur) {
        IdDisqueDur = idDisqueDur;
    }

    public String getType() {

        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getMarque() {

        return Marque;
    }

    public void setMarque(String marque) {

        Marque = marque;
    }

    public String getCapacite() {

        return Capacite;
    }

    public void setCapacite(String capacite) {

        Capacite = capacite;
    }

    public Double getUSB() {

        return USB;
    }

    public void setUSB(Double USB) {

        this.USB = USB;
    }

    public Date getDateAjout() {

        return DateAjout;
    }

    public void setDateAjout(Date dateAjout) {
        DateAjout = dateAjout;
    }

    @Override
    public String toString() {
        return "disquedur{" +
                "IdDisqueDur=" + IdDisqueDur +
                ", Type='" + Type + '\'' +
                ", Marque='" + Marque + '\'' +
                ", Capacite='" + Capacite + '\'' +
                ", USB=" + USB +
                ", DateAjout=" + DateAjout +
                '}';
    }**/
}
