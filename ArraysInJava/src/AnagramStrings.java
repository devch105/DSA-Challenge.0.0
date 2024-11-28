import java.util.HashMap;
import java.util.HashSet;

public class AnagramStrings {

    public static  boolean AnagramChecker(String s,String l){
        HashSet<Character> hs=new HashSet<>();
        for(int i=0; i<s.length(); i++){
            hs.add(s.charAt(i));
        }

        for(int i=0; i<l.length(); i++){
            if(hs.contains(l.charAt(i))){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s="silent";
        String l="listen";

        System.out.println(" checks Anagram String : "+AnagramChecker(s,l));
    }
}
