package Array;

public class secondlargest {
    static int secondlargest(int[]arr){
       int largest=Integer.MIN_VALUE;
       int sec_largest=largest-1;
       for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            int temp=largest;
            largest=arr[i];
            sec_largest=temp;
        }
        else if(arr[i]>=sec_largest){
          sec_largest=arr[i];
        }
       }
       return sec_largest;
    }
    public static void main(String[] args) {
        int[]arr={55,100,88,45,99,666,235};
        System.out.println("The second largest value in array is "+secondlargest(arr));
    }
}
