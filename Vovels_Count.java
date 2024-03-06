import java.util.ArrayList;

class Even_Odd {
    public static void main(String[] args) {
        String str="GeeksForGeeks";
        str=str.toLowerCase();
        int count=0;
        String vol="aeiou";
        ArrayList<Character> vols=new ArrayList<>();
        for(int i=0;i<vol.length();i++){
            vols.add(vol.charAt(i));
        }
        for(int i=0;i<str.length();i++){
           if(vols.contains(str.charAt(i)))
           {
               count ++;
           }
        }
        System.out.println(count);

    }



}
