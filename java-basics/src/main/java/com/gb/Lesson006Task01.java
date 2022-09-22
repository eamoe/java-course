package com.gb;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Lesson006Task01 {
    public static void main(String[] args) {

        Set<Laptop> laptops = new HashSet<>();

        laptops.add(new Laptop(1, "Acer", "Intel", "Windows", 128, 8, 14.9, "Grey"));
        laptops.add(new Laptop(2, "Asus", "AMD", "Windows", 64, 16, 15.9, "Gold"));
        laptops.add(new Laptop(3, "Acer", "Intel", "Windows", 256, 8, 21, "Pink"));
        laptops.add(new Laptop(4, "Lenovo", "Intel", "Windows", 128, 32, 20, "Grey"));
        laptops.add(new Laptop(5, "Apple", "M1", "MacOS", 512, 16, 13.9, "Space Grey"));
        laptops.add(new Laptop(6, 64, 4));
        laptops.add(new Laptop(7, 128, 32));
        laptops.add(new Laptop(8, 256, 16));
        laptops.add(new Laptop(9, 512, 8));
        laptops.add(new Laptop(10, 1024, 4));

        System.out.println(laptops);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите параметры поиска или оставьте поле пустым:");
        System.out.println("Производитель: ");
        String manufacturer = scanner.nextLine();
        System.out.println("Процессор: ");
        String processor = scanner.nextLine();
        System.out.println("Операционная система: ");
        String operatingSystem = scanner.nextLine();
        System.out.println("Емкость жесткого диска: ");
        int hdd = Integer.parseInt(scanner.nextLine());
        System.out.println("Оперативная память: ");
        int ram = Integer.parseInt(scanner.nextLine());
        System.out.println("Диагональ экрана: ");
        double screenDiagonal = Double.parseDouble(scanner.nextLine());
        System.out.println("Цвет: ");
        String color = scanner.nextLine();

        Map<String, Object> criteria = new HashMap<>();
        criteria.put("manufacturer", manufacturer);
        criteria.put("processor", processor);
        criteria.put("operatingSystem", operatingSystem);
        criteria.put("hdd", hdd);
        criteria.put("ram", ram);
        criteria.put("screenDiagonal", screenDiagonal);
        criteria.put("color", color);

        for (String criterion: criteria.keySet()) {
            System.out.println("key=" + criterion + "value type=" + criteria.get(criterion));
        }
    }
}
