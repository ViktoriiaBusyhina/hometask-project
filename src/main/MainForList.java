package main;

import classes.PensionFund;
import classes.TypeOfFund;

import java.util.ArrayList;
import java.util.List;

public class MainForList {

    public static void main(String[] args) {
        PensionFund pensionFund = new PensionFund("Пенсионный фонд Берлина",  "16-01-2023", TypeOfFund.STATE);
        List<String> listOfCurrencies = List.of("Евро", "Доллар");

        //List<String> listOfCurrencies = new ArrayList<>();
        //listOfCurrencies.add("Евро");
        //listOfCurrencies.add("Доллар");

        pensionFund.setCurrencies(listOfCurrencies); //ef56

        List<String> filledList = pensionFund.getCurrencies(); //ef56

        System.out.println(filledList);

        filledList.add("Турецкая лира");

        List<String> secondFilledList = pensionFund.getCurrencies(); //ef56

        System.out.println(secondFilledList);

        secondFilledList.add("франк");
        filledList.add("франк");

        System.out.println(secondFilledList);
        System.out.println(filledList);

        List<String> a = new ArrayList<>();
        List<String> b = a;
        List<String> c = b;

        int y = 5;
        int x = 4;
        int z = y;


        List<TypeOfFund> list = new ArrayList<>();

        list.add(TypeOfFund.STATE);
        list.add(TypeOfFund.NOT_STATE);





    }


}
