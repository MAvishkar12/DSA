public class Basic {
    public static void sort(int  arr[]){
        int s=0;
        int e= arr.length;
        while (s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
        }
    }
    public static void main(String[] args) {
        int a[]={0, 2, 1, 2, 0, 1};
        sort(a);

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+"");
        }

    }
}
