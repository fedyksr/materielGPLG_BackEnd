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
public class Ecran {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEcran;
    private String marque;
    private String pouce;
    private Date dateAjout;


    @OneToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL,mappedBy = "ecran")
    private Ordinateur ordinateur;
}