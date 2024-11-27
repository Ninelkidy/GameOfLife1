import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    public void randomZellenTest() {
        int anzahlRandomZellen = 10;
        Board board = new Board(true, anzahlRandomZellen);

        int lebendezellen = 0;
        for (int x = 0; x < board.board.length; x++) {
            for (int y = 0; y < board.board[x].length; y++) {
                if (board.board[x][y].leben()) {
                    lebendezellen++;
                }
            }
        }

        assertEquals(anzahlRandomZellen, lebendezellen, "Stimmti nichti");
    }

    @Test
    public void spielregelnTest() {
        SpielRegeln regeln = new SpielRegeln();
        Zelle lebendeZelle = new ZelleLebend();


        Zelle ergebnis = regeln.regeln(lebendeZelle, 1);
        assertFalse(ergebnis.leben(), "Muss sterben");

        ergebnis = regeln.regeln(lebendeZelle, 2);
        assertTrue(ergebnis.leben(), "Muss leben");

        ergebnis = regeln.regeln(lebendeZelle, 3);
        assertTrue(ergebnis.leben(), "Muss leben");

        ergebnis = regeln.regeln(lebendeZelle, 4);
        assertFalse(ergebnis.leben(), "Muss sterben");

        Zelle toteZelle = new ZelleTot();

        ergebnis = regeln.regeln(toteZelle, 1);
        assertFalse(ergebnis.leben(), "Muss sterben");

        ergebnis = regeln.regeln(toteZelle, 2);
        assertFalse(ergebnis.leben(), "Muss sterben");

        ergebnis = regeln.regeln(toteZelle, 3);
        assertTrue(ergebnis.leben(), "Muss leben");

        ergebnis = regeln.regeln(toteZelle, 4);
        assertFalse(ergebnis.leben(), "Muss sterben");
    }

    ;


}
