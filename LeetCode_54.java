/*
Spiral Traversal of Matrix
Problem Statement: Given a Matrix, print the given matrix in spiral order.
Example 1:
Input: Matrix[][] = { { 1, 2, 3, 4 },
		      { 5, 6, 7, 8 },
		      { 9, 10, 11, 12 },
	              { 13, 14, 15, 16 } }
Outhput: 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10.
Explanation: The output of matrix in spiral form.
TC=(n*2)
*/



import java.util.*;
public class LeetCode_54 {

    public static ArrayList<Integer> spiralOrder(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        ArrayList<Integer> ans= new ArrayList<>();

        int top=0; int left=0; int right=m-1; int bottom=n-1;
        while (left<=right && top<=bottom){
          //  top-right
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
          // right-bottom
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
           //bottom-left
            if(top<=bottom) {
                for (int i = right;i>=left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //bottom-top
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int arr[][]={{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        ArrayList<Integer> ans=spiralOrder(arr);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();



    }
}
