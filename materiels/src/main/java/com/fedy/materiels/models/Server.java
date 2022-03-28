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
public class Server {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdServer;
    private String NomServer;
    private String AddressIP;
    private String AddressMAC;
    private String CPU;
    private String RAM;
    private String OS;
    private String Type;
    private Boolean Raid;
    private Date DateAjout;

   /** public Server() {
        super();
    }

    public Server(String nomServer, String addressIP, String addressMAC, String CPU, String RAM, String OS, String type, Boolean raid, Date dateAjout) {
        super();
        NomServer = nomServer;
        AddressIP = addressIP;
        AddressMAC = addressMAC;
        this.CPU = CPU;
        this.RAM = RAM;
        this.OS = OS;
        Type = type;
        Raid = raid;
        DateAjout = dateAjout;
    }

    public int getIdServer() {
        return IdServer;
    }

    public void setIdServer(int idServer) {
        IdServer = idServer;
    }

    public String getNomServer() {
        return NomServer;
    }

    public void setNomServer(String nomServer) {
        NomServer = nomServer;
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

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Boolean getRaid() {
        return Raid;
    }

    public void setRaid(Boolean raid) {
        Raid = raid;
    }

    public Date getDateAjout() {
        return DateAjout;
    }

    public void setDateAjout(Date dateAjout) {
        DateAjout = dateAjout;
    }

    @Override
    public String toString() {
        return "server{" +
                "IdServer=" + IdServer +
                ", NomServer='" + NomServer + '\'' +
                ", AddressIP='" + AddressIP + '\'' +
                ", AddressMAC='" + AddressMAC + '\'' +
                ", CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", OS='" + OS + '\'' +
                ", Type='" + Type + '\'' +
                ", Raid=" + Raid +
                ", DateAjout=" + DateAjout +
                '}';
    }**/
}