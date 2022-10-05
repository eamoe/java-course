package com.gb.Lesson010;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Box<T extends Fruit> {

    private final float maxBoxWeight;
    private final float emptyBoxWeight;
    private final ArrayList<T> boxContents;

    private final int quantity;

    public Box(float emptyBoxWeight, float maxBoxWeight) {
        this.maxBoxWeight = maxBoxWeight;
        this.emptyBoxWeight = emptyBoxWeight;
        this.boxContents = new ArrayList<>();
        this.quantity = 0;
    }

    public float getWeight() {
        float overallWeight = this.emptyBoxWeight;
        for (T fruit: this.boxContents) {
            overallWeight += fruit.weight();
        }
        return overallWeight;
    }

    public void addFruit(T fruit) {

        if ((getWeight() + fruit.weight()) > this.maxBoxWeight) {
            System.out.println("Невозможно добавить еще один фрукт. Коробка полна!");
        }
        else {
            this.boxContents.add(fruit);
            System.out.printf("Фрукт добавлен (%s)%n", fruit.name());
        }

    }

}
