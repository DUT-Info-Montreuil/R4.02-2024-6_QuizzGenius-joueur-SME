package org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius;

import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.entities.dto.JoueurDTO;
import utiles.Enum.LangueEnum;
import utiles.exceptions.ErreurSaisiesException;
import utiles.exceptions.PseudoExistantException;

import java.util.ArrayList;
import java.util.Arrays;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

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
    public void testAjoutJoueurAvecCaracteresSpeciauxDansPrenom() {
        JoueurImplTestAddMock mock = new JoueurImplTestAddMock();
        Exception exception = assertThrows(ErreurSaisiesException.class, () -> {
            mock.ajouterJoueur("JP", "Jea3n-P@ul", 2004, null, LangueEnum.Français);
        });
        String messageAttendu = "Le prénom contient des caractères invalides.";
        String messageActuel = exception.getMessage();
        assertTrue(messageActuel.contains(messageAttendu));
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
    @Test
    public void testAnneeNaissanceInvalide() {
        JoueurImplTestAddMock mock = new JoueurImplTestAddMock();
        assertThrows(ErreurSaisiesException.class, () -> {
            mock.ajouterJoueur("test", "Test", 2025, null, LangueEnum.Français);
        });
    }

    @Test
    public void testAjoutJoueurSansCentreInteret() throws ErreurSaisiesException, PseudoExistantException {
        JoueurImplTestAddMock mock = new JoueurImplTestAddMock();
        JoueurDTO joueur = mock.ajouterJoueur("testSansInteret", "Test", 2000, new ArrayList<>(), LangueEnum.Français);
        assertTrue(joueur.getCentreInteret().isEmpty());
    }
    @Test
    public void testAjoutJoueurAvecCentresInteret() throws ErreurSaisiesException, PseudoExistantException {
        JoueurImplTestAddMock mock = new JoueurImplTestAddMock();
        ArrayList<String> centres = new ArrayList<>(Arrays.asList("Code", "Jeu"));
        JoueurDTO joueur = mock.ajouterJoueur("testAvecInteret", "Test", 2000, centres, LangueEnum.Français);
        assertFalse(joueur.getCentreInteret().isEmpty());
        assertEquals(2, joueur.getCentreInteret().size());
    }
    @Test
    public void testLangueJoueur() throws ErreurSaisiesException, PseudoExistantException {
        JoueurImplTestAddMock mock = new JoueurImplTestAddMock();
        JoueurDTO joueur = mock.ajouterJoueur("testLangue", "Test", 2000, null, LangueEnum.English);
        assertEquals(LangueEnum.English, joueur.getLangue());
    }
    @Test
    public void testAjoutJoueurParametresNull() {
        JoueurImplTestAddMock mock = new JoueurImplTestAddMock();
        assertThrows(ErreurSaisiesException.class, () -> {
            mock.ajouterJoueur(null, null, 2000, null, null);
        });
    }
    @Test
    public void testAjout1000Joueurs() {
        JoueurImplTestAddMock mock = new JoueurImplTestAddMock();
        ArrayList<String> centres = new ArrayList<>(Arrays.asList("Code", "Jeu"));
        assertDoesNotThrow(() -> {
            for (int i = 0; i < 1000; i++) {
                mock.ajouterJoueur("Joueur" + i, "Test" , 2000, centres, LangueEnum.Français);
            }
        });
    }
    @Test
    public void testTypageCentreInteret() throws ErreurSaisiesException, PseudoExistantException {
        JoueurImplTestAddMock mock = new JoueurImplTestAddMock();
        ArrayList<String> centresInteret = new ArrayList<>(Arrays.asList("Programmation#C++", "Jeu 123"));
        JoueurDTO joueur = mock.ajouterJoueur("tst", "Test", 2015, centresInteret, LangueEnum.Français);
        assertTrue(joueur.getCentreInteret().contains("Programmation#C++"));
        assertTrue(joueur.getCentreInteret().contains("Jeu 123"));
    }
    @Test
    public void testCentresInteretUniquementChiffres() {
        JoueurImplTestAddMock mock = new JoueurImplTestAddMock();
        ArrayList<String> centresInteretInvalides = new ArrayList<>();
        centresInteretInvalides.add("6498");

        Exception exception = assertThrows(ErreurSaisiesException.class, () -> {
            mock.ajouterJoueur("pseudo", "prenom", 1985, centresInteretInvalides, LangueEnum.Français);
        });

        String messageAttendu = "Les centres d'intérêt ne doivent pas être uniquement composés de chiffres.";
        String messageActuel = exception.getMessage();
        assertTrue(messageActuel.contains(messageAttendu));
    }

}
