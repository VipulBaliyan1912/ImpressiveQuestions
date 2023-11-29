package array;
import java.util.TreeSet;
public class SortArray {
    public static void main(String[] args) {
        int arr[]={9,5,6,8,7,2,3,1,5,10,13,11};
        TreeSet<Integer> tSet=new TreeSet<>();
        for(int i:arr){
            tSet.add(i);
        }
        System.out.println(tSet);
    }
}
