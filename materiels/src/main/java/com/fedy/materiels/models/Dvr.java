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
public class Dvr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdDvr;
    private String Port;
    private int NombreCameras;
    private String Marque;
    private Date DateAjout;

   /** public Dvr() {
        super();
    }

    public Dvr(String port, int nombreCameras, String marque, Date dateAjout) {
        super();
        Port = port;
        NombreCameras = nombreCameras;
        Marque = marque;
        DateAjout = dateAjout;
    }

    public int getIdDvr() {
        return IdDvr;
    }

    public void setIdDvr(int idDvr) {
        IdDvr = idDvr;
    }

    public String getPort() {
        return Port;
    }

    public void setPort(String port) {
        Port = port;
    }

    public int getNombreCameras() {
        return NombreCameras;
    }

    public void setNombreCameras(int nombreCameras) {
        NombreCameras = nombreCameras;
    }

    public String getMarque() {
        return Marque;
    }

    public void setMarque(String marque) {
        Marque = marque;
    }

    public Date getDateAjout() {
        return DateAjout;
    }

    public void setDateAjout(Date dateAjout) {
        DateAjout = dateAjout;
    }

    @Override
    public String toString() {
        return "dvr{" +
                "IdDvr=" + IdDvr +
                ", Port='" + Port + '\'' +
                ", NombreCameras=" + NombreCameras +
                ", Marque='" + Marque + '\'' +
                ", DateAjout=" + DateAjout +
                '}';
    }**/
}
