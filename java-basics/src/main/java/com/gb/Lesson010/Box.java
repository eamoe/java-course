package com.gb.Lesson010;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Box<T extends Fruit> {

    private final float maxBoxWeight;
    private float currentBoxWeight;

    private ArrayList<Fruit> boxContents;

    public Box(float emptyBoxWeight, float maxBoxWeight) {
        this.maxBoxWeight = maxBoxWeight;
        this.currentBoxWeight = emptyBoxWeight;
        this.boxContents = new ArrayList<>();
    }

    public float boxWeight() {
        return this.currentBoxWeight;
    }

    public void addFruit(T fruit) {

        if ((this.currentBoxWeight + fruit.weight()) > this.maxBoxWeight) {
            System.out.println("Невозможно добавить еще один фрукт. Коробка полна!");
        }
        else {
            this.boxContents.add(fruit);
            currentBoxWeight += fruit.weight();
            System.out.printf("Фрукт добавлен (%s)%n", fruit.name());
        }

    }

}
