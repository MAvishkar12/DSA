public class LeetCode_169 {
    public static int major(int arr[]){
        int v=arr.length;
        int count=0;
        for(int i=0;i<v;i++){


            for(int j=0;j<v;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

            if(count>(v/2)) return arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2, 2, 1, 1, 1, 2, 2};
        System.out.println(major(arr));

    }
}
