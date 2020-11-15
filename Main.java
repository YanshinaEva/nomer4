package org.example;

import java.io.*;
import java.util.List;


public class Main{

    public static void main(String[] args) throws IOException {
        String csvFilePath = "foreign_names.csv";
        List <Person> persons = Read.readFromFile(csvFilePath);
        for(int i=0;i<persons.size();i++)
        {
            System.out.println(persons.get(i));
        }
    }
}



