public class Main {

     public static int equal(int a){
        int reverse=0;

        while (a>0){
            reverse=reverse*10+a%10;
            a=a/10;
        }
        return reverse;
    }


    public static void main(String[] args) {
         int n=123421;
         int a=equal(n);
         if(a==n){
             System.out.println("Palindrome");
         }
         else{
             System.out.println("Not palindrome");
         }




    }
}