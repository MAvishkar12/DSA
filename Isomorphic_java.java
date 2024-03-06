import java.util.HashMap;
public class Isomorphic_java {
    public static  boolean Iso(String a,String b){
        for(int i=0;i<a.length();i++){
            HashMap<Character,Character> hs=new HashMap<>();
            if(hs.containsKey(a.charAt(i))) {

                if (!hs.get(a.charAt(i)).equals(b.charAt(i))) {
                    return false;
                }
            }
            else{
                if(hs.containsValue(b.charAt(i))){
                            return false;
                }
                        hs.put(a.charAt(i),b.charAt(i));
            }


        }
        return true;
    }
    public static void main(String[] args) {
        String a1="aab";
        String b1="xyz";
        System.out.println(Iso(a1,b1));

    }
}
