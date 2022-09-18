/* Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности. */

package com.gb;

import java.util.*;

public class Lesson005Task02 {

    public static LinkedHashMap<String, Integer> sortByValue(HashMap<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        list.forEach(e -> sortedMap.put(e.getKey(), e.getValue()));
        return sortedMap;
    }

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>(List.of(
            "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"));

        HashMap<String, Integer> map = new HashMap<>();
        LinkedHashMap<String, Integer> sortedMap;

        Iterator<String> it = employees.iterator();
        String[] employee;
        String firstName;
        String lastName;
        while (it.hasNext()) {
            employee = it.next().split(" ");
            firstName = employee[0];
            lastName = employee[1];

            if (map.containsKey(firstName)) {
                Integer count = map.get(firstName);
                count++;
                map.put(firstName, count);

            } else {
                map.put(firstName, 1);
            }
        }

        sortedMap = sortByValue(map);

        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println("Имя = " + entry.getKey() +
                ", количество повторений = " + entry.getValue());
        }
    }
}
