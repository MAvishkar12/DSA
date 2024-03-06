import java.util.Arrays;

public class Longest_Odd_String {
    public static String prefix(String arr[]){
        Arrays.sort(arr);

         String s1=arr[0];
         String s2=arr[arr.length-1];

//         if(s1.length()==0) return "";
//         if(s1.length()==1) return arr[0];
          int i=0;
        while (i<s1.length()){
            if(s1.charAt(i)==s2.charAt(i)){
                i++;
            }
           else{
               break;
            }

        }
         return i==0?"":s1.substring(0,i);
    }
    public static void main(String[] args) {
            String s[]={"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println(prefix(s));
    }
}
