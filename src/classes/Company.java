package classes;

import java.util.Map;

public class Company implements Comparable<Company> {

    private String name;

    private Map<String, String> holidays;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getHolidays() {
        return holidays;
    }

    public void setHolidays(Map<String, String> holidays) {
        this.holidays = holidays;
    }

    @Override
    public int compareTo(Company o) {
        return name.compareTo(o.name);
        //0 - два объекта равны
        //<0, тогда наш изначальный объект "меньше"
        //>0, тогда наш изначальный объект "больше"
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }
}
