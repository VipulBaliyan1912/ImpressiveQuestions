package array;
import java.util.Scanner;
public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int k=sc.nextInt();
        int k2=k;
        int n=arr.length;
        int right[]=new int[n];
//        for right rotation by k
        for(int i=0;i<n;i++){
            right[k%n]=arr[i];
            k++;
        }
        System.out.print("After right rotation by k array is : ");
        for(int j:right){
            System.out.print(j+" ");
        }
        System.out.println();
        //for left rotation by k2
        int left[]=new int[n];
        for(int i=0;i<n;i++){
            left[(n-k2)%n]=arr[i];
            k2--;
        }
        System.out.print("After left rotation by k|k2 array is : ");
        for(int j:left){
            System.out.print(j+" ");
        }
    }
}
