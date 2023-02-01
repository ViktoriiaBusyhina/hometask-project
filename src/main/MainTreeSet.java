package main;

import classes.Company;

import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {

    public static void main(String[] args) {
        Company microsoft = new Company("Microsoft");
        Company google = new Company("Google");
        Company cdek = new Company("cdek");
        Company kfc = new Company("kfc");
        Company sap = new Company("sap");
        Company apple = new Company("apple");
        Company first = new Company("001");
        Company sevenUp = new Company("7UP");

        Company kfcc = new Company("kfc");

        Set<Company> set = new TreeSet<>();
        set.add(microsoft);
        set.add(google);
        set.add(cdek);
        set.add(kfc);
        set.add(kfcc);
        set.add(sap);
        set.add(apple);
        set.add(first);
        set.add(sevenUp);

        System.out.println(set);

    }

}
