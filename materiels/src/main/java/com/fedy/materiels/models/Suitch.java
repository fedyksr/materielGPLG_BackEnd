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
public class Suitch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdSuitch;
    private String Marque;
    private Boolean Administrable;
    private int NombrePort;
    private String CascadeAp;
    private String CascadeAv;
    private Date DateAjout;

    /**public Suitch() {
        super();
    }

    public Suitch(String marque, Boolean administrable, int nombrePort, String cascadeAp, String cascadeAv, Date dateAjout) {
        super();
        Marque = marque;
        Administrable = administrable;
        NombrePort = nombrePort;
        CascadeAp = cascadeAp;
        CascadeAv = cascadeAv;
        DateAjout = dateAjout;
    }

    public int getIdSuitch() {
        return IdSuitch;
    }

    public void setIdSuitch(int idSuitch) {
        IdSuitch = idSuitch;
    }

    public String getMarque() {
        return Marque;
    }

    public void setMarque(String marque) {
        Marque = marque;
    }

    public Boolean getAdministrable() {
        return Administrable;
    }

    public void setAdministrable(Boolean administrable) {
        Administrable = administrable;
    }

    public int getNombrePort() {
        return NombrePort;
    }

    public void setNombrePort(int nombrePort) {
        NombrePort = nombrePort;
    }

    public String getCascadeAp() {
        return CascadeAp;
    }

    public void setCascadeAp(String cascadeAp) {
        CascadeAp = cascadeAp;
    }

    public String getCascadeAv() {
        return CascadeAv;
    }

    public void setCascadeAv(String cascadeAv) {
        CascadeAv = cascadeAv;
    }

    public Date getDateAjout() {
        return DateAjout;
    }

    public void setDateAjout(Date dateAjout) {
        DateAjout = dateAjout;
    }

    @Override
    public String toString() {
        return "suitch{" +
                "IdSuitch=" + IdSuitch +
                ", Marque='" + Marque + '\'' +
                ", Administrable=" + Administrable +
                ", NombrePort=" + NombrePort +
                ", CascadeAp='" + CascadeAp + '\'' +
                ", CascadeAv='" + CascadeAv + '\'' +
                ", DateAjout=" + DateAjout +
                '}';
    }**/
}
