package org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.entities.dto;

import java.util.ArrayList;

public class JoueurDTO {
    private String pseudo;
    private String prenom;
    private int anneeNaissance;
    private ArrayList<String> centreInteret;
    private Langue langue;

    private StatistiqueDTO statistiques;
}
