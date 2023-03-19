package main;

import classes.Person;
import classes.Sex;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {

    public static void main(String[] args) throws IOException {
        File file = new File("resources/names.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        File outputFile = new File("resources/out.txt");
        FileWriter fileWriter = new FileWriter(outputFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        Random random = new Random();

        List<Person> people = new ArrayList<>();

        String name = "";
        while (name != null) {
            name = bufferedReader.readLine();
            if (name != null) {
                Person person = new Person();
                person.setName(name);
                person.setYears(random.nextInt(0, 80));
                if (random.nextBoolean()) {
                    person.setSex(Sex.MALE);
                }
                else {
                    person.setSex(Sex.FEMALE);
                }
                people.add(person);
                bufferedWriter.write(person.toString());
                bufferedWriter.newLine();
            }
        }

        bufferedWriter.close();
        bufferedReader.close();
        fileWriter.close();
        fileReader.close();




        //List<Person> answer = people
        //        .stream()
        //        .filter(person -> person.getSex().equals(Sex.MALE))
        //        .filter(person -> person.getYears() < 18)
        //        .toList();
//
        //System.out.println(answer);

    }

}
