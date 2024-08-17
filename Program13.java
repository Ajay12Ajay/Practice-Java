/* Kadane's Algorithm
Given an integer array arr[]. Find the contiguous sub-array(containing at least one number) 
that has the maximum sum and return its sum.
*/
public class Program13 {
    public static void main(String[] args) {
        int[] arr={1,2,3,-2,5};
        int result=sumOfArray(arr);
        System.out.println("Maximum Subarray sum :"+result);
    }
    
    public static int sumOfArray(int[] arr){

        int n=arr.length;

        int maxCurrent=arr[0];
        int maxGlobal=arr[0];

        for(int i=1; i<n; i++){
            maxCurrent=Math.max(arr[i],maxCurrent+arr[i]);

            if(maxCurrent > maxGlobal){
                maxGlobal=maxCurrent;
            }
        }
        return maxGlobal;
    }
}
