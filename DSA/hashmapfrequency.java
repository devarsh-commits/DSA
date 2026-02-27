import java.util.*;
 class hashmapfrequency {
 public static void main(String[] args) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int arr[]={10,20,10,30,20,10};
        for(int num:arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        for(int key:map.keySet()){
           System.out.println("Number "+ key + " Repeated "+map.get(key)+" times");
        }
    }
}
