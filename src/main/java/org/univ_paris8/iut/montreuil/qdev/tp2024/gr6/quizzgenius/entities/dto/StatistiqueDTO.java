package org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.entities.dto;

public class StatistiqueDTO {

    private int nbPartieEffectuees;
    private int nbQuestTraitees;
    private int nbQuestCorrectes;
    private int temps;

    public StatistiqueDTO(int nbPartieEffectuees, int nbQuestTraitees, int nbQuestCorrectes, int temps) {
        this.nbPartieEffectuees = nbPartieEffectuees;
        this.nbQuestTraitees = nbQuestTraitees;
        this.nbQuestCorrectes = nbQuestCorrectes;
        this.temps = temps;
    }

    public int getNbPartieEffectuees() {
        return nbPartieEffectuees;
    }

    public void setNbPartieEffectuees(int nbPartieEffectuees) {
        this.nbPartieEffectuees = nbPartieEffectuees;
    }

    public int getNbQuestTraitees() {
        return nbQuestTraitees;
    }

    public void setNbQuestTraitees(int nbQuestTraitees) {
        this.nbQuestTraitees = nbQuestTraitees;
    }

    public int getNbQuestCorrectes() {
        return nbQuestCorrectes;
    }

    public void setNbQuestCorrectes(int nbQuestCorrectes) {
        this.nbQuestCorrectes = nbQuestCorrectes;
    }

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }

    @Override
    public String toString() {
        return "StatistiqueDTO{" +
                "nbPartieEffectuees=" + nbPartieEffectuees +
                ", nbQuestTraitees=" + nbQuestTraitees +
                ", nbQuestCorrectes=" + nbQuestCorrectes +
                ", temps=" + temps +
                '}';
    }
}
