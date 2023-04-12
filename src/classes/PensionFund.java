package classes;

import java.util.List;
import java.util.Objects;

public class PensionFund {

    private static final double PENSION_COEFFICIENT = 0.02;
    private static final int AVERAGE_SALARY = 1500;

    private String name;
    private final int date;

    private TypeOfFund type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public TypeOfFund getType() {
        return type;
    }

    public void setType(TypeOfFund type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", type=" + type +
                '}';
    }

    private List<String> currencies;

    public PensionFund(String name, int date, TypeOfFund type) {
        this.name = name;
        this.date = date;
        this.type = type;
    }

    public double calculatePension(int age, double minSalary, double maxSalary) {
        double averageSalary;
        switch (type) {
            case STATE:
                averageSalary = AverageUtils.average(minSalary, maxSalary);
                break;
            case NOT_STATE:
                averageSalary = AverageUtils.average(minSalary, maxSalary, AVERAGE_SALARY);
                break;
            case SCAM:
                averageSalary = 0;
                break;
            default:
                averageSalary = 0;
        }
        return averageSalary * age * PENSION_COEFFICIENT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PensionFund that = (PensionFund) o;
        return date == that.date && Objects.equals(name, that.name) && type == that.type && Objects.equals(currencies, that.currencies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, type, currencies);
    }

    public List<String> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<String> currencies) {
        this.currencies = currencies;
    }
}
