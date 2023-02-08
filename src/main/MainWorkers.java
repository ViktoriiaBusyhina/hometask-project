package main;

import classes.PensionFund;
import classes.TypeOfFund;
import classes.Worker;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainWorkers {

    public static void main(String[] args) {
        //List<Worker> workers = new ArrayList<>();
        //
        //for (int i = 0; i < 1000; i++) {
            //    Worker worker = new Worker();
            //    worker.setName(String.valueOf(i));
            //    worker.setYears(i);
            //    worker.setMinSalary(i * 2);
            //    worker.setMaxSalary(i * 3);
            //
            //    workers.add(worker);
            //}
        //
        //System.out.println(workers);
        //
        //for (Worker worker : workers) {
            //    System.out.println("Меня зовут: " + worker.getName());
            //    double result = worker.requestFundToCalculatePension();
            //    System.out.println("и я получу пенсию в размере: " + result);
            //}

        Worker worker = new Worker();
        worker.setMinSalary(1000);
        worker.setMaxSalary(2000);
        worker.setYears(45);


        Set<PensionFund> set = new HashSet<>();

        PensionFund pensionFund = new PensionFund("Пенсионный фонд Берлина", "09-09-1703", TypeOfFund.STATE);
        set.add(pensionFund);

        PensionFund pensionFundSecond = new PensionFund("Пенсионный фонд Петьки", "07-02-2023", TypeOfFund.SCAM);
        set.add(pensionFundSecond);

        PensionFund pensionFundThird = new PensionFund("Deutch bank", "07-06-1978", TypeOfFund.NOT_STATE);
        set.add(pensionFundThird);

        worker.setAvailablePensionFunds(set);

        System.out.println(worker.requestFundToCalculatePension());





        //4) Создать в Main несколько работников и несколько сетов из пенсионных фондов. Заполнить каждому работнику доступные ему пенсионный фонды (см. пункт 1)
        //5) запустить расчет пенсии

    }
}
