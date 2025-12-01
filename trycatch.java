import java.io.IOException;
import java.util.*;
public class trycatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        Object ob=data;
        try {
           if(ob instanceof String ){
            throw new IOException();
           } 
           System.out.println(data);
        } catch (IOException e) {
            
            System.out.println("Pls enttter valid inout");
        }
    }
}
