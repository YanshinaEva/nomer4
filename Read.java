package org.example;


import java.io.*;
import java.util.*;

public class Read {

    public static List<Person> readFromFile(String csvFilePath) throws IOException {
        List<Person> persons = new ArrayList<>();
        BufferedReader read = new BufferedReader(new FileReader(csvFilePath));
        Map<String, Division> divisional = new HashMap<>();
        String line;
        Scanner scanner;
        int index =0;
        int ind = 100;
            while ((line = read.readLine()) != null) {
                Person tmp = new Person();
                scanner = new Scanner(line);
                scanner.useDelimiter(";");
                while (scanner.hasNext()) {
                    String data = scanner.next();
                    if (index == 0)
                        tmp.setId((data));
                    else if (index == 1)
                        tmp.setName(data);
                    else if (index == 2)
                        tmp.setGender(data);
                    else if (index == 3)
                        tmp.setBirtDate(data);
                    else if (index == 4){
                        if (!divisional.containsKey(data)) {
                            Division division= new Division(data,ind);
                            divisional.put(data, division);
                            ind++;}
                        tmp.setDivision(divisional.get(data));
                    }
                    else if (index == 5)
                        tmp.setSalary(data);
                    index++;
                }
                index = 0;
                persons.add(tmp);
            }
        return persons;
    }
}
