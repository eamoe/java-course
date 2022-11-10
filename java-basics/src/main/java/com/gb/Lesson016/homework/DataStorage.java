package com.gb.Lesson016.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class DataStorage {
    public static void writeToFile(String folder, Person person) throws IOException {

        File filePath =  new File(folder + person.getLastName().toLowerCase() + ".txt");

        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            fileWriter.write(person.toString() + '\n');
        } catch (NullPointerException | FileNotFoundException e) {
            throw new FileException("File path \"" + filePath + "\" is not correct.", e);
        }

    }
}
