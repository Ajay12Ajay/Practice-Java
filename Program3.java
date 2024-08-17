/*Given an array arr[] and an integer k where k is smaller than the size of the array,
 the task is to find the kth smallest element in the given array.
  It is given that all array elements are distinct. */

import java.util.Scanner;
import java.util.Arrays;

public class Program3 {
    
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int[] arr={7,10,4,3,20,15};
        int n =arr.length;

        int k=scr.nextInt();
        System.out.println("Kth element : "+k);

        Arrays.sort(arr);

        if(k > 0 && k<=n){
            System.out.println("Smallest Kth element="+arr[k-1]);
        }

        else{
            System.out.println("Invalid");
        }

        
    }
}
