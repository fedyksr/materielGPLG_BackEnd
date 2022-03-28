package com.fedy.materiels.models;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Ordinateur {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idOrdinateur;
    private String nomOrdinateur;
    private String addressIP;
    private String addressMAC;
    private String ram;
    private String cpu;
    private Boolean raid;
    private String type;
    private Boolean actif;
    private String marque;
    private String dateAjout;
    private String os;
    private Boolean lecteurCD;
    private Boolean lecteurDVD;

    @OneToMany(mappedBy="ordina")
    @JsonManagedReference
    private List<Imprimante>imprimantesliee;

    /**public int getIdOrdinateur() {
        return IdOrdinateur;
    }

    public void setIdOrdinateur(int idOrdinateur) {
        IdOrdinateur = idOrdinateur;
    }

    public String getNomOrdinateur() {
        return NomOrdinateur;
    }

    public void setNomOrdinateur(String nomOrdinateur) {
        NomOrdinateur = nomOrdinateur;
    }

    public String getAddressIP() {
        return AddressIP;
    }

    public void setAddressIP(String addressIP) {
        AddressIP = addressIP;
    }

    public String getAddressMAC() {
        return AddressMAC;
    }

    public void setAddressMAC(String addressMAC) {
        AddressMAC = addressMAC;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public Boolean getRaid() {
        return Raid;
    }

    public void setRaid(Boolean raid) {
        Raid = raid;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Boolean getActif() {
        return Actif;
    }

    public void setActif(Boolean actif) {
        Actif = actif;
    }

    public String getMarque() {
        return Marque;
    }

    public void setMarque(String marque) {
        this.Marque = marque;
    }

    public Date getDateAjout() {
        return DateAjout;
    }

    public void setDateAjout(Date dateAjout) {
        DateAjout = dateAjout;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public Boolean getLecteurCD() {
        return LecteurCD;
    }

    public void setLecteurCD(Boolean lecteurCD) {
        LecteurCD = lecteurCD;
    }

    public Boolean getLecteurDVD() {
        return LecteurDVD;
    }

    public void setLecteurDVD(Boolean lecteurDVD) {
        LecteurDVD = lecteurDVD;
    }

    public Ordinateur() {
        super();
    }

    public Ordinateur(String nomOrdinateur, String addressIP, String addressMAC, String RAM, String CPU, Boolean raid, String type, Boolean actif, String marque, Date dateAjout, String OS, Boolean lecteurCD, Boolean lecteurDVD) {
        super();
        NomOrdinateur = nomOrdinateur;
        AddressIP = addressIP;
        AddressMAC = addressMAC;
        this.RAM = RAM;
        this.CPU = CPU;
        Raid = raid;
        Type = type;
        Actif = actif;
        this.Marque = marque;
        DateAjout = dateAjout;
        this.OS = OS;
        LecteurCD = lecteurCD;
        LecteurDVD = lecteurDVD;
    }**/
}