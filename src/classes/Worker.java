package classes;

public class Worker extends Person implements AbleToCalculatePension {

    private static final int MONEY_PER_CHILD = 200;

    private double minSalary;
    private double maxSalary;

    private Month month;

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
        PensionFund pensionFund = new PensionFund("Пенсионный фонд Берлина",  "16-01-2023", TypeOfFund.STATE);
        int years = getYears();

        int additionalSalary = 0;

        if (getChildren() != null) {
            additionalSalary = getChildren().size() * MONEY_PER_CHILD;
        }

        additionalSalary += minSalary;

        double result = pensionFund.calculatePension(years, additionalSalary, maxSalary);
        return result;
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

