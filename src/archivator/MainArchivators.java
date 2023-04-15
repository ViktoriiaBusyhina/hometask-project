package archivator;

import java.util.ArrayList;
import java.util.List;

public class MainArchivators {

    public static void main(String[] args) {
        ZIPArchivator zipArchivator = new ZIPArchivator();
        zipArchivator.archive("Hello");


        RARArchivator rarArchivator = new RARArchivator();
        rarArchivator.dearchive("Cat");

        List<Archivator> archivators = new ArrayList<>();
        archivators.add(zipArchivator);
        archivators.add(rarArchivator);


        ArchivatorService archivatorService = new ArchivatorService();
        archivatorService.printList(archivators);
        archivatorService.addToList(archivators);

        System.out.println();

        archivatorService.printList(archivators);
    }
}
