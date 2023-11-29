package array;

public class MaxAndMinElement {
    public static void main(String[] args) {
        int arr[]={9,19,7,5,6,1,2,3,8};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
            else if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("Minimum: "+min+" & Maximun: "+max);
    }
}
