import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //PensionFund statePensionFund = new PensionFund("Goverment", true, "23-08-1989");
        //PensionFund notStatePensionFund = new PensionFund("New-York lions bank", false, "23-09-2009");
        //PensionFund notStatePensionFund1 = new PensionFund("New-York lions bank", false, "23-09-2009");
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
        //Pensioner daniil = new Pensioner("Daniil", 45, 67, 2.4, 7.8);
        //Pensioner daniil1 = new Pensioner("Daniil", 45, 67, 2.4, 1000000);
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
        //Person person1 = new Person("Daniil", 45, 34, 2.0);

        //Worker worker = new Worker();
        //worker.setMonth(Month.JULY);
        //worker.setSex(Sex.MALE);

        //Worker worker = new Worker();
//
        //worker.setMinSalary(1500);
        //worker.setMaxSalary(1800);
        //worker.setMonth(Month.DECEMBER);
//
        //System.out.println(Arrays.toString(Month.values()));
//
        //Month[] months = Month.values();
        //System.out.println(months[4]);
//
        //Month feb = Month.valueOf("FEBRUARY");
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


        //System.out.println(Month.APRIL.getNumber());
        //System.out.println(Month.DECEMBER.getNumber());
        //System.out.println(Month.NOVEMBER.getNumber());

        //1) Создать интерфейс AbleToCalculatePension с одним методом calculatePension, возвращающим дробное число
        //
        //2) класс Worker должен реализовать этот интерфейс (implements). реализация метода выглядит так:
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

        //У вас есть класс Person.
        //
        //1) Сделать его правильным - создать геттеры и сеттеры, проверить, что он соответствует тем правилам, которые мы с вами обсуждали.
        //
        //2) Создать классы Pensioner и Worker. Унаследовать их от класса Person. В класс Pensioner добавить дробное поле pension, в класс Worker добавить два поля minSalary и maxSalary.
        //
        //3) Класс Person превращаем в абстрактный. В него добавляем абстрактный метод die(), которая ничего не возвращает.
        //
        //4) В Worker реализуем этот метод таким образом: пишем на экран сообщение "Этот человек не дожил до пенсии"
        //
        //5) В классе Pensioner реализуем так: пишем на экран "Этот пенсионер умер, он заработал: x". Где вместо x нужно рассчитать значение по формуле "(age-50)*pension"
    }
}