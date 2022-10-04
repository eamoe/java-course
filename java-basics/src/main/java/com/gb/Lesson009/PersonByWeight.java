package com.gb.Lesson009;

import org.jetbrains.annotations.NotNull;

public class PersonByWeight extends Person {

    public PersonByWeight(String name, int age, int weight, int height) {
        super(name, age, weight, height);
    }

    @Override
    public int compareTo(@NotNull Person o) {
        return Integer.compare(this.getWeight(), o.getWeight());
    }

}
