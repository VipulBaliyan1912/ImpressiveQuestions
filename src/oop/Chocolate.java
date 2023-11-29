package oop;

public class Chocolate {

    int barCode;
    String name;
    double weight;
    double cost;

    public Chocolate() {

    }

    public Chocolate(int barCode, String name, double weight, double cost) {
        this.barCode = barCode;
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    void get() {
        System.out.println("barcode : " + barCode);
        System.out.println("name : " + name);
        System.out.println("weight : " + weight);
        System.out.println("cost : " + cost);
    }
}

