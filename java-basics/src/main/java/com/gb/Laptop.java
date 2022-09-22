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

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Laptop implements Comparable<Laptop> {

    private int id;
    private String manufacturer;
    private String processor;
    private String operatingSystem;
    private int hdd;
    private int ram;
    private double screenDiagonal;
    private String color;

    public Laptop(int id,
                  String manufacturer,
                  String processor,
                  String operatingSystem,
                  int hdd,
                  int ram,
                  double screenDiagonal,
                  String color) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.hdd = hdd;
        this.ram = ram;
        this.screenDiagonal = screenDiagonal;
        this.color = color;
    }

    public Laptop(int id,
                  int hdd,
                  int ram) {
        this.id = id;
        this.hdd = hdd;
        this.ram = ram;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return id == laptop.id
            && ram == laptop.ram
            && processor.equals(laptop.processor)
            && operatingSystem.equals(laptop.operatingSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, processor, operatingSystem, ram);
    }

    @Override
    public String toString() {
        return "Laptop{" +
            "id=" + id +
            ", manufacturer='" + manufacturer + '\'' +
            ", processor='" + processor + '\'' +
            ", operatingSystem='" + operatingSystem + '\'' +
            ", hdd=" + hdd +
            ", ram=" + ram +
            ", screenDiagonal=" + screenDiagonal +
            ", color='" + color + '\'' +
            '}';
    }

    @Override
    public int compareTo(@NotNull Laptop o) {
        return Integer.compare(this.ram, o.ram);
    }

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
    }
}
