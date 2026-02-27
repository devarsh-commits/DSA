package Patterns;

public class trianglepattern {
    public static void main(String[] args) {
        int n=13;
        //upper invert triangle
        //lines loop
        for(int i=0;i<n;i++){
          //loop for the spaces
          for(int j=0;j<n;j++){
            if(i==j||i+j==n-1){
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
