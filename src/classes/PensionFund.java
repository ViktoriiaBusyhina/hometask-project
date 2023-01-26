package classes;

import java.util.List;
import java.util.Objects;

public class PensionFund {

    private static final double PENSION_COEFFICIENT = 0.02;
    private static final int AVERAGE_SALARY = 1500;

    private String name;
    private final String date;

    private TypeOfFund type;

    private List<String> currencies;

    public PensionFund(String name, String date, TypeOfFund type) {
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

        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(date, that.date)) return false;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    public List<String> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<String> currencies) {
        this.currencies = currencies;
    }
}
