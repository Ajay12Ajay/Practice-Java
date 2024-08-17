//Merge two sorted arr without using extra space

import java.util.Scanner;
import java.util.Arrays;

public class Program12 {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);

        System.err.println("Enter size of an Array1 :");
        int size1=scr.nextInt();
        System.err.println("Enter size of an Array2 :");
        int size2=scr.nextInt();
        
        int[] arr1=new int[size1];
        int[] arr2=new int[size2];

        System.out.print("Enter element for array1 :");
        for(int i=0; i<size1; i++){
            arr1[i]=scr.nextInt();            
        }

        System.out.print("Enter element for array2 :");
        for(int i=0; i<size2; i++){
            arr2[i]=scr.nextInt();            
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] mergeArray = new int[size1+size2];
        
        int i=0, j=0, k=0;

        while(i<size1 && j<size2){
            if(arr1[i] <= arr2[j]){
                mergeArray[k++]=arr1[i++];
            }
            else{
                mergeArray[k++]=arr2[j++];
            }
        }

        while (i < size1) {
            mergeArray[k++] = arr1[i++];
        }

        while (j < size2) {
            mergeArray[k++] = arr2[j++];
        }

        System.err.print("Merge Sorted Array :");
        for(int num:mergeArray){
            System.err.print(num);
        }





        /*
        System.err.print("Array1 :");
        for(int num:arr1){
            System.err.print(num+",");
        }

        System.err.println();

        System.err.print("Array2 :");
        for(int num:arr2){
            System.err.print(num+",");
        } */



    }    
}
