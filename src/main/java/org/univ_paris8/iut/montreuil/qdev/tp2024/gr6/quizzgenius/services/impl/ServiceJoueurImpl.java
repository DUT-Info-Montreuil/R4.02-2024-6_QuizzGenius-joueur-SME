package org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.entities.dto.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.services.interfaces.IServiceJoueur;
import utiles.Enum.LangueEnum;
import utiles.exceptions.ErreurSaisiesException;
import utiles.exceptions.PseudoExistantException;

import java.util.ArrayList;

public class ServiceJoueurImpl implements IServiceJoueur {
    private static ServiceJoueurImpl uniqueInstance = null;

    private ArrayList<JoueurDTO> joueurs;

    private ServiceJoueurImpl() {
        joueurs = new ArrayList<JoueurDTO>();
    }

    public static ServiceJoueurImpl getInstance() {
        if (uniqueInstance==null) {
            uniqueInstance = new ServiceJoueurImpl();
        }
        return uniqueInstance;
    }

    @Override
    public JoueurDTO ajouterJoueur(String prenom, String pseudo, int annee, ArrayList<String> centreInteret, LangueEnum langue) throws ErreurSaisiesException, PseudoExistantException {
        //JoueurDTO j = new JoueurDTO()
        return null;
    }

    public static void main(String[] args) {
        JoueurDTO j = new JoueurDTO(null,null,0,null,null,null);
    }
}
