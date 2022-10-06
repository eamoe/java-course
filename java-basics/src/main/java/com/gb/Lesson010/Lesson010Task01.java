// (DONE) a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
// (DONE) b. Класс Box в который можно складывать фрукты,
// (DONE) коробки условно сортируются по типу фрукта,
// (DONE) поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
// (DONE) c. Для хранения фруктов внутри коробки можете использовать ArrayList;
// (DONE) d. Сделать метод getWeight() который высчитывает вес коробки,
// (DONE) зная количество фруктов и вес одного фрукта
// (DONE) (вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
// (DONE) e. Внутри класса коробка сделать метод compare,
// (DONE) который позволяет сравнить текущую коробку с той,
// (DONE) которую подадут в compare в качестве параметра,
// (DONE) true - если их веса равны,
// (DONE) false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
// f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку
// (помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами),
// соответственно в текущей коробке фруктов не остается,
// а в другую перекидываются объекты, которые были в этой коробке;
// (DONE) g. Не забываем про метод добавления фрукта в коробку.

package com.gb.Lesson010;

import java.util.ArrayList;
import java.util.List;

public class Lesson010Task01 {

    public static void main(String[] args) {

        System.out.println("Коробка с яблоками".toUpperCase());
        Box<Apple> box1 = new Box<>(0.5f, 10);
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        System.out.printf("Текущий вес коробки: %.2f%n", box1.getWeight());

        System.out.println("Коробка с апельсинами".toUpperCase());
        Box<Orange> box2 = new Box<>(0.5f, 10);
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        System.out.printf("Текущий вес коробки: %.2f%n", box2.getWeight());

        if (box1.compare(box2)) {
            System.out.println("Коробки одного веса");
        }
        else {
            System.out.println("Коробки отличаются по весу");
        }

        Box<Orange> box3 = new Box<>(0.5f, 10);
        box3.addFruit(new Orange());
        Box.moveContentsTo(box1, box3);
        System.out.println(box1.getWeight());
        System.out.println(box3.getWeight());

    }

}
