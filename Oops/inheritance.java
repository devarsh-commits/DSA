package Oops;

class Vehicle{
    String name;
    String type;

    public Vehicle(String name,String type){
      this.name=name;
      this.type=type;
    }
    void honk(){
        System.out.println(name+"is honking");
    }
    void run(){
         System.out.println(name+"Vehicles is runnng");
    }
}

class Ship extends Vehicle{
    public Ship(String name,String type){
        super(name, type);
    }
}

public class inheritance{
    public static void main(String[] args) {
        Ship s=new Ship("Jahaj ", null);
        s.run();

    }
}
