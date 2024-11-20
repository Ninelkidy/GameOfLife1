package org.example;

public class ZelleTot implements Board.Zelle {

        public static ZelleTot generateToteZelle() {

           ZelleTot toteZelle = new ZelleTot();
            return toteZelle;
        }

    @Override
    public boolean leben() {
        return false;
    }
}
