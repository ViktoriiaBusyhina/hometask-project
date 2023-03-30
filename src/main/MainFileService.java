package main;

import classes.FileService;

public class MainFileService {

    public static void main(String[] args) {
        FileService fileService = new FileService();
        String str1 = fileService.getFirstLineForFile("src/main/MainFileService.java");
        String str2 = fileService.getFirstLineForFile("src/mainFileServiceva");

        System.out.println(str1);
        System.out.println(str2);
    }
}
