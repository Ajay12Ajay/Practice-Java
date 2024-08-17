/*Given an array of size N.
 The task is to find the maximum and the minimum element of the array
  using the minimum number of comparisons */

class MaxMin{
    public static int setmini(int[] A, int N){
        int mini=Integer.MAX_VALUE;
        for(int i=0; i<N; i++){
            if(A[i] < mini){
                mini=A[i];

            }
        }
        return mini;


    }
    public static int setmaxi(int[] A, int N){
        int maxi=Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            if(A[i]>maxi){
                maxi=A[i];

            }
        }
        return maxi;


    }




    public static void main(String[] args) {
        int[] A={3,5,4,1,9};
        int N=A.length;

        System.out.println("Minimun element is ="+setmini(A, N));

        System.out.println("MAximum element is ="+setmaxi(A, N));
    }
}