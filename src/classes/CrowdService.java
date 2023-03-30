package classes;

import java.util.ArrayList;
import java.util.List;

public class CrowdService {

    public void findChildrenForListOfPerson(List<Person> personList) {
        if (personList == null) {
            return;
        }

        personList.add(new Person());

        for (Person person : personList) {
            if (person != null) {
                person.infoAboutChildren();
            }
        }
    }

    public void findChildrenForListOfPersonSecond(List<?> personList) {

        for (Object o : personList) {
            System.out.println(o);
        }
    }

    public void findChildrenForListOfPersonThird(List<? extends Person> personList) {

        for (Person person : personList) {
            person.infoAboutChildren();
        }
    }

    public void findChildrenForListOfPersonFourth(List<? super Person> personList) {
        personList.add(new Person());
        personList.add(new Worker());
        personList.add(new Pensioner("1", 1, 1, 20.0, 20.0));
    }

    //2 метода - в новом классе

    //1) добавляет в Лист из параметров метода 3 новых объекта типа Pensioner
    //2) метод, который из листа в параметрах считывает объекты типа Worker и запускает на них рассчет пенсии
    //* 2-ой метод должен принимать Листы не только из воркеров, но и всех его наследников

}
