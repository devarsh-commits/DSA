package Stone_Papers_Scissors;
import java.util.*;
public class Main {
    public static int rand(int min,int max){
        double random=Math.floor(Math.random()*(max-min)+min);
        int rand=(int) random;
        return rand;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Game !!! \n Please enter the value for ---\n 1:Stone\n2:papers\n3:Scissors");
        int userval=sc.nextInt();
        int robo_val=rand(1, 3);
        System.out.println(robo_val);
        if(robo_val==1 && userval==2){
            System.out.println("Robot:Stone\nYou:Paper\n--------------\nYou Win!!!!");
        }
        else if(robo_val==2 && userval==3){
             System.out.println("Robot:Paper\nYou:Scissors\n--------------\nRobot Win!!!!");
        }
        else if(robo_val==3 && userval==2){
             System.out.println("Robot:Scissors\nYou:Paper\n--------------\nRobot Win!!!!");
        }
        else if(robo_val==3 && userval==1){
               System.out.println("Robot:Scissors\nYou:Stone\n--------------\nYou Win!!!!");
        }
        else if(robo_val==1 && userval==3){
              System.out.println("Robot:Stone\nYou:Sscissors\n--------------\nRobot Win!!!!");
        }
        else if(robo_val==2 && userval==1){
             System.out.println("Robot:Paper\nYou:Stone\n--------------\nRobot Win!!!!");
        }
        else{
            System.out.println("No one Won!!");
        }
    }
}
