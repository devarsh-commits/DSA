package Patterns;
public class Dimond {
public static void main(String[] args) {
        //for the upper part
         int n=10;
         for(int i=1;i<=n;i++){
            //for the space
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            //for the star pattern
            for(int k=1;k<=(2*i)-1;k++){
                if(k==1 || k==(2*i)-1){
                      System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
        for(int i=n-1;i>=1;i--){
            //loop for the spaces
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            //loop for the star
            for(int k=1;k<=(2*i)-1;k++){
                 if(k==1 || k==(2*i)-1){
                      System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
