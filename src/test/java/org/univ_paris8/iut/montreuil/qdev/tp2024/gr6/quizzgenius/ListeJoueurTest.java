package org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius;

import org.junit.jupiter.api.Test;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.services.impl.ServiceJoueurImpl;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius.services.interfaces.IServiceJoueur;
import utiles.exceptions.ListeJoueursVideException;

import static org.junit.jupiter.api.Assertions.*;


public class ListeJoueurTest {
        @Test
        public void testListeVide() throws NullPointerException {
            JoueurImplTestAddMock mock = new JoueurImplTestAddMock();
            //IServiceJoueur mock = ServiceJoueurImpl.getInstance();
            assertThrows(ListeJoueursVideException.class, () -> {
                mock.listerJoueurs();
            });
        }


}
