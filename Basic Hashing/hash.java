import java.util.Scanner;
public class hash {
    public static void main(String[] args) {
      //write  program to find the frequiency of number using hashing
      Scanner sc=new Scanner(System.in);
      int [] arr=new int[5];
      for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println(arr);
      System.out.println("The occournce of numbers is: ");
      int [] hash=new int[12];
      //prestoring the values
      for(int i=0;i<arr.length;i++){
        hash[arr[i]]+=1;
      }
      System.out.println(hash[5]);
    }
}
