
import java.util.function.Function;

public class Functions {
     public void run(String p1,int age){
        System.out.println("My name is "+p1+" My age is "+age);
     }
     public int sum(int a,int b){
        int c=a+b;
        return c;
     }
    public static void main(String[]args){
       Functions f=new Functions();
       f.run("dev",10);
       //System.out.println(f.sum(10,5));
       int add=f.sum(10,5); //int add=c and actually c is ntg but 15 henceforth,can i say  int add=15;
       System.out.println(sum);
    }
}
