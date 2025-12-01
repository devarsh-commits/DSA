package Oops;




class OuterIntoduction {
    void run(){
        System.out.println("I am outer class");
    }  
}
public class Intoduction {
    public static void main(String[] args) {
        OuterIntoduction ot=new OuterIntoduction();
        ot.run();

    }
}
