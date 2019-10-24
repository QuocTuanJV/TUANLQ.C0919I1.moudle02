package com.tuan.demoDocument;

public class Main {
    public static void main(String[] args) {
        Animal animalList = new Animal();
        Animal dog = new Dog();
        animalList.add(dog);
        System.out.println(animalList.get(0).equals(dog));
        animalList.get(0);
    }
}
