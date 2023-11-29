package array;

public class ReverseArray {
    static void rev(int arr[]){
        int low=0;int high=arr.length-1;
        while(low<=high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;high--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        rev(arr);
        for(int i:arr){
            System.out.print(i +" ");
        }
    }
}
