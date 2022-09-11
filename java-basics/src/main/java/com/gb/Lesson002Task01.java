/* Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
1 Расширение файла: txt
2 Расширение файла: pdf
3 Расширение файла:
4 Расширение файла: jpg */

package com.gb;

import java.io.File;

public class Lesson002Task01 {
    public static void main(String[] args) {

        File directory = new File("/Users/eugenemenski/Desktop/Unsorted/");

        File[] files = directory.listFiles();

        String message = "Расширение файла: ";
        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println(message + "");
                }
                else {
                    String extension = "";
                    int i = file.getName().lastIndexOf('.');
                    if (i >= 0) { // >= 0 чтобы отобразить, например, DS_Store
                        extension = file.getName().substring(i+1);
                    }
                    System.out.println(message + extension);
                }
            }
        }
    }
}
