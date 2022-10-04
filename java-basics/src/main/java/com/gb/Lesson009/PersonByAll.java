package com.gb.Lesson009;

import org.jetbrains.annotations.NotNull;

public class PersonByAll extends Person {

    public PersonByAll(String name, int age, int weight, int height) {
        super(name, age, weight, height);
    }

    @Override
    public int compareTo(@NotNull Person o) {
        if (this.getName().compareTo(o.getName()) == 0) {
            if (this.getAge() == o.getAge()) {
                if (this.getWeight() == o.getWeight()) {
                    return Integer.compare(this.getHeight(), o.getHeight());
                }
                return Integer.compare(this.getWeight(), o.getWeight());
            }
            return Integer.compare(this.getAge(), o.getAge());
        }
        return this.getName().compareTo(o.getName());
    }

}
