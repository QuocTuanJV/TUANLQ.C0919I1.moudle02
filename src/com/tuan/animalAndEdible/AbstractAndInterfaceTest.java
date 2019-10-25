package com.tuan.animalAndEdible;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {

        Animal[] animals = new Animal[2];
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        Tiger tiger = new Tiger();
        Chicken chicken = new Chicken();
        animals[0] = tiger;
        animals[1] = chicken;
        for(Animal animal: animals){
            System.out.println(animal.makeSound());
            if(animal instanceof Chicken){//neu dong vat tim thay la Chicken
                Edible edibler = (Chicken) animal;//tao tham chieu la lop cha, con vung nho la lop con
                System.out.println(edibler.howToEat());
                System.out.println(edibler instanceof Animal);
            }

        }
        for (Fruit fruit: fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
