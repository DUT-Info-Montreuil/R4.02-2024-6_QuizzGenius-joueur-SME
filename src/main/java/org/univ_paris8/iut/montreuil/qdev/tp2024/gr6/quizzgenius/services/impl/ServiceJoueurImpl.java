package org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.services.impl;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.entities.dto.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.services.interfaces.IServiceJoueur;
import utiles.Enum.LangueEnum;
import utiles.exceptions.ErreurSaisiesException;
import utiles.exceptions.PseudoExistantException;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class ServiceJoueurImpl implements IServiceJoueur {
    private static ServiceJoueurImpl uniqueInstance = null;

    private ArrayList<JoueurDTO> joueurs;

    private ServiceJoueurImpl() {
        joueurs = new ArrayList<JoueurDTO>();
    }

    public static ServiceJoueurImpl getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ServiceJoueurImpl();
        }
        return uniqueInstance;
    }

    @Override
    public JoueurDTO ajouterJoueur(String pseudo, String prenom, int annee, ArrayList<String> centreInteret, LangueEnum langue) throws ErreurSaisiesException, PseudoExistantException {

        if (pseudo == null || prenom == null || centreInteret == null || langue == null){
            throw new NullPointerException("L'un des paramètres est null");
        }

            for (Character c : prenom.toCharArray()) {
                if (!Character.isLetter(c) && !Character.isSpaceChar(c)) {
                    throw new ErreurSaisiesException("Le prénom contient des caractères invalides.");
                }
            }


        for (String centreInter : centreInteret) {
            for (Character c : centreInter.toCharArray()) {
                if (!Character.isLetter(c) && !Character.isDigit(c) && !Character.isSpaceChar(c)) {
                    throw new ErreurSaisiesException("Erreur le centre d'intérêts : " + centreInter + ", contient le caractère : " + c + " qui est invalide");
                }
            }
        }


        for (int i = 0; i < centreInteret.size(); i++) {
            for (int j = i + 1; j < centreInteret.size(); j++) {
                if (centreInteret.get(i).equals(centreInteret.get(j)) && i != j) {
                    throw new ErreurSaisiesException("Erreur, le centre d'intérêt: " + centreInteret.get(i) + " est dupliqué.");
                }
            }
        }


        if (annee < 1924) {
            throw new ErreurSaisiesException("Erreur l'année de naissance doit être positive et supérieur à 1923");
        }

        JoueurDTO joueur = new JoueurDTO(pseudo, prenom, annee, centreInteret, langue, null);

        if (joueurs.contains(joueur))
            throw new PseudoExistantException("Ce pseudo est déja pris par quelqu'un");

        joueurs.add(joueur);
        return joueur;
    }


}
