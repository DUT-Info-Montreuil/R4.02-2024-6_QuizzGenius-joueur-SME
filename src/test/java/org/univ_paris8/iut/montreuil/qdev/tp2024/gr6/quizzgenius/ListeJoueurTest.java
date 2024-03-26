package org.univ_paris8.iut.montreuil.qdev.tp2024.gr6.quizzgenius;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ListeJoueurTest {
        @Test
        public void testListeVide() throws NullPointerException {
            JoueurImplTestAddMock mock = new JoueurImplTestAddMock();
            assertThrows(NullPointerException.class, () -> {
                mock.listerJoueurs();
            });
        }


}
