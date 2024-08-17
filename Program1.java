//Reverse the Array

class Reverse{
    public static void main(String[] args){
        int[] array={1,2,3,4};

        
        int[] revArray=new int[array.length];

        for(int i=0; i<array.length; i++){
            revArray[i]=array[array.length-i-1];
            
        }

        System.out.print("original array =");
        for(int num:array){
            System.out.print(num);
        }

        for(int num:revArray){
            System.out.println("\nReverse array ="+num);
        }
    }
}