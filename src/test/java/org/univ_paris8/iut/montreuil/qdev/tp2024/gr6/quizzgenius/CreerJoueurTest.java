package org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius;

import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.entities.dto.JoueurDTO;
import utiles.Enum.LangueEnum;
import utiles.exceptions.ErreurSaisiesException;
import utiles.exceptions.PseudoExistantException;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CreerJoueurTest {

    @Test
    public void testPseudoPrenomJoueur() throws ErreurSaisiesException, PseudoExistantException {

        JoueurImplTestAddMock j = new JoueurImplTestAddMock();
        JoueurDTO j2 = j.ajouterJoueur("ali", "boudj", 2020, null, LangueEnum.Français);

        assertEquals("ali", j2.getPseudo());
        assertNotEquals("123", j2.getPseudo());
        assertEquals("boudj", j2.getPrenom());

    }

    @Test
    public void testAjoutDeuxMemePseudo() throws ErreurSaisiesException, PseudoExistantException {
        JoueurImplTestAddMock j1 = new JoueurImplTestAddMock();
        j1.ajouterJoueur("ali", "boudj", 2020, null, LangueEnum.Français);

        JoueurImplTestAddMock j2 = new JoueurImplTestAddMock();
        j2.ajouterJoueur("ali", "boudj", 2020, null, LangueEnum.Français);

        assertThrows(PseudoExistantException.class, () -> {
            j2.ajouterJoueur("ali", "boudj", 1999, null, LangueEnum.Français);
        });


    }


}
