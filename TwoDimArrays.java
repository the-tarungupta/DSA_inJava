import java.util.*;

class TwoDimArrays{
    public static void main(String[] a){

        Scanner sc = new Scanner(System.in);

        // 1. Add two matrix using 2-d arrays

        // System.out.println("Enter size of rows & columns for matrix 1 : ");
        // int row = sc.nextInt();
        // int col = sc.nextInt();

        // int[][] m1 = new int[row][col];

        // System.out.println("Enter size of rows & columns for matrix 2 : ");
        // int row2 = sc.nextInt();
        // int col2 = sc.nextInt();

        // int[][] m2 = new int[row2][col2];

        // if(row == row2 && col == col2){
        //     int[][] s = new int[row][col];

        //     // Matrix 1 input 

        //     for(int i=0; i<row; i++){
        //         for(int j=0; j<col; j++){
        //             m1[i][j] = sc.nextInt();
        //         }
        //     }

        //     // Matrix 2 input 

        //     for(int i=0; i<row; i++){
        //         for(int j=0; j<col; j++){
        //             m2[i][j] = sc.nextInt();
        //         }
        //     }

        //     // Sum Processing 

        //     for(int i=0; i<row; i++){
        //         for(int j=0; j<col; j++){
        //             s[i][j] = m1[i][j] + m2[i][j];
        //         }
        //     }

        //     // Display Resultant

        //     System.out.println("Resultant matrix : ");
        //     for(int i=0; i<row; i++){
        //         for(int j=0; j<col; j++){
        //             System.out.print(s[i][j] + " ");
        //         }
        //         System.out.println();
        //     }
        // }
        // else{
        //     System.out.println("Matrix addition cannot be performed");
        // }

//--------------------------------------------------------------------------------------------------------------------------------------------------------
     
        // 2. Multiply two matrices using 2-d arrays

        // System.out.println("Enter size of rows & columns for matrix 1 : ");
        // int row = sc.nextInt();
        // int col = sc.nextInt();

        // int[][] m1 = new int[row][col];

        // System.out.println("Enter size of rows & columns for matrix 2 : ");
        // int row2 = sc.nextInt();
        // int col2 = sc.nextInt();

        // int[][] m2 = new int[row2][col2];

        // if(col == row2){

        //     int[][] p = new int[row][col2];

        //     // Matrix 1 input 

        //     for(int i=0; i<row; i++){
        //         for(int j=0; j<col; j++){
        //             m1[i][j] = sc.nextInt();
        //         }
        //     }

        //     // Matrix 2 input 

        //     for(int i=0; i<row2; i++){
        //         for(int j=0; j<col2; j++){
        //             m2[i][j] = sc.nextInt();
        //         }
        //     }

        //     // Multiplication Process 

        //     for(int i=0; i<row; i++){
        //         for(int j=0; j<col2; j++){
        //             for(int k=0; k<row2; k++){
        //                 p[i][j] += m1[i][k] * m2[k][j];
        //             }
        //         }
        //     }


        //     // Resultant
        //     System.out.println("Resulatant array : ");
        //     for(int i=0; i<row; i++){
        //         for(int j=0; j<col2; j++){
        //             System.out.print(p[i][j]+" ");
        //         }
        //         System.out.println();
        //     }
        // }
        // else{
        //     System.out.println("Mutliplication can't be performed");
        // }


//------------------------------------------------------------------------------------------------------------------------------------        

        // 3. Transpose of a matrix

        // System.out.println("Enter size of rows & columns for matrix: ");
        // int row = sc.nextInt();
        // int col = sc.nextInt();

        // int[][] m = new int[row][col];

        // // Input 

        // for(int i=0; i<row; i++){
        //     for(int j=0; j< col; j++){
        //         m[i][j] = sc.nextInt();
        //     }
        // }

        // // Transpose 

        // int[][] mT = new int[col][row];

        // for(int i=0; i<col; i++){
        //     for(int j=0; j<row; j++){
        //         mT[i][j] = m[j][i];
        //     }
        // }

        // // Resultant

        // for(int i=0; i<col; i++){
        //     System.out.println(Arrays.toString(mT[i]));
        // }

//-------------------------------------------------------------------------------------------------------------------------------------------

        // 4. Finding Sum of each row and each column in matrix 

        // System.out.println("Enter size of rows & columns for matrix: ");
        // int row = sc.nextInt();
        // int col = sc.nextInt();

        // int[][] m = new int[row][col];

        // // Input 

        // for(int i=0; i<row; i++){
        //     for(int j=0; j<col; j++){
        //         m[i][j] = sc.nextInt();
        //     }
        // }

        // // Processing & Result

        // int rS = 0;
        // for(int i=0; i<row; i++){
        //     for(int j=0; j<col; j++){
        //         rS += m[i][j];
        //     }
        //     System.out.println("Row "+i+" sum : "+rS);
        //     rS = 0;
        // }

        // int cS = 0;
        // for(int i=0; i<col; i++){
        //     for(int j=0; j<row; j++){
        //         cS += m[j][i];
        //     }
        //     System.out.println("Column "+i+" sum : "+cS);
        //     cS = 0;
        // }


//------------------------------------------------------------------------------------------------------------------------------------





    }
}