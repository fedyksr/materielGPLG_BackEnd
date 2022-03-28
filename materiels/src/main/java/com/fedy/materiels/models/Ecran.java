package com.fedy.materiels.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Ecran {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdEcran;
    private String Marque;
    private String Pouce;
    private Date DateAjout;
}