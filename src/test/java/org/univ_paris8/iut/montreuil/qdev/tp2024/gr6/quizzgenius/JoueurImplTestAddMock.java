package org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.entities.dto.JoueurDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.services.interfaces.IServiceJoueur;
import utiles.Enum.LangueEnum;
import utiles.exceptions.ErreurSaisiesException;
import utiles.exceptions.ListeJoueursVideException;
import utiles.exceptions.PseudoExistantException;

import java.util.ArrayList;

public class JoueurImplTestAddMock implements IServiceJoueur {

    private ArrayList<String> pseudosExistants = new ArrayList<>();
    private ArrayList<JoueurDTO> listerJoueur = new ArrayList<>();

    @Override
    public JoueurDTO ajouterJoueur(String pseudo, String prenom, int annee, ArrayList<String> centreInteret, LangueEnum langue) throws ErreurSaisiesException, PseudoExistantException {
        if (pseudo == null || prenom == null || langue == null) {
            throw new ErreurSaisiesException("Pseudo, prénom et langue ne peuvent pas être null.");
        }
        if (pseudosExistants.contains(pseudo)) {
            throw new PseudoExistantException("Le pseudo existe déjà.");
        }
        if (!prenom.matches("[a-zA-Z-]+")) {
            throw new ErreurSaisiesException("Le prénom contient des caractères invalides.");
        }
        if (annee > 2024 || annee < 1900) {
            throw new ErreurSaisiesException("L'année de naissance est invalide.");
        }
        if (annee <= 0) {
            throw new ErreurSaisiesException("Année de naissance et ou langue ne peuvent pas être null ou non valides.");
        }
        if (centreInteret != null && !centreInteret.isEmpty()) {
            for (String interet : centreInteret) {
                if (interet.matches("^\\d+$")) {
                    throw new ErreurSaisiesException("Les centres d'intérêt ne doivent pas être uniquement composés de chiffres.");
                }
            }
        }
        pseudosExistants.add(pseudo);
        return new JoueurDTO(pseudo, prenom, annee, centreInteret, langue, null);
    }

    @Override
    public ArrayList<JoueurDTO> listerJoueurs() throws ListeJoueursVideException {
            if (listerJoueur.size() == 0) {
                    throw new ListeJoueursVideException("Erreur la liste de joueur est vide");
             }
            return null;
    }

}


