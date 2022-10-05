// (DONE) a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
// (DONE) b. Класс Box в который можно складывать фрукты,
// (DONE) коробки условно сортируются по типу фрукта,
// (DONE) поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
// (DONE) c. Для хранения фруктов внутри коробки можете использовать ArrayList;
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

import java.util.ArrayList;
import java.util.List;

public class Lesson010Task01 {

    public static void main(String[] args) {

        List<Fruit> fruits = new ArrayList<>();

        fruits.add(new Apple());
        fruits.add(new Apple());
        fruits.add(new Apple());
        fruits.add(new Apple());
        fruits.add(new Apple());

        fruits.add(new Orange());
        fruits.add(new Orange());
        fruits.add(new Orange());
        fruits.add(new Orange());
        fruits.add(new Orange());

        Box<Apple> box1 = new Box<>(0.5f, 10);
        System.out.println(box1.boxWeight());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        System.out.println(box1.boxWeight());
    }

}
