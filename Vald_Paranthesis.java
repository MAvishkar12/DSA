public class Vald_Paranthesis {
    public static boolean valid(String s){
        char sa []=new char[s.length()];
        int i=-1;
        for(int a=0;a<s.length();a++){
               char ca=s.charAt(a);
            if(ca=='(' || ca=='{' || ca=='['){
                sa[++i]=ca;
            }
            else{
                if(i>=0 &&   (sa[i]=='(' && ca==')') || (sa[i]=='[' && ca==']') || (sa[i]=='{' && ca=='}') ){
                    i--;
                }
                else {
                    return false;
                }
            }
        }
        return i==-1;
    }
    public static void main(String[] args) {
        String s="{[]}()";

        if(valid(s)){
            System.out.println("Balanced");
        }
        else{
            System.out.println(" not balanced");
        }

    }
}
