public class Leetcode_1528 {
    public  static  String same(String s,int index[]){
        int n=s.length();
        char ab[]=new char[n];

        for(int i=0;i<n;i++){
            ab[index[i]]=s.charAt(i);
        }

        return  new String(ab);
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,2,1,3};
        String sc="codeleet";
        //System.out.println(same(sc,arr));
        char ab[]={'a','b','c'};
        System.out.println(new String(ab));


    }
}
