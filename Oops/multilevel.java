package Oops;

class Animal{
    public Animal(){
       System.out.println("I am cons of Animal");
    }
    void sound(){
        System.out.println("ANIMAL MAKES SOUND");
    }
}
class Dog extends Animal{
    public Dog(){
        super();
        System.out.println("I am cons of Dog");
    }
    void sound(){
        System.out.println("Dog is barking");
    }
}

class labrodor extends Dog{
    void bark(){    //method overidding
        super.sound();
       System.out.println("labedaor barking sweetly");
    }
}
public class multilevel {

    public static void main(String[] args) {
        //Animal a=new Animal();
        Dog d=new Dog();
        labrodor l=new labrodor();
        //a.sound();
        l.bark();                 
    }
}