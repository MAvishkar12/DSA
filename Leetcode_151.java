public class Leetcode_151 {

    static  String reverse(String s){
        String words[]=s.split(" +");
        StringBuilder sc=new StringBuilder();
        for(int i= words.length-1;i>=0;i--){
            sc.append(words[i]);
            sc.append(" ");

        }

        return  sc.toString().trim();

    }
    public static void main(String[] args) {
        String sc="This is amazing Program";
        System.out.println(reverse(sc));

    }
}
