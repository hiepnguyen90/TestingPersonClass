package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private int shoeSize;
    private boolean hasGlasses;
    private int height;
    private int fingers;
    private int iq;

    public Person() {
    }

    public Person(int age) {
       this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public boolean getHasGlasses() {
        return hasGlasses;
    }

    public int getHeight() {
        return height;
    }

    public int getFingers() {
        return fingers;
    }

    public int getIq() {
        return iq;
    }
    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public void setHasGlasses(boolean hasGlasses) {
        this.hasGlasses = hasGlasses;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setFingers(int fingers) {
        this.fingers = fingers;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
