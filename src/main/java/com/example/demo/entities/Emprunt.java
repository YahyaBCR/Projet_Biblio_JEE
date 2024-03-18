package com.example.demo.entities;

import java.util.Date;

public class Emprunt {
    private int idEmprunt;
    private Livre livre;
    private Utilisateur utilisateur;
    private Date dateEmprunt;

    private Date dateRetour;

    private boolean enCours;
}
