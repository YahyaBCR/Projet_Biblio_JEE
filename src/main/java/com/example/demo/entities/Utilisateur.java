package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Utilisateur")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUtilisateur;
    private String nom;
    private String email;
    private String motdePasse;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Emprunt> emprunts ;

}
