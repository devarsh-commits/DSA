package Sorting;

public class selectionsort {
    static int [] Ins_sort(int[]arr){
      for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr.length;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
         }
      }
      return arr;
    }
    public static void main(String[] args) {
        int[]arr={5,4,6,9,1};
        arr=Ins_sort(arr);
        for (int i : arr) {
          System.out.println(i);
        }
    }
}
