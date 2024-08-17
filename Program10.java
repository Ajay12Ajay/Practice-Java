/* Given an array arr[] of size n of non-negative integers.
 Each array element represents the maximum length of the jumps that can be made forward from that element.
This means if arr[i] = x, then we can jump any distance y such that y ≤ x.
Find the minimum number of jumps to reach the end of the array starting from the first element.
If an element is 0, then you cannot move through that element. */


 class Main {

    public static int minJumps(int[] arr){
        int n=arr.length;

        if(n <= 1){
            return 0; //no jumps when arr has only 1 element
        }

        if(arr[0] == 0){
            return -1;
        }

        int jump=0; //number of jumps made
        int farthest=0; //farthest point that can be reached
        int currentEnd=0; //End of current jump

        for(int i=0; i<n-1; i++){
            farthest=Math.max(farthest, i+arr[i]);

            if(i==currentEnd){
                jump++;
                currentEnd=farthest;

                //if currentEnd is more than than the size of an array[](indices) than return 
                if(currentEnd >= n-1){ 
                    return jump;
                }

            }

            if(currentEnd <= i){
                return -1;
            }
        }
        return jump;
    }


    public static void main(String[] args) {
        int[] arr={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

        int result=minJumps(arr);
        System.out.println(result);

        
    }
    
}
