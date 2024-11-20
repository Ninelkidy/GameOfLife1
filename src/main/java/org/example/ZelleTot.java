package org.example;

public class ZelleTot implements Grid.Zelle {

        public static ZelleTot generateToteZelle() {

           ZelleTot toteZelle = new ZelleTot();
            return toteZelle;
        }

    @Override
    public boolean leben() {
        return false;
    }
}
