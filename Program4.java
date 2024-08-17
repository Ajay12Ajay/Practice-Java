//Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

import java.util.Arrays;
import java.util.Scanner;

class Sort{
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);

        System.out.println("Size of array is :");
        int N = scr.nextInt();

        int arr[]=new int[N];

        
        for(int i=0; i<N; i++){
            arr[i]=scr.nextInt();
        }
        
        System.out.println("Original array :");
        for(int num:arr){
        System.out.print(num+" ");
        }

        System.err.println();

        Arrays.sort(arr);
        System.out.println("Sorted Array :");
        for(int num:arr){
            System.out.print(num+" ");
        }



    }
}