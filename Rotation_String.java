import java.util.*;
public class Rotation_String {
    public static boolean check(String s,String s1){
        if(s.length()==s1.length()){
            if(s.concat(s).contains(s1)){//ABCDABCD
                //DCBA
                return true;
            }
        }
        return false;
    }
    public  static int ns(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                sum=sum+Character.getNumericValue(s.charAt(i));
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String s="1abc23";
        //System.out.println(ns(s));
        String b="40";
        int sum=10;
        int a=sum+Integer.parseInt(b);
        System.out.println(a);


    }

}
