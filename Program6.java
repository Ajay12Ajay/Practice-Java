/*Given two arrays arr1[] and arr2[], 
the task is to find the number of elements in the union between these two arrays.
The Union of the two arrays can be defined as the set containing distinct elements from both arrays. 
If there are repetitions, then only one element occurrence should be there in the union. */

public class Program6 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3,4,5};

        int unionCount=findUnionCount(arr1,arr2);
        System.out.println("Number of element in the union: "+unionCount);

    }

    public static int findUnionCount(int[] arr1, int[] arr2){

        int n1=arr1.length;
        int n2=arr2.length;

        int[] unionArray = new int[n1+n2];
        int k=0;

        //adding elements of arr1 to unionArray
        for(int i=0; i < n1; i++){
            unionArray[k++]=arr1[i];
        }

        //now adding elemets of arr2 to unionArray
        for(int i=0; i<n2; i++){

            boolean isDupilcate=false;
            
            for(int j=0; j < k; j++){
                if(arr2[i]==unionArray[j]){
                    isDupilcate=true;
                    break;
                }
            }
            if(!isDupilcate){
                unionArray[k++]=arr2[i];
            }
           
        }

         //display the union array
         System.out.print("Union Array :" );
         for(int i=0; i < k; i++){
            System.out.print(unionArray[i]+",");
         }

         System.out.println(" ");

         return k;
        }
            
        
    }

