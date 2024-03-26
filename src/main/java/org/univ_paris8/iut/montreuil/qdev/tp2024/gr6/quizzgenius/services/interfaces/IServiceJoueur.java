package org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.entities.dto.JoueurDTO;
import utiles.Enum.LangueEnum;
import utiles.exceptions.*;

import java.util.ArrayList;

public interface IServiceJoueur {

    public JoueurDTO ajouterJoueur(String pseudo, String prenom, int annee, ArrayList<String> centreInteret, LangueEnum langue) throws JoueurException;

    public ArrayList<JoueurDTO> listerJoueurs() throws JoueurException;
}
