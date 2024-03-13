package org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.entities.dto.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.entities.dto.StatistiqueDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.services.interfaces.IJoueur;
import utiles.Enum.LangueEnum;
import utiles.exceptions.ErreurSaisiesException;
import utiles.exceptions.PseudoExistantException;

import java.util.ArrayList;

public class JoueurImplTestAddMock implements IJoueur {

    @Override
    public JoueurDTO ajouterJoueur(String pseudo, String prenom, int anneeNaissance, ArrayList<String> centreInteret, LangueEnum langueEnum, StatistiqueDTO statistiques) throws ErreurSaisiesException, PseudoExistantException {
        return null;
    }
}
