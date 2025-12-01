package Oops.constructor;

class Innercons1 {
    // syntax of constructor
    String name;
    int age;
    public Innercons1(){
        System.out.println("I am empty Cons");
    }
    public Innercons1(String name, int age) {
        System.out.println("I am Parametric cons");
        this.name = name;
        this.age = age;
    }

    void info() {
        System.out.println(name + " " + age);
    }
}

public class cons1 {
    public static void main(String[] args) {
        Innercons1 onj=new Innercons1();
        Innercons1 obj2 = new Innercons1("Salman khan", 60);
        obj2.info();
    }
}
