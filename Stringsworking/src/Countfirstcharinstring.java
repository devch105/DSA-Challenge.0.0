public class Countfirstcharinstring {
    public static void main(String[] args) {
        String str="12abab";
        int target=findFirstAlphabet(str);
        int x=countfirst(str,target);
        System.out.println(" number : "+(x));


    }public static int  findFirstAlphabet(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int asciiVal = (int) ch;


            if ((asciiVal >= 65 && asciiVal <= 90) || (asciiVal >= 97 && asciiVal <= 122)) {
                return i;
            }
        }
        return 0;
    }


    public static int countfirst(String str,int target){
        int count=0;
        for(int i=target+1; i<str.length(); i++){
            if(str.charAt(i)==str.charAt(target)){
                count++;
            }
        }
        return count;
    }


}
