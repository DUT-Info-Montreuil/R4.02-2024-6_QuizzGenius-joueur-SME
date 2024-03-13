package org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius;

import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.entities.dto.JoueurDTO;
import utiles.exceptions.ErreurSaisiesException;
import utiles.exceptions.PseudoExistantException;

import static junit.framework.Assert.assertEquals;

public class CreerJoueurTest {

    @Test
    public void testPseudoJoueur() throws ErreurSaisiesException, PseudoExistantException {

        JoueurImplTestAddMock j = new JoueurImplTestAddMock();
        JoueurDTO j2 = j.ajouterJoueur("ali",null,2000,null,null);

        assertEquals("ali", j2.getPseudo());

    }

}
