package org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.entities.dto.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.entities.dto.StatistiqueDTO;
import utiles.Enum.LangueEnum;
import utiles.exceptions.*;

import java.util.ArrayList;

public interface IJoueur {

    public JoueurDTO ajouterJoueur(String pseudo, String prenom, int anneeNaissance, ArrayList<String> centreInteret, LangueEnum langueEnum, StatistiqueDTO statistiques) throws ErreurSaisiesException, PseudoExistantException;
}
