package hashing;

import java.util.TreeSet;

public class Hashset {
    public static void main(String[] args) {
        int [] arr= {2,4,5,1,6,1,4,1,6,1,4,1,8};

        TreeSet<Integer> tSet=new TreeSet<>();
        for(int i=0; i<arr.length; i++){
            tSet.add(arr[i]);
        }
        System.out.print(tSet);
    }
}
