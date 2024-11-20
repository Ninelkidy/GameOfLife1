package org.example;

public class ZelleLebend implements Grid.Zelle {

        public static ZelleLebend generateLebendeZelle() {

            ZelleLebend lebendeZelle = new ZelleLebend();
            return lebendeZelle;
        }

    @Override
    public boolean leben() {
        return true;
    }
}


