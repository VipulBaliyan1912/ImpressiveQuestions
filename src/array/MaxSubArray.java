package array;

public class MaxSubArray {
    static void maxSub(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(currSum<arr[i]) {
                currSum=arr[i];
                if(maxSum<currSum){
                    start=i;
                }
            }
            if(maxSum<currSum) {
                maxSum = currSum;
                end=i;
            }
        }
        for(int j=start;j<=end;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 6, 1, -1, 4};
        maxSub(arr);
    }
}
