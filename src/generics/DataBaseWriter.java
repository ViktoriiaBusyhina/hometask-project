package generics;

public class DataBaseWriter<D> {
    private String database;
    private D value;

    public DataBaseWriter(String database, D value) {
        this.database = database;
        this.value = value;
    }

    public void save() {
        System.out.println("данные в " + database + " записаны, тип данных = " + value.getClass());
    }
}
