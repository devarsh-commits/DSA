package Array;

public class LargestElement {
    static int largestelem(int[]arr){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int[]arr={55,100,88,45,99,666,235};
        System.out.println("The largest value in array is "+largestelem(arr));
    }
}
