package org.example;

public class SpielRegeln {

    public Zelle regeln(Zelle zelle, int lebendeNachbarn) {
        if (zelle.leben()) {
            if (lebendeNachbarn == 2 || lebendeNachbarn == 3) {
                return new ZelleLebend();
            } else {
                return new ZelleTot();
            }
        } else {
            if (lebendeNachbarn == 3) {
                return new ZelleLebend();
            } else {
                return new ZelleTot();
            }
        }
    }
}
