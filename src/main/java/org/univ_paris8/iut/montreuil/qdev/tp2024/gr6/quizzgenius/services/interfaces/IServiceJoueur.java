package org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.entities.dto.JoueurDTO;
import utiles.Enum.LangueEnum;
import utiles.exceptions.*;

public interface IServiceJoueur {

    public JoueurDTO ajouterJoueur(String pseudo, String prenom, int annee, String centreInteret, LangueEnum langue) throws ErreurSaisiesException, PseudoExistantException;
}
