public class Kadens_Algorithm {
    public static int kd(int arr[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }

        }

        return max;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,3,4,-6,-2,-5};
        System.out.println(kd(arr));
    }
}
