package generics;

import classes.Person;

public class MainGenerics {
    // 1 уровень сложности: Создайте класс DataBaseWriter - класс, который
    // "записывает" что-то в базу данных (естественно, просто представим, что он так делает).
    //В нем будет одно поле типа String database - имя базы данных.
    //А второе поле Value - оно должно быть дженериком (без конкретного типа).
    //То есть смысл такой - когда хотим что-то сохранить в БД,
    // то создаем объект класса DatabaseWriter и указываем тип данных, которые хотим записать.
    //Добавьте в класс конструктор со всеми полями и метод save.
    //Этот метод save будет делать одно дело - просто писать на экран сообщение
    // "данные в бд записаны, тип данных = {тут нужно вывести тип данных}"
    //Для вывода типа данных можно воспользоваться методом getClass на объекте

    public static void main(String[] args) {
        DataBaseWriter<String> dataBaseWriter = new DataBaseWriter<>("Hi", "String");
        dataBaseWriter.save();

        DataBaseWriter<Integer> dataBaseWriter1 = new DataBaseWriter<>("Land", 12);
        dataBaseWriter1.save();

        Person person = new Person();
        DataBaseWriter<Person> dataBaseWriter3 = new DataBaseWriter<>("SQL", person );
        dataBaseWriter3.save();

    }



}
