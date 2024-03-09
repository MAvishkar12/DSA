public class Stock_BS {

    public  static  int maxProfit(int arr[]){
        int min=Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else if(arr[i]-min>max_profit){
                max_profit=arr[i]-min;
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int arr[]={100 ,180, 260, 310 ,40, 535, 695};
        System.out.println(maxProfit(arr));


    }
}
