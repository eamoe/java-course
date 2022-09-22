// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации
// и выведет ноутбуки, отвечающие фильтру.
// Критерии фильтрации можно хранить в Map.
// Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения
// для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

package com.gb;

import java.util.*;

public class Lesson006Task01 {

    static Set<Laptop> fillLaptopsSet() {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop(1, "Acer", "Intel", "Windows", 128, 8, 14.9, "Grey"));
        laptops.add(new Laptop(2, "Asus", "AMD", "Windows", 64, 16, 15.9, "Gold"));
        laptops.add(new Laptop(3, "Acer", "Intel", "Windows", 256, 8, 21, "Pink"));
        laptops.add(new Laptop(4, "Lenovo", "Intel", "Windows", 128, 32, 20, "Grey"));
        laptops.add(new Laptop(5, "Apple", "M1", "macOS", 512, 16, 13.9, "Space Grey"));
        laptops.add(new Laptop(6, 64, 4));
        laptops.add(new Laptop(7, 128, 32));
        laptops.add(new Laptop(8, 256, 16));
        laptops.add(new Laptop(9, 512, 8));
        laptops.add(new Laptop(10, 1024, 4));
        return laptops;
    }

    static Map<String, Object> fillCriteriaMap() {

        List<Pair> criteriaMessages = new ArrayList<>();
        criteriaMessages.add(new Pair(0, "Производитель"));
        criteriaMessages.add(new Pair(1, "Процессор"));
        criteriaMessages.add(new Pair(2, "Операционная система"));
        criteriaMessages.add(new Pair(3, "Емкость жесткого диска"));
        criteriaMessages.add(new Pair(4, "Оперативная память"));
        criteriaMessages.add(new Pair(5, "Диагональ экрана"));
        criteriaMessages.add(new Pair(6, "Цвет"));

        Map<String, Object> criteria = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите параметры поиска или оставьте поле пустым".toUpperCase());
        for (Pair message : criteriaMessages) {
            System.out.print(message.getValue() + ": ");
            String userInput = scanner.nextLine();
            switch (message.getKey()) {
                case 0:
                    criteria.put("manufacturer", userInput);
                    break;
                case 1:
                    criteria.put("processor", userInput);
                    break;
                case 2:
                    criteria.put("operatingSystem", userInput);
                    break;
                case 3:
                    int hdd;
                    if (userInput.isBlank()) {
                        hdd = 0;
                    }
                    else {
                        hdd = Integer.parseInt(userInput);
                    }
                    criteria.put("hdd", hdd);
                    break;
                case 4:
                    int ram;
                    if (userInput.isBlank()) {
                        ram = 0;
                    }
                    else {
                        ram = Integer.parseInt(userInput);
                    }
                    criteria.put("ram", ram);
                    break;
                case 5:
                    double screenDiagonal;
                    if (userInput.isBlank()) {
                        screenDiagonal = 0.0;
                    }
                    else {
                        screenDiagonal = Double.parseDouble(userInput);
                    }
                    criteria.put("screenDiagonal", screenDiagonal);
                    break;
                case 6:
                    criteria.put("color", userInput);
                    break;
            }
        }

        return criteria;
    }

    public static void main(String[] args) {

        Set<Laptop> laptops = fillLaptopsSet();

        Map<String, Object> criteria = fillCriteriaMap();

        //System.out.println("Ноутбуки".toUpperCase());
        //System.out.println(laptops);

        //System.out.println("Критерии".toUpperCase());
        //criteria.forEach((key, value) -> System.out.println(key + ":" + value));

        String manufacturer = criteria.get("manufacturer").toString();
        String processor = criteria.get("processor").toString();
        String operatingSystem = criteria.get("operatingSystem").toString();
        int hdd = Integer.parseInt(criteria.get("hdd").toString());
        int ram = Integer.parseInt(criteria.get("ram").toString());
        double screenDiagonal = Double.parseDouble(criteria.get("screenDiagonal").toString());
        String color = criteria.get("color").toString();
        Laptop targetLaptop = new Laptop(
            manufacturer,
            processor,
            operatingSystem,
            hdd,
            ram,
            screenDiagonal,
            color);

        Set<Laptop> treeLaptops = new TreeSet<>(laptops);
        boolean foundResults = false;
        for (Laptop treeLaptop : treeLaptops) {
            if (treeLaptop.compareTo(targetLaptop) >= 0) {
                System.out.println(treeLaptop);
                foundResults = true;
            }
        }
        if (!foundResults) {
            System.out.println("Ничего не найдено!");
        }
    }
}
