package DSA;

public class table {
    public static int table(int num,int count){
        if(count>10){
            return count;
        }
        else{
            table(num, count+1);
            System.out.println(num+"*"+count+"="+num*count);
        }
        return 0;
    }
    public static void main(String[] args) {
        table(2, 0);
    }
}
