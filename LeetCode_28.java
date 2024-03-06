public class LeetCode_28 {
    public static  int present(String input,String output){
        int m=input.length();
        int n=output.length();
        for(int i=0;i<m-n+1;i++){
            if(input.charAt(i)==output.charAt(0)){
                if(input.substring(i,output.length()+i).equals(output)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String a="sadbutsad";
        String b="but";
        System.out.println(present(a,b));

    }
}
