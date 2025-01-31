import java.util.*;
class Sorting {

//     public static void mergeSort(int[] arr , int st , int en){
//         if(st=en){
//                 return ;
//         }
//         int mid = st+(en-st)/2;

//         mergeSort(arr , st , mid);    // divide & sort left half
//         mergeSort(arr , mid+1 , en);  // divide & sort right half
//         merge(arr , st , mid , en);   // now merging sorted halfs

//     }

//     public static void merge(int[] arr , int st , int mid , int en){
//         int[] temp = new int[en-st+1];
//         int i=st;
//         int j=mid+1;
//         int k=0;

//         while(i<=mid && j<=en){
//                 if(arr[i] <= arr[j]){
//                         temp[k++] = arr[i++];
//                 }
//                 else{
//                         temp[k++] = arr[j++];
//                 }
//         }

//         while(i<=mid){
//                 temp[k++] = arr[i++];
//         }
//         while(j<=en){
//                 temp[k++] = arr[j++];
//         }

//         for(int index=st; index<=en; index++){
//                 arr[index] = temp[index-st];         
//         }

//     } 

//--------------------------------------------------------------------------------------------------------



//     public static void quickSort(int[] arr , int low , int high){
//         if(low<high){
//                 int pI = partition(arr, low, high);
//                 quickSort(arr, low, pI-1);
//                 quickSort(arr, pI+1, high);
//         }

//     }

//     public static int partition(int[] arr , int low , int high){
//         int pivot = arr[low];
//         int i=low;
//         int j=high;
        
//         while(i<j){
//                 while(arr[i] <= pivot && i<=high-1){
//                         i++;
//                 }
//                 while(arr[j] > pivot && j>=low+1){
//                         j--;
//                 }
//                 if(i<j){
//                         int temp = arr[i];
//                         arr[i] = arr[j];
//                         arr[j] = temp;
//                 }
//         }
//         int temp = arr[j];
//         arr[j] = arr[low];
//         arr[low] = temp;
//         return j;
//     }


//----------------------------------------------------------------------------------------------------------------

    public static void main(String[] a){

        // Selection Sort Algorithm

        // int[] arr = {13,46,24,52,20,9};

        // for(int i=0; i<arr.length; i++){
        //     int minI = i;
        //     for(int j=i+1; j<arr.length; j++){
        //         if(arr[j] < arr[minI]){
        //             minI = j;
        //         }
        //     }
        //     int temp = arr[minI];
        //     arr[minI] = arr[i];
        //     arr[i] = temp;
        // }


        // System.out.println(Arrays.toString(arr));


        // Time Complexity = O(n^2)

//----------------------------------------------------------------------------------------------------------------------------------------

        // Bubble Sort Algorithm 

        // int[] arr = {13,46,24,52,24,20,9};

        // for(int i=0; i<arr.length-1; i++){
        //     for(int j=0; j<arr.length-1; j++){
        //         if(arr[j] > arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }

        // System.out.println(Arrays.toString(arr));


        // Time Complexity = O(n^2)

//-----------------------------------------------------------------------------------------------------------------------------------------------

        
        // Insertion Sort

        // int[] arr = {5,6,3,1,2};


        // for(int i=1; i<arr.length; i++){
        //     for(int j=0; j<i; j++){
        //         if(arr[i] < arr[j]){
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }

        // System.out.println(Arrays.toString(arr));


        // Time Complexity = O(n^2)

//------------------------------------------------------------------------------------------------------------------------------------------------------


        // Merge Sort 

        // int[] arr = {5 , 3 , 7 , 10 , 6};
        // mergeSort(arr , 0 , arr.length-1);
        // System.out.println(Arrays.toString(arr));


        // Time Complexity = O(nlogn)

//-----------------------------------------------------------------------------------------------------------------

        
        // Quick Sort 

        // int[] arr = {13,46,24,52,24,20,9};
        // quickSort(arr , 0 , arr.length-1);
        // System.out.println(Arrays.toString(arr));


        // Time Complexity = O(nlogn)

//-------------------------------------------------------------------------------------------------------------
        

        


        
        


    }
}