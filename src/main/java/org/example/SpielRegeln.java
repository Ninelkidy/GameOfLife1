package org.example;

public class SpielRegeln {

    public SpielRegeln() {

    }

    public boolean regeln(boolean lebt, int lebendeNachbarn) {
        if (lebt) {
            // Live cell survives if it has 2 or 3 live neighbors, otherwise dies
            if (lebendeNachbarn == 2 || lebendeNachbarn == 3) {
                return true;
            } else {
                return false;
            }
        } else {
            // Dead cell becomes alive only if it has exactly 3 live neighbors
            if (lebendeNachbarn == 3) {
                return true;
            } else {
                return false;
            }
        }
    }
}
