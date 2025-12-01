package BasicRecursion; 
public class Fibbonaci {
   static void simpleFibbo(int limit){
        int a=0;
        int b=1;
        int i=1;
        while( i<=limit){
          int temp=b;
          b=b+a;
          a=temp;
          System.out.println(b);
          i++;
        }
    }
public static void main(String[] args) {
        simpleFibbo(10);
    }
}
