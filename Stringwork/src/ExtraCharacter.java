import java.util.HashSet;

public class ExtraCharacter {

    public static void main(String[] args) {
        String s = "leetscode";
        String dictionary[] = {"leet", "code", "leetcode"};
        int min=minExtraChar(s,dictionary);
        System.out.println(" --> "+min);
    }

    public static int minExtraChar(String s, String[] dictionary) {
        HashSet<String> dictnaryset=new HashSet<>();
        return recur(s,dictnaryset,0);
    }

    private static  int  recur(String s, HashSet<String> dictnaryset, int index) {
    if(index==s.length()){
        return  0;
    }
    StringBuilder sb= new StringBuilder();
    int minExtraChar=Integer.MAX_VALUE;
    for(int i=index;i<s.length(); i++){
        sb.append(s.charAt(i));
        int extrachar=0;
        if(!dictnaryset.contains(sb.toString())){
            extrachar=sb.length();
        }
        int curextra=recur(s,dictnaryset,i+1);
            minExtraChar=Math.min(minExtraChar,extrachar+curextra);
    }

return  minExtraChar;
    }

}

