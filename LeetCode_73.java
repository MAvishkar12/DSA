/*
Set Matrix Zero
Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire
column and row to 0 and then return the matrix.
Input: matrix=[[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Explanation: Since matrix[2][2]=0.
Therfore the 2nd column and 2nd row wil be set to 0.
*/
public class LeetCode_73 {

// Time Complexity: O(n*3_

    //    public static void rowOne(int i,int matrix[][]){
//        for(int j=0;j<matrix.length;j++){
//            if(matrix[i][j]!=0){
//                matrix[i][j]=-1;
//            }
//        }
//
//    }
//    public static void colOne(int j,int matrix[][]){
//        for(int i=0;i<matrix.length;i++){
//            if(matrix[i][j]!=0){
//                matrix[i][j]=-1;
//            }
//        }
//
//    }
//    public static void setZero(int matrix [] [] ){
//        for(int i=0;i<matrix.length;i++){
//            for(int j=0;j<matrix.length;j++){
//                if(matrix[i][j]==0){
//                    rowOne(i,matrix);
//                    colOne(j,matrix);
//                }
//            }
//        }
//
//        for(int i=0;i<matrix.length;i++){
//            for(int j=0;j<matrix.length;j++){
//                if(matrix[i][j]==-1){
//                    matrix[i][j]=0;
//
//                }
//            }
//        }
//    }


   // Time Complexity :O(n*2)
    public static void setZero(int arr[][]){
        int n= arr.length;
        int m=arr[0].length;
        int row[]=new int[n];
        int col[]=new int [m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j< m;j++){
                if(row[i]==1 || col[j]==1){
                    arr[i][j]=0;
                }
            }
        }

    }
    public static void main(String[] args) {
        int matrix[][]={{1,1,1,1},{1,0,1,1},{1,1,0,1},{1,0,0,1}};
        setZero(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }
}
