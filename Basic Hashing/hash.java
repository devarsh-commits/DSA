import java.util.Scanner;
public class hash {
      //write down the function on arrry to take user input first
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
     System.out.println("Enter the value in array from 1 to 10");
     int []arr=new int[10];
     for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
     }
     int []hash=new int[10];
     for(int i=0;i<hash.length;i++){
      hash[i]=0;
     }
     //here we are writing this code to find the number of occurance of number
     for(int i=0;i<arr.length;i++){
      //preallocating
      hash[arr[i]]+=1;
     }
     System.out.println(arr.toString());
     //fetching
     for (int i : arr) {
      System.out.println(hash[i]);
     }

    }
}
