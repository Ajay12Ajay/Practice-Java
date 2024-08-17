/*Given an integer array arr[].
 Find the contiguous sub-array(containing at least one number) 
 that has the maximum sum and return its sum. */

public class Program8 {
    public static void main(String[] args) {
        int arr[]={1,2,3,-2,5};
        int n=arr.length;

        int temp=arr[0];

        /*
        arr[0]=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
        int sum=arr[0];
        System.err.println(sum); */

        for(int i=1; i<n; i++){
            temp=temp+arr[i];

        }

        System.err.println(temp);
    }
    
}
