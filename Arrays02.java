import java.util.*;
import java.util.Arrays;

class Arrays02{

    // public static void functionReverse(int[] arr , int start , int end){

    //         while(start<end){
    //             int temp = arr[start];
    //             arr[start] = arr[end];
    //             arr[end] = temp;

    //             start++;
    //             end--;
    //         }

    // }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // 11. Check if array is sorted and rotated

        // System.out.println("Enter size of array : ");
        // int size = sc.nextInt();
        // int[] arr = new int[size];

        // for(int i=0; i<size; i++){
        //         arr[i] = sc.nextInt();
        // }

        // int var=0;

        // for(int i=0; i<size; i++){
        //     if(arr[i] > arr[(i+1)%(size)]){
        //         var++;
        //     }
        // }

        // if(var<=1){
        //     System.out.println("Yes array is sorted and rotated");
        // }
        // else{
        //     System.out.println("No array is not sorted and rotated");
        // }


        // Time Complexity = O(n)

//-----------------------------------------------------------------------------------------------------------------------        

        // 12. Remove Duplicates from Sorted array

        // System.out.println("Enter size of array : ");
        // int size = sc.nextInt();
        // int[] arr = new int[size];

        // for(int i=0; i<size; i++){
        //         arr[i] = sc.nextInt();
        // }

        // int var = 1;

        // for(int i=1; i<size; i++){
        //     if(arr[i] != arr[i-1]){
        //         arr[var] = arr[i];
        //         var++;
        //     }
        // }

        // System.out.print("Non-Duplicate array : ");

        // for(int i=0; i<var; i++){
        //     System.out.print(arr[i]+" ");
        // }


        // Time Complexity = O(n)


//--------------------------------------------------------------------------------------------------------------       

        // 13. Left Rotate array by d places


        // System.out.println("Enter size of array : ");
        // int size = sc.nextInt();
        // int[] arr = new int[size];

        // for(int i=0; i<size; i++){
        //         arr[i] = sc.nextInt();
        // }

        // System.out.println("Enter value of d : ");
        // int d = sc.nextInt();

        // if(d>=size){
        //     d=d%size;
        // }

        // Arrays02.functionReverse(arr , 0 , d-1);  
        // Arrays02.functionReverse(arr , d , size-1);
        // Arrays02.functionReverse(arr , 0 , size-1);    

        // System.out.println("Left Rotated array : "+Arrays.toString(arr)); 


        // Time Complexity = O(n)   


//----------------------------------------------------------------------------------------------------------------         

        // 14. Right Rotate an array by d places 

        // System.out.println("Enter size of array : ");
        // int size = sc.nextInt();
        // int[] arr = new int[size];

        // for(int i=0; i<size; i++){
        //         arr[i] = sc.nextInt();
        // }

        // System.out.println("Enter value of d : ");
        // int d = sc.nextInt();

        // if(d>=size){
        //     d = d%size;
        // }

        // Arrays02.functionReverse(arr , 0 , size-d-1);
        // Arrays02.functionReverse(arr , size-d , size-1);
        // Arrays02.functionReverse(arr , 0 , size-1);

        // System.out.println("Right Rotated array : "+Arrays.toString(arr));


        // Time Complexity = O(n)

//--------------------------------------------------------------------------------------------------------------------

        // 15. Searching for an element in array

        // System.out.println("Enter size of array : ");
        // int size = sc.nextInt();
        // int[] arr = new int[size];
        
        // for(int i=0; i<size; i++){
        //         arr[i] = sc.nextInt();
        // }

        // System.out.println("Enter element to be searched : ");
        // int elem = sc.nextInt();

        // int index=-1;
        // for(int i=0; i<size; i++){
        //         if(arr[i] == elem){
        //                 index = i;
        //                 break;
        //         }
        // }

        // if(index==-1){
        //         System.out.println(elem + " not found in array");
        // }
        // else{
        //         System.out.println(elem + " found in array at index : "+index);
        // }


        // Time Complexity = O(n)

//--------------------------------------------------------------------------------------------------------------

        // 16. Union of two sorted arrays

        /* Note : Use arraylist instead of array , as size of new array can't be predicted */

        // System.out.println("Enter size of array1 : ");
        // int size1 = sc.nextInt();
        // int[] arr1 = new int[size1];
        
        // for(int i=0; i<size1; i++){
        //         arr1[i] = sc.nextInt();
        // }

        // System.out.println("Enter size of array2 : ");
        // int size2 = sc.nextInt();
        // int[] arr2 = new int[size2];
        
        // for(int i=0; i<size2; i++){
        //         arr2[i] = sc.nextInt();
        // }

        // ArrayList<Integer> al = new ArrayList<>();

        // int i=0, j=0;

        // while(i<size1 && j<size2){
        //         if(arr1[i] < arr2[j]){
        //                 if(al.isEmpty() || ( al.get(al.size()-1) != arr1[i] )){
        //                         al.add(arr1[i]);
        //                 }
        //                 i++;
        //         }
        //         else if(arr1[i] == arr2[j]){
        //                 if(al.isEmpty() || (al.get(al.size()-1) != arr1[i])){
        //                         al.add(arr1[i]);
        //                 }
        //                 i++;
        //                 j++;
                        
        //         }
        //         else{
        //                 if(al.isEmpty() || (al.get(al.size()-1) != arr2[j])){
        //                         al.add(arr2[j]);
        //                 }
        //                 j++;

        //         }
        // }

        // while(i<size1){
        //         if(al.isEmpty() || ( al.get(al.size()-1) != arr1[i] )){
        //                         al.add(arr1[i]);
        //         }
        //         i++; 
        // }

        // while(j<size2){
        //         if(al.isEmpty() || ( al.get(al.size()-1) != arr2[j] )){
        //                         al.add(arr2[j]);
        //         }
        //         j++;
        // }

        // System.out.println(al);


        // Time Complexity = O(m+n)

//------------------------------------------------------------------------------------------------------------------        

        // 17. Intersection of two sorted arrays

        // System.out.println("Enter size of array1 : ");
        // int size1 = sc.nextInt();
        // int[] arr1 = new int[size1];
        
        // for(int i=0; i<size1; i++){
        //         arr1[i] = sc.nextInt();
        // }

        // System.out.println("Enter size of array2 : ");
        // int size2 = sc.nextInt();
        // int[] arr2 = new int[size2];
        
        // for(int i=0; i<size2; i++){
        //         arr2[i] = sc.nextInt();
        // }
        
        // ArrayList<Integer> al = new ArrayList<>();

        // int i=0 , j=0;

        // while(i<size1 && j<size2){
        //         if(arr1[i] == arr2[j]){
        //                 al.add(arr1[i]);
        //                 i++;
        //                 j++;
        //         }
        //         else if(arr1[i] < arr2[j]){
        //                 i++;
        //         }
        //         else {
        //                 j++;
        //         }
        // }

        // System.out.println(al);
        
        
        // Time Complexity = O(n+m)

//--------------------------------------------------------------------------------------------------------------------------

        // 18. Maximum Consecutive Ones in array

        // System.out.println("Enter size of array : ");
        // int size = sc.nextInt();
        // int[] arr = new int[size];
        
        // for(int i=0; i<size; i++){
        //         arr[i] = sc.nextInt();
        // }
        
        // int count=0;
        // int var = 0;
        // for(int i=0; i<size; i++){
        //         if(arr[i] == 1){
        //                 count++;
        //         }
        //         else{ 
        //                 count=0;
        //         }

        //         if(count>var){
        //                 var = count;
        //         }
        // }

        // System.out.println("Maximum consecutive ones : "+var);


        // Time Complexity = O(n)

//-------------------------------------------------------------------------------------------------------------------------

        

        }
}