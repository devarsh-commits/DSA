package BasicRecursion;

import DSA.fibbonacci;

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
  static int Fibbo_rc(int a){
    if(a<=1){
      return 1;
    }
    else{
      int m=Fibbo_rc(a-1);
      int n=Fibbo_rc(a-2);
      return m+n;
    }
  }  
public static void main(String[] args) {
        simpleFibbo(10);
        System.out.println(Fibbo_rc(5));
    }
}
