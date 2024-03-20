package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.IdentityHashMap;
import java.util.List;

@Entity
@Table(name = "Livre")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLivre;
    private String titre;
    private String auteur;
    private int anneePub;
    private String categorie;

    @OneToMany(mappedBy = "livre")
    private List<Emprunt> emprunts;

}
