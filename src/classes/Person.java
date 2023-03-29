package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person implements Comparable<Person> {

    //1) Добавьте класс-утилиту для нахождения среднего значения
    //а) метод, в который как параметры приходят 2 числа и возвращает среднее значение
    //б) метод, в который приходит 3 числа и он возвращает среднее значение

    private String name;
    private int years;
    private int height;
    private double weight;

    private Person mom;

    private Person dad;

    private List<Person> children;

    private Sex sex;

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }



    public Person() {

    }

    public Person(String name, int years, Sex sex) {
        this.name = name;
        this.years = years;
        this.sex = sex;
    }

    //1) Реализовать интерфейс comparable для класса Person
    //
    //2) Реализация должна быть такой:
    //сравниваются имена по длине, если имена равны, тогда сравнение идет через возраст.
    //
    //3) В классе Company добавить поле holidays типа Map<String, String>.
    // Для него добавить геттер и сеттер. Записывать в него праздничные дни.
    // Например "Новый год" -"31 декабря". Для двух компаний составить разные списки праздников

    public Person(String name, int years, int height, double weight) {
        this.name = name;
        this.years = years;
        this.height = height;
        this.weight = weight;
    }

    public void getInfo() {
        System.out.println(name + height + weight + years);
    }

    public void goToWork() {
        System.out.println("Я иду на работу");
    }
    //() -> System.out.println("Я иду на работу");

    public void die() {
        System.out.println("Непонятно что произошло, но кто-то умер");
    }

    public void infoAboutChildren() {
        int counter = 0;
        System.out.println("У меня " + children.size() + " детей");
        for (Person child : children) {
            counter++;
            System.out.println(counter + ") " + child.name);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (years != person.years) return false;
        if (height != person.height) return false;
        if (Double.compare(person.weight, weight) != 0) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + years;
        result = 31 * result + height;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", years=" + years +
                ", height=" + height +
                ", weight=" + weight +
                ", mom=" + mom +
                ", dad=" + dad +
                ", children=" + children +
                ", sex=" + sex +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        int firstNameLen = -1;
        int secondNameLen = -1;

        if (name != null) {
            firstNameLen = name.length();
        }

        if (o.name != null) {
            secondNameLen = o.name.length();
        }

        if (firstNameLen != secondNameLen) {
            return Integer.compare(firstNameLen, secondNameLen);
        }
        else {
            return Integer.compare(years, o.years);
        }
    }

    //(o) ->  {
    // int firstNameLen = name.length();
    //        int secondNameLen = o.name.length();
    //
    //        if (firstNameLen != secondNameLen) {
    //            return Integer.compare(firstNameLen, secondNameLen);
    //        }
    //        else {
    //            return Integer.compare(years, o.years);
    //        }}
}
