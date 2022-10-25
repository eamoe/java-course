package com.gb.Lesson015;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeminarTask02 {

    public static Map<String, Integer> fileReader(Path path) {

        List<String> lines;
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Map<String, Integer> map = new HashMap<>();
        for (String line: lines) {
            String[] strings = line.split("=");
            if (strings.length != 2) {
                throw new IllegalArgumentException("Incorrect string format " + line);
            }
            int value;
            try {
                value = Integer.parseInt(strings[1]);
            } catch (NumberFormatException e) {
                if (strings[1].equals("?")) {
                    value = strings[0].length();
                }
                else {
                    throw new IllegalArgumentException("Not a number " + strings[1]);
                }
            }
            map.put(strings[0], value);
        }

        return map;
    }

    public static void main(String[] args) {

        Path path = Paths.get("/Users/eugenemenski/java-course/java-basics/data.txt");
        Map<String, Integer> map = fileReader(path);
        System.out.println(map);

    }

}
