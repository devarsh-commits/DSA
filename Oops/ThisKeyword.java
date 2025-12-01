package Oops;
public class ThisKeyword {

    int year;
    String model;
    public ThisKeyword(String model){
       this(2005,model);
    }
    public ThisKeyword(int year,String model){
        this.year=year;
        this.model=model;

        
    }
    void getInfo(){
        System.out.println(year+" "+model);
    }
public static void main(String[]args){
       ThisKeyword obj1=new ThisKeyword("Nano");
       ThisKeyword obj2=new ThisKeyword(1988,"BMW");
       obj1.getInfo();
       obj2.getInfo();
    }
}
