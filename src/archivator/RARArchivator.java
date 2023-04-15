package archivator;

public class RARArchivator extends Archivator {

    @Override
    public void archive(String filename) {

        System.out.println("File Archivation: " + filename);
    }

    @Override
    public void dearchive(String filename) {
        System.out.println("File Dearchive: " + filename);
    }
}
