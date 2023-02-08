package classes;

import java.util.List;
import java.util.Set;

public class Worker extends Person implements AbleToCalculatePension {

    private static final int MONEY_PER_CHILD = 200;

    private double minSalary;
    private double maxSalary;

    private Month month;

    private List<Company> companyList;

    private Set<PensionFund> availablePensionFunds;

    public Set<PensionFund> getAvailablePensionFunds() {
        return availablePensionFunds;
    }

    public void setAvailablePensionFunds(Set<PensionFund> availablePensionFunds) {
        this.availablePensionFunds = availablePensionFunds;
    }

    //Не так давно мы делали в классе Worker метод, который рассчитывает пенсию.
    //Для расчета пенсии использовался "хардкодинг", когда мы прямо в методе создавали непонятный пенсионный фонд. Сегодня от этого откажемся.
    //
    //1) Добавить в класс Worker поле - множество (Set) из Пенсионных фондов.
    //2) Добавить для него гетер и сетер
    //3) в методе расчета пенсии взять Set из пенсионных фондов и для каждого из них посчитать возможную пенсию, выбрать наиболее выгодное предложение и вернуть (return) из этого метода именно самое лучшее предложение (там, где больше всего заплатят). (как это реализовать - полностью на вашей совести)
    //4) Создать в Main несколько работников и несколько сетов из пенсионных фондов. Заполнить каждому работнику доступные ему пенсионный фонды (см. пункт 1)
    //5) запустить расчет пенсии

    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public List<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<Company> companyList) {
        this.companyList = companyList;
    }

    public void infoAboutCompanies() {
        System.out.print("Я работал в следующих компаниях: ");
        boolean start = true;

        for (Company company : companyList) {
            if (start) {
                System.out.print(company.getName());
                start = false;
            }
            else {
                System.out.print(", " + company.getName());
            }
        }
    }

    public void setNewSalary() {
        //classes.Sex sex = getSex();
//
        //switch (sex) {
        //    case MALE:
        //        minSalary *= 1.5;
        //        maxSalary *= 1.5;
        //        break;
        //    case FEMALE:
        //        minSalary *= 1.6;
        //        maxSalary *= 1.6;
        //}

        //if (month.equals(classes.Month.DECEMBER)) {
        //    minSalary *= 10;
        //    maxSalary *= 10;
        //}
        //else if (month.equals(classes.Month.NOVEMBER)) {
        //    minSalary *= 2;
        //    maxSalary *= 2;
        //}
        //else if (month.equals(classes.Month.JANUARY)) {
        //    minSalary *= 1.1;
        //    maxSalary *= 1.1;
        //}
        //else {
        //    minSalary = 0;
        //    maxSalary = 0;
        //}


        //switch (month) {
        //    case DECEMBER:
        //        minSalary *= 10;
        //        maxSalary *= 10;
        //        break;
        //    case NOVEMBER:
        //        minSalary *= 2;
        //        maxSalary *= 2;
        //        break;
        //    case JANUARY:
        //        minSalary *= 1.1;
        //        maxSalary *= 1.1;
        //        break;
        //    default:
        //        minSalary *= 0;
        //        maxSalary *= 0;
        //        break;
//
        //}

        double number = month.getNumber();

        minSalary *= number;
        maxSalary *= number;

    }

    @Override
    public double requestFundToCalculatePension() {
        int years = getYears();
        int additionalSalary = 0;
        if (getChildren() != null) {
            additionalSalary = getChildren().size() * MONEY_PER_CHILD;
        }
        additionalSalary += minSalary;
        double maxPension = 0.0;
        for (PensionFund fund : availablePensionFunds) {
            double result = fund.calculatePension(years, additionalSalary, maxSalary);
            if (result > maxPension) {
                maxPension = result;
            }
        }

        return maxPension;
    }

    @Override
    public String toString() {
        return "classes.Worker{" +
                "minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                ", month=" + month +
                '}';
    }
}

