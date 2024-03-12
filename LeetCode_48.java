/*
Rotate Image by 90 degree
Problem Statement: Given a matrix, your task is to rotate the matrix 90 degrees clockwise.
Example 1:
Input: [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
Explanation: Rotate the matrix simply by 90 degree clockwise and return the matrix.
TC=O(n)
*/




public class LeetCode_48 {

    public static void rotate(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length/2;j++){
                int temp=0;
                temp=arr[i][j];
                arr[i][j]=arr[i][arr.length-1-j];
                arr[i][arr.length-1-j]=temp;
            }
        }
    }


    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
