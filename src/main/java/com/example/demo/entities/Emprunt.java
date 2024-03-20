package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;


@Entity
@Table(name = "Emprunt")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmprunt;
    @ManyToOne()
    private Livre livre;
    @ManyToMany(mappedBy = "emprunts")
    private Collection<Utilisateur> utilisateurs ;
    private Date dateEmprunt;
    private Date dateRetour;
    private boolean enCours;
}
