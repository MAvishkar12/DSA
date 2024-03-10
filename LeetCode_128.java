/*Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.
Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4 */

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class LeetCode_128 {
    public static boolean linersearch(int arr[],int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }

    public static int maxlength(int arr[]){
        int len=1;
        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            int count=1;
            while (linersearch(arr,x+1)==true){
                x=x+1;
                count++;
            }

            len=Math.max(len,count);
        }
        return len;
    }



    //Optimal Solution

    public static int maxLength(int arr[]){

        if(arr.length==0) return 0;
        int len=1;
        Set<Integer> hs=new HashSet<>();

        for(int i=0;i<arr.length;i++){
          hs.add(arr[i]);
        }

        for (int a:hs){
             if(!hs.contains(a-1)){
                 int x=a;
                 int count=1;
                 while (hs.contains(x+1)){
                     x=x+1;
                     count=count+1;
                 }

                 len=Math.max(len,count);
             }



        }
       return len;
    }
    public static void main(String[] args) {
        int arr[]={100,4,200,1,3,2};
        System.out.println("Optimal Solution");
        System.out.println(maxLength(arr));

    }
}
