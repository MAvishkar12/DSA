public class LeetCode_1 {
    public static boolean twosum(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while (low<high){
          int sum=arr[low]+arr[high];
          if(sum==target){
              return true;
          }
          else if(sum<target) low++;
          else high--;


        }
        return false;

    }
    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        int k=14;
        System.out.println(twosum(arr,k));
    }
}
