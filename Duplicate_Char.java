public class Duplicate_Char {


    public static void main(String[] args) {
        String s="abcab";

        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>1){
                System.out.println((char) (i+'a') +" - "+count[i]);
            }
        }

    }

}
