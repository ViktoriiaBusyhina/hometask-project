package classes;

public class Vacation {
    public int calculateVacationCost (int days, int people) {

        if (days >= 0 && people >=0 ){
            return days * people;
        }
        else {
            return 0;
        }

    }
}
