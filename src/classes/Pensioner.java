package classes;

public class Pensioner extends Person {

    private double pension;

    public Pensioner(String name, int years, int height, double weight, double pension) {
        super(name, years, height, weight);
        this.pension = pension;
    }

    @Override
    public void die() {
        System.out.println("и, что-то произошло....");
        super.die();
        System.out.println("Ага, вот так случилось!");

        int countOfChildren = 0;
        if (getChildren() != null) {
            countOfChildren = getChildren().size();
        }

        System.out.println("Зато у меня" + countOfChildren + "детей");

    }

    public void abc(int a) {
        System.out.println(a);
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    @Override
    public String toString() {
        return "classes.Pensioner{" +
                "pension=" + pension +
                '}';
    }
}
