// a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
// b. Класс Box в который можно складывать фрукты,
// коробки условно сортируются по типу фрукта,
// поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
// c. Для хранения фруктов внутри коробки можете использовать ArrayList;
// d. Сделать метод getWeight() который высчитывает вес коробки,
// зная количество фруктов и вес одного фрукта
// (вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
// e. Внутри класса коробка сделать метод compare,
// который позволяет сравнить текущую коробку с той,
// которую подадут в compare в качестве параметра,
// true - если их веса равны,
// false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
// f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку
// (помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами),
// соответственно в текущей коробке фруктов не остается,
// а в другую перекидываются объекты, которые были в этой коробке;
// g. Не забываем про метод добавления фрукта в коробку.

package com.gb.Lesson010;

public class Lesson010Task01 {

    public static void main(String[] args) {

        System.out.println("Коробка #1 (яблоки)".toUpperCase());
        Box<Apple> box1 = new Box<>(0.5f, 5);
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple()); // Не позволит добавить, т.к. вес превысит максимальный.
        //box1.addFruit(new Orange()); // Невозможно добавить, т.к. отличаются типы.
        System.out.printf("Текущий вес коробки: %.2f%n", box1.getWeight());

        System.out.println("Коробка #2 (яблоки)".toUpperCase());
        Box<Apple> box2 = new Box<>(0.5f, 5);
        box2.addFruit(new Apple());
        box2.addFruit(new Apple());
        System.out.printf("Текущий вес коробки: %.2f%n", box2.getWeight());

        System.out.println("Коробка #3 (апельсины)".toUpperCase());
        Box<Orange> box3 = new Box<>(0.5f, 10);
        box3.addFruit(new Orange());
        box3.addFruit(new Orange());
        box3.addFruit(new Orange());
        box3.addFruit(new Orange());
        box3.addFruit(new Orange());
        box3.addFruit(new Orange());
        System.out.printf("Текущий вес коробки: %.2f%n", box3.getWeight());

        System.out.println("Коробка #4 (апельсины)".toUpperCase());
        Box<Orange> box4 = new Box<>(0.5f, 10);
        box4.addFruit(new Orange());
        box4.addFruit(new Orange());

        // Сравниваем коробки
        System.out.println("Коробка #1 (яблоки) vs Коробка #3 (апельсины)");
        if (box1.compare(box3)) {
            System.out.println("Коробки одного веса");
        }
        else {
            System.out.println("Коробки отличаются по весу");
        }

        // Пересыпаем яблоки из коробки 1 в коробку 2
        System.out.println("Пересыпаем яблоки из коробки 1 в коробку 2");
        Box.moveContentsTo(box1, box2, box2.getMaxBoxWeight(), box2.getCurrentBoxWeight());
        System.out.println("Текущий вес коробки #1: " + box1.getWeight());
        System.out.println("Текущий вес коробки #2: " + box2.getWeight());

        // Пересыпаем содержимое коробки 1 (яблоки) в коробку 4 (апельсины)
        // Действие невозможно, т.к. типы отличаются
        //Box.moveContentsTo(box1, box4, box4.getMaxBoxWeight(), box4.getCurrentBoxWeight());
        //System.out.println(box2.getWeight());
        //System.out.println(box4.getWeight());

        // Пересыпаем яблоки из коробок 1 и 2 в одну большую коробку # 5
        System.out.println("Пересыпаем яблоки из коробок 1 и 2 в одну большую коробку");
        Box<Apple> box5 = new Box<>(0.5f, 10);
        Box.moveContentsTo(box1, box5, box5.getMaxBoxWeight(), box5.getCurrentBoxWeight());
        Box.moveContentsTo(box2, box5, box5.getMaxBoxWeight(), box5.getCurrentBoxWeight());
        System.out.println("Текущий вес коробки #1: " + box1.getWeight());
        System.out.println("Текущий вес коробки #2: " + box2.getWeight());
        System.out.println("Текущий вес коробки #5: " + box5.getWeight());

    }

}
