package archivator;

public abstract class Archivator {
    // 1 уровень сложности: Создайте абстрактный класс Archivator и два его наследника
    // ZIPArchivator и RARArchivator, добавьте метод archive и dearchive -
    // реализуете их по разному (достаточно просто вывести два разных сообщения для разных классов),
    // эти методы принимают один аргумент - строку, имя файла, который надо архивировать.
    //Следующий момент - сделать класс ArchivatorService и добавить в него два метода.
    //1) принимает лист из архиваторов и печает их на экран. Важно: используете тут знак ? И extends/super
    //2) принимает лист архиваторов и добавляет один любой новый архиватор в этот лист
    //Важно: используете тут знак ? И extends/super

    public abstract void archive(String filename);

    public abstract void dearchive(String filename);
}
