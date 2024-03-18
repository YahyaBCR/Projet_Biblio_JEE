package com.example.demo.entities;

import java.util.List;

public class Livre {
    private int idLivre;
    private String titre;
    private String auteur;
    private int anneePub;
    private String categorie;

    private List<Emprunt> emprunts;

}
