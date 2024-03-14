/*
Count Subarray sum Equals K
Problem Statement: Given an array of integers and an integer k, return the total number of subarrays whose sum equals k.
A subarray is a contiguous non-empty sequence of elements within an array.
Input Format: N = 4, array[] = {3, 1, 2, 4}, k = 6
Result: 2
Explanation: The subarrays that sum up to 6 are [3, 1, 2] and [2, 4].
*/

public class LeetCode_560 {
    public static int SubraaySumCount(int arr[],int k){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={3, 1, 2, 4};
        int ans=6;
        int a=SubraaySumCount(arr,ans);
        System.out.println(a);

    }
}
