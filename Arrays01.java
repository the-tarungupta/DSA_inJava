import java.util.*;
import java.util.Arrays;

class Arrays01{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // 1. Calculate Average Using Arrays

        // System.out.println("Enter size of array: ");
        // int size = sc.nextInt();
        // int[] arr = new int[size];
        
        // double sum = 0;
        // for(int i=0; i<size; i++){
        //     arr[i] = sc.nextInt();
        //     sum += arr[i];
        // }

        // double avg = sum/size;
        // System.out.println("Average : "+avg);


       // Time Complexity = O(n)           n:length of array

//---------------------------------------------------------------------------------------------------------------------------------------------

        // 2. Largest Element in Array

        // System.out.println("Enter size of array: ");
        // int size = sc.nextInt();
        // int[] arr = new int[size];

        // for(int i=0; i<size; i++){
        //     arr[i] = sc.nextInt();
        // }

        // int max = arr[0];
        // for(int i=1; i<size; i++){
        //     if(arr[i] > max){
        //         max = arr[i];
        //     }
        // }
        // System.out.println("Largest element: "+max);


        // Time Complexity = O(n) 


//--------------------------------------------------------------------------------------------------------------------------------------------

        // 3. Calculating Standard Deviation

        // System.out.println("Enter size of array: ");
        // int size = sc.nextInt();
        // double[] arr = new double[size];

        // double sum = 0;
        // for(int i=0; i<size; i++){
        //      arr[i] = sc.nextInt();
        //      sum += arr[i];
        // }

        // double mean = sum/size;

        // double sum2 = 0;
        // for(int i=0; i<size; i++){
        //     arr[i] = arr[i] - mean;
        //     arr[i] = arr[i]*arr[i];
        //     sum2 += arr[i];
        // }

        // double mean2 = sum2/size;
        // double SD = Math.pow(mean2 , 0.5);
        // System.out.println("Standard Deviation : "+SD);


        // Time Complexity = O(n) 

//--------------------------------------------------------------------------------------------------------------------------------------------

        
        // 4. Reverse the array

        // System.out.println("Enter size of array : ");
        // int size = sc.nextInt();
        // int[] arr = new int[size];

        // for(int i=0; i<size; i++){
        //         arr[i] = sc.nextInt();
        // }

        // System.out.println("Normal array : "+Arrays.toString(arr));

        // int start = 0;
        // int end = size-1;

        // while(start<end){
        //         int temp = arr[start];
        //         arr[start] = arr[end];
        //         arr[end] = temp;
        //         start++;
        //         end--;
        // }

        // System.out.println("Reverse array : "+Arrays.toString(arr));


        // Time Complexity = O(n) 

//---------------------------------------------------------------------------------------------------------   

        // 5. Smallest Element in Array

        // System.out.println("Enter size of array : ");
        // int size = sc.nextInt();
        // int[] arr = new int[size];

        // for(int i=0; i<size; i++){
        //         arr[i] = sc.nextInt();
        // }

        // int min = arr[0];

        // for(int i=1; i<size; i++){
        //         if(arr[i] < min){
        //                 min = arr[i];
        //         }
        // }

        // System.out.println("Smallest element : "+min);


        // Time Complexity = O(n) 
        


//--------------------------------------------------------------------------------------------------------     


        // 6. Second Largest Element in Array

        // System.out.println("Enter size of array : ");
        // int size = sc.nextInt();
        // int[] arr = new int[size];

        // for(int i=0; i<size; i++){
        //         arr[i] = sc.nextInt();
        // }


        // int max = Integer.MIN_VALUE;
        // int sMax = arr[0];

        // for(int i=1; i<size; i++){
        //         if(arr[i] > max){
        //                 sMax = max;
        //                 max = arr[i];
        //         }
        //         else if(arr[i] < max && arr[i] > sMax){
        //                 sMax = arr[i];
        //         }
        // }

        // System.out.println("Second largest element : "+sMax);



        // Time Complexity = O(n)

//----------------------------------------------------------------------------------------------------------


        

    }
}