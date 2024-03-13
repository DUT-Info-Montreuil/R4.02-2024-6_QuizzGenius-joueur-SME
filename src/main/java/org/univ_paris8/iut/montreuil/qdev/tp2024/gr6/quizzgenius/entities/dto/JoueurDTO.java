package org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.entities.dto;

import java.util.ArrayList;
import java.util.Objects;

import utiles.Enum.LangueEnum;

public class JoueurDTO {
    private String pseudo;
    private String prenom;
    private int anneeNaissance;
    private ArrayList<String> centreInteret;
    private LangueEnum langue;

    private StatistiqueDTO statistiques;

    public JoueurDTO(String pseudo, String prenom, int anneeNaissance, ArrayList<String> centreInteret, LangueEnum langueEnum, StatistiqueDTO statistiques) {
        this.pseudo = pseudo;
        this.prenom = prenom;
        this.anneeNaissance = anneeNaissance;
        this.centreInteret = centreInteret;
        this.langue = langueEnum;
        this.statistiques = statistiques;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    public ArrayList<String> getCentreInteret() {
        return centreInteret;
    }

    public LangueEnum getLangue() {
        return langue;
    }

    public StatistiqueDTO getStatistiques() {
        return statistiques;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    public void setCentreInteret(ArrayList<String> centreInteret) {
        this.centreInteret = centreInteret;
    }

    public void setLangue(LangueEnum langueEnum) {
        this.langue = langueEnum;
    }

    public void setStatistiques(StatistiqueDTO statistiques) {
        this.statistiques = statistiques;
    }

    @Override
    public String toString() {
        return "JoueurDTO{" +
                "pseudo='" + pseudo + '\'' +
                ", prenom='" + prenom + '\'' +
                ", anneeNaissance=" + anneeNaissance +
                ", centreInteret=" + centreInteret +
                ", langue=" + langue +
                ", statistiques=" + statistiques +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JoueurDTO joueurDTO = (JoueurDTO) o;
        return Objects.equals(pseudo, joueurDTO.pseudo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pseudo);
    }
}
