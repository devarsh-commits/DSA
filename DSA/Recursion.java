package DSA;
public class Recursion {
   public static int count(int num){
    if(num>=10){
        return num;
    }
    else{
        System.out.println(num);
        count(num+1);
    }
    return 0;
   }
   public static void main(String[] args) {
    count(1);
   }
}