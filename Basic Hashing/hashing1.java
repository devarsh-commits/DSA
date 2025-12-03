import java.util.*;
public class hashing1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values in array from 1 to 10");
        int[]arr=new int[10];
        int[]hash=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<hash.length;i++){
            hash[i]=0;
        }
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;
        }
        System.out.println("The occourance of numbers are");
        for (int i : hash) {
            System.out.println(i);
        }
        

    }
}
