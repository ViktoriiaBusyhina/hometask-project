package main;

import classes.Person;
import classes.Sex;

import java.io.*;
import java.util.Arrays;

public class PersonCreator {

    public static void main(String[] args) throws IOException {
        File file = new File("resources/out.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String personString = "";
        while (personString != null) {
            personString = bufferedReader.readLine();
            if (personString != null) {
                String[] data = personString.split(" ");

                String name = data[0];
                int years = Integer.parseInt(data[1]);
                Sex sex = Sex.valueOf(data[2]);
                Person person = new Person(name, years, sex);





                //String[] splitedStringForName = personString.split("'");
                //String[] splitedStringForSex = personString.split("sex=");
                //String[] splitedStringForAge = personString.split("years=");
//
//
                //String notFinishedAge = splitedStringForAge[1];
                //String[] finalAgeSplit = notFinishedAge.split(",");
//
                //String age = finalAgeSplit[0];
                //String name = splitedStringForName[1];
                //String sex = splitedStringForSex[1].replace("}", "");






            }
        }
    }
}
