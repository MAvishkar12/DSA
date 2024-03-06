public class Leetcode_1021 {
    public static String valid(String s){
        int opening=0;
        int closing=0;
        int start=0;
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                opening++;

            }
             else if(s.charAt(i)==')'){
                closing++;
            }
             if(opening==closing){
                 res+=s.substring(start+1,i);
                 start=i+1;
             }


        }
        return res;
    }
    public static void main(String[] args) {
        String s="(()())(())()";
        System.out.println(valid(s));

    }
}
