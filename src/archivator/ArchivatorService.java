package archivator;

import java.util.List;

public class ArchivatorService {

    public void printList(List<? extends Archivator> archivatorsList) {
        for (Archivator archivator : archivatorsList) {
            System.out.println(archivator);
        }
    }

    public void addToList(List<? super Archivator> archivatorsList) {
        archivatorsList.add(new RARArchivator());
    }
}
