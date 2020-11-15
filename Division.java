package org.example;


public class Division {

    private final String name;
    private final int ID;

    public Division(String name, int ID) {

            this.ID = ID;
            this.name = name;
    }

    public String toString()
    {
            return ID + " " + name ;
    }
}

