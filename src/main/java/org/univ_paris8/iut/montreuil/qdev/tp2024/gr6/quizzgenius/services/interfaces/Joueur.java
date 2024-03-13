package org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.entities.dto.JoueurDTO;
import utiles.exceptions.*;

public interface Joueur {

    public JoueurDTO ajouterJoueur(String prenom, String pseudo, int annee, String centreInteret, int langue) throws ErreurSaisiesException, PseudoExistantException;
}
