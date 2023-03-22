package main;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegex {

    public static void main(String[] args) {
        String str = "+7-932-438-55-37";

        Pattern pattern = Pattern.compile("[()-]|(\\+7)?");
        Matcher matcher = pattern.matcher(str);

        str = matcher.replaceAll("");
        System.out.println(str);


        //String answer = matcher.replaceAll("0");
        //System.out.println(answer);

        //String[] result = pattern.split(str);
//
        //System.out.println(Arrays.toString(result));
//
        //int count = 0;
        //while (matcher.find()) {
        //    System.out.println(matcher.group());
        //    count++;
        //}
//
        //System.out.println(matcher.matches());
//
//
        //System.out.println(count);





        //System.out.println(str);
        //String result = str.replaceAll("[0-9]+", "{тут было число}");
        //String[] strings = str.split("\\\\");
//
        //str.split("привет");
//
        //System.out.println(Arrays.toString(strings));
        //System.out.println(result);
    }
}
