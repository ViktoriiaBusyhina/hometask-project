package main;


import classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //classes.PensionFund statePensionFund = new classes.PensionFund("Goverment", true, "23-08-1989");
        //classes.PensionFund notStatePensionFund = new classes.PensionFund("New-York lions bank", false, "23-09-2009");
        //classes.PensionFund notStatePensionFund1 = new classes.PensionFund("New-York lions bank", false, "23-09-2009");
//
        //double statePension = statePensionFund.calculatePension(40, 1500.0, 2800.0);
        //double notStatePension = notStatePensionFund.calculatePension(40, 1500.0, 2800.0);
//
        //System.out.println(statePensionFund.hashCode());
        //System.out.println(notStatePensionFund.hashCode());
//
        //String str = "qwerty2";
        //String str1 = "qwerty2";
//
        //System.out.println(str.hashCode());
        //System.out.println(str.hashCode());
        //System.out.println(str.hashCode());
        //System.out.println(str.hashCode());
        //System.out.println(str.hashCode());
        //System.out.println(str.hashCode());
        //System.out.println(str.hashCode());
        //System.out.println(str.hashCode());
        //System.out.println(str.hashCode());
        //
//
        //System.out.println(str.equals(str1));
//
        //System.out.println(notStatePensionFund.equals(str1));
//
        //System.out.println(statePensionFund);
//
        //classes.Pensioner daniil = new classes.Pensioner("Daniil", 45, 67, 2.4, 7.8);
        //classes.Pensioner daniil1 = new classes.Pensioner("Daniil", 45, 67, 2.4, 1000000);
//
        //System.out.println(daniil.equals(daniil1));
//
        //System.out.println(daniil.getYears());
        //System.out.println(daniil.getPension());
        //System.out.println(daniil.getHeight());
//
        //System.out.println(daniil);
        //daniil.die();
//
        //classes.Person person1 = new classes.Person("Daniil", 45, 34, 2.0);

        //classes.Worker worker = new classes.Worker();
        //worker.setMonth(classes.Month.JULY);
        //worker.setSex(classes.Sex.MALE);

        //classes.Worker worker = new classes.Worker();
//
        //worker.setMinSalary(1500);
        //worker.setMaxSalary(1800);
        //worker.setMonth(classes.Month.DECEMBER);
//
        //System.out.println(Arrays.toString(classes.Month.values()));
//
        //classes.Month[] months = classes.Month.values();
        //System.out.println(months[4]);
//
        //classes.Month feb = classes.Month.valueOf("FEBRUARY");
        //System.out.println(feb.getNumber());
//
//
        //worker.setNewSalary();
//
        //System.out.println(worker.getMinSalary());
        //System.out.println(worker.getMaxSalary());
//
//
        //worker.setMinSalary(1000);
        //worker.setMaxSalary(2000);
        //worker.setYears(50);
//
        //double answer = worker.requestFundToCalculatePension();
        //System.out.println(worker + ", твоя пенсия составит $:");
        //System.out.println(answer);


        //System.out.println(classes.Month.APRIL.getNumber());
        //System.out.println(classes.Month.DECEMBER.getNumber());
        //System.out.println(classes.Month.NOVEMBER.getNumber());

        //1) Создать интерфейс classes.AbleToCalculatePension с одним методом calculatePension, возвращающим дробное число
        //
        //2) класс classes.Worker должен реализовать этот интерфейс (implements). реализация метода выглядит так:
        //
        //а) Внутри метода создается объект класса Пенсионный фонд (из дз от 14 декабря). В нем вызывается метод расчета пенсии, в него передаются параметры: возраст, минимальная, максимальная зарплаты. Результат этого метода возвращается из метода calculatePension



        //20-52

        PensionFund pensionFund = new PensionFund("Пенсионный фонд Берлина",  "16-01-2023", TypeOfFund.STATE);











        //контракт equals и хэшкода

        //Если объекты равны, то их хэшкоды равны
        //Если объекты не равны, то их хэшкоды могут быть равны (из-за коллизиции), а могут быть и не равны

        //если хэшкоды равны - это не о чем не говорит
        //если хэшкоды не равны - это однозначно значит, что объекты тоже не равны


        //хэшкод возвращал разные значения для разных объектов
        //сколько раз хэшкод не вызывай - получится одиковое значение
        //у одинаковых объектов олжен быть 100% одинаковый хэшкод

        //У вас есть класс classes.Person.
        //
        //1) Сделать его правильным - создать геттеры и сеттеры, проверить, что он соответствует тем правилам, которые мы с вами обсуждали.
        //
        //2) Создать классы classes.Pensioner и classes.Worker. Унаследовать их от класса classes.Person. В класс classes.Pensioner добавить дробное поле pension, в класс classes.Worker добавить два поля minSalary и maxSalary.
        //
        //3) Класс classes.Person превращаем в абстрактный. В него добавляем абстрактный метод die(), которая ничего не возвращает.
        //
        //4) В classes.Worker реализуем этот метод таким образом: пишем на экран сообщение "Этот человек не дожил до пенсии"
        //
        //5) В классе classes.Pensioner реализуем так: пишем на экран "Этот пенсионер умер, он заработал: x". Где вместо x нужно рассчитать значение по формуле "(age-50)*pension"


        //У вас в прошлом уроке было создано поле для детей, заполните через сеттер это поле для каждого созданного в Main работника. Добавьте по 3-4 ребенка каждому.
        //
        //Теперь необходимо добавить в класс Person метод, который будет выводить инфо о детях в таком формате (на экран):
        //У меня x детей
        //1) Петя
        //2) Вася
        //...
        //
        //Как это реализовать?
        //нужно циклом foreach пройтись по всем детям, получая их имена
        //
        //Далее, в класс Worker тоже необходимо добавить новое поле:
        //List<Company> - список из компаний, в которых работал человек.
        //
        //В класс воркер добавить метод, который пишет подобную строку на экран при вызове:
        //
        //"Я работал в следующих компаниях: a, b, c, d". где вместо букв названия компаний из класса company

        Worker worker = new Worker();

        List<Person> children = new ArrayList<>();

        Worker firstChild = new Worker();
        firstChild.setName("Антон");

        Worker secondChild = new Worker();
        secondChild.setName("Павел");

        children.add(firstChild);
        children.add(secondChild);

        worker.setChildren(children);

        worker.infoAboutChildren();

        Company microsoft = new Company("Microsoft");
        Company google = new Company("Google");
        //List<Company> companyList = List.of(microsoft, google);

        List<Company> companyList = new ArrayList<>();
        companyList.add(microsoft);
        companyList.add(google);

        worker.setCompanyList(companyList);


    }
}