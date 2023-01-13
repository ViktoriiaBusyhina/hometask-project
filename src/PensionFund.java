import java.util.Objects;

public class PensionFund {

    private static final double PENSION_COEFFICIENT = 0.02;
    private static final int AVERAGE_SALARY = 1500;

    private String name;
    private boolean isState;
    private final String date;

    public PensionFund(String name, boolean isState, String date) {
        this.name = name;
        this.isState = isState;
        this.date = date;
    }

    public double calculatePension(int age, double minSalary, double maxSalary) {
        double averageSalary;
        if (isState) {
            averageSalary = AverageUtils.average(minSalary, maxSalary);
        }
        else {
            averageSalary = AverageUtils.average(minSalary, maxSalary, AVERAGE_SALARY);
        }
        return averageSalary * age * PENSION_COEFFICIENT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PensionFund that = (PensionFund) o;

        if (isState != that.isState) return false;
        if (!Objects.equals(name, that.name)) return false;
        return Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (isState ? 1 : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "name='" + name + '\'' +
                ", isState=" + isState +
                ", date='" + date + '\'' +
                '}';
    }
}
