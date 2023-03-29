package classes;

import java.util.List;

public class CrowdService {

    public void findChildrenForListOfPerson(List<Person> personList) {
        for (Person person : personList) {
            person.infoAboutChildren();
        }
    }

}
