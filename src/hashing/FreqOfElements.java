package hashing;
import java.util.*;
public class FreqOfElements {
    public static void main(String[] args) {
        int arr[]={1,2,5,6,3,1,4,5,6,5,8,5,2,3,6,4,2};
        HashMap<Integer,Integer> freqMap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry :freqMap.entrySet()){
            System.out.println(entry.getKey()+"->"+ entry.getValue());
            if(entry.getValue()>max)
                max=entry.getKey();
        }
        System.out.println("Element with maximum freq : "+max);
    }
}
