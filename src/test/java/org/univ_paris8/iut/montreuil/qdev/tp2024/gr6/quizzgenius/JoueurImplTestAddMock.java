package org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.entities.dto.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.services.interfaces.IServiceJoueur;
import utiles.Enum.LangueEnum;
import utiles.exceptions.ErreurSaisiesException;
import utiles.exceptions.PseudoExistantException;

import java.util.ArrayList;

    public class JoueurImplTestAddMock implements IServiceJoueur {

        private ArrayList<String> pseudosExistants = new ArrayList<>();

        @Override
        public JoueurDTO ajouterJoueur(String pseudo, String prenom, int annee, ArrayList<String> centreInteret, LangueEnum langue) throws ErreurSaisiesException, PseudoExistantException {
            if (pseudosExistants.contains(pseudo)) {
                throw new PseudoExistantException("Le pseudo existe déjà.");
            }
            pseudosExistants.add(pseudo);
            return new JoueurDTO("ali", "boudj", 2020, null,LangueEnum.Français, null);
        }
    }


