//Move all negative numbers to beginning and positive to end with constant extra space
public class Program5 {
    public static void main(String[] args) {
        
        int[] arr={-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int n = arr.length;

        System.out.print("Original Array :");
        for(int num:arr){
            System.out.print(num+",");
        }

        System.out.println();

        for(int i=0; i < n; i++){
           for(int j=0; j < n-1; j++){

            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
           }
        }

        
        System.out.print("Required Array :");
        for(int num:arr){
            System.out.print(num+",");
        }
    }
}
