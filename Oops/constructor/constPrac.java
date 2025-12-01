package Oops.constructor;

class car{
    String model;
    int year;

    public car(String model){
this(2005, model);
    }
    public car(int year, String model){
        this.year = year;
        this.model = model;
    }
    void get(){
        System.out.println("Model"+model+"\nYear:"+year);
    }
}
public class constPrac {
public static void main(String[] args) {
        car obj = new car("Tesla Roadster");
        car obj1 = new car(1999, "Bentley");
        obj.get();
        obj1.get();
    }
}
