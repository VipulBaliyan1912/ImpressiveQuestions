package oop;

public class ChocolateTester {
    public static void main(String[] args) {
        Chocolate choco1 = new Chocolate();

        Chocolate choco2 = new Chocolate(101, "5 Star", 12, 10);
        choco1.get();
        System.out.println("*********************************************");
        choco2.get();
    }
}
