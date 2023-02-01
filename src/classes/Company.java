package classes;

public class Company implements Comparable<Company> {

    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
