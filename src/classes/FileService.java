package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.http.HttpRequest;

public class FileService {

    public String getFirstLineForFile(String fileName) {
        try {
            System.out.println("try");
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String answer = bufferedReader.readLine();
            return answer;
        }
        catch (IOException e) {
            System.out.println("catch");
            throw new RuntimeException();
        }
        finally {
            System.out.println("finally");
            //разрыв соединение
            //финально
        }

        //Пользователь с консоли вводит имя файла
        //Далее пользователь вводит строку

        //Записать в файл строку
        //ВАЖНО: обработать исключения

        //Доп. задача - добавить блок finally, в нем любое сообщение на экран
    }

}
