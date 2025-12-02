package Sorting;

public class BubbleSort {
    static int[]bubblesort(int[]arr){
        int len=arr.length-1;
        while(len>=0){
            for(int i=0;i<len;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            len--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[]arr={5,4,6,9,1};
        arr=bubblesort(arr);
        for (int i : arr) {
          System.out.println(i);
        }
    }
}
