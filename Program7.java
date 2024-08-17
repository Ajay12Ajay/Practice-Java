//Given an array arr, rotate the array by one position in clock-wise direction
public class Program7 {
    public static void main(String[] args) {
        
        int arr1[]={1,2,3,4,5};
        int n=arr1.length;
                 
        int lastElement=arr1[n-1];

        System.out.print("Original array :");
        for(int num:arr1){
            System.out.print(num+",");
        }
        
        //shifting
        for(int i=n-1; i>0; i--){
            arr1[i]=arr1[i-1];
        }
        
        //adding last element to arr1[0]
        arr1[0]=lastElement;

        System.out.print("Rotated array");
        for(int num:arr1){
            System.out.print(num+",");
        }
    }
    
}
