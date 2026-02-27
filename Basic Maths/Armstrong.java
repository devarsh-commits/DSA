package Basic Maths;

public class Armstrong {
    static int Armstrong(int num){
        int mynum=num;
        int count=0;
        int digit=0;
        int compnum=0;
        while(mynum!=0){
            digit=mynum%10;
            count+=1;
            compnum=(compnum*10)+digit;
            mynum=mynum/10;
        }
        while(compnum!=0){
            digit=compnum%10;
            mynum=digit
        }
    }
    public static void main(String[] args) {
        
    }
}
