package com.java_base.ClassObject;

class Animal {
    String name;
    Double weight;
    String classification;

    Animal(String name, Double weight, String classification) {
        this.name = name;
        this.weight = weight;
        this.classification = classification;
    }

    public void printInfo() {
        System.out.println("name = " + name);
        System.out.println("weight = " + weight);
        System.out.println("classification = " + classification);
    }

    public void eat() {
        System.out.println("냠냠!");
    }

    public void sleep() {
        System.out.println("쿨쿨!");
    }

    public void walk() {
        System.out.println("걷기!");
    }

    public void run() {
        System.out.println("뛰기!");
    }
}

public class Practice {
    public static void main(String[] args) {
        // Test code
        Animal animal1 = new Animal("강아지", 5.0, "포유류");
        Animal animal2 = new Animal("구피", 0.01, "어류");

        animal1.printInfo();
        animal2.printInfo();
    }
}

