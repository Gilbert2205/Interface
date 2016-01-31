package com.company;

/**
 * Created by uitschool JV on 1/31/2016.
 */
public enum City {
    Kharkov(99999, 9999), Kiev(99999, 44444), Lvov(555555, 77777);

    private int terr, plowad;
    City(int terr, int plowad) {
        terr = terr;
        plowad = plowad;
    }

    public int getTerr() {
        return terr;
    }

    public int getPlowad() {
        return plowad;
    }
}

