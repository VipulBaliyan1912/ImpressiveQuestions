package array;
import java.util.HashMap;
import java.util.Map;

public class FreqPblm {
    public static void main(String[] args) {
        int arr[]={1,2,1,3,2,1,5,9,3,5,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int result =0;
        for(int i=0 ; i<arr.length ; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key= entry.getKey();
            int val= entry.getValue();
            if(val > max){
                result=key;
                max=val;
            }
            else if(val == max){
                if(key > result)
                    result=key;
            }
        }
        System.out.println(result);
    }
}
