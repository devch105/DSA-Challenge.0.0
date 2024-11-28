import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
         String str="This is BoB";
     String x=   reverseString(str);
        System.out.println(x);
   reversewordsofstring();

//        System.out.println(" "+Longest_palindromic(str));

    }
    public static String reverseString(String str) {
        char charstr[]=str.toCharArray();

        int i=0;
        int j=charstr.length-1;

        while(i<j){
            char temp=charstr[j];
            charstr[j]=charstr[i];
            charstr[i]=temp;
            i++;
            j--;
        }

        return new String(charstr);
    }
    public static  void reversewordsofstring(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = scanner.nextLine();

        // This will hold the reversed words
       StringBuilder result=new StringBuilder();
       int strt=str.length()-1;
       while (strt>=0){
           while( strt>=0 && str.charAt(strt)==' '){
               strt--;
           }if(strt<0){
               break;
           }
           int end=strt;
           while(str.charAt(end)!=' ' && end<str.length()){
               end++;
           }
           if(result.length()==0){
               result.append(str.substring(strt,end));
           }else{
               result.append(" ");
               result.append(str.substring(strt,end));
           }

       }
        System.out.println("Reversed sentence: " + result);
        scanner.close();
    }

    public static String Longest_palindromic(String s) {
                   return s;
    }
    public static boolean isPalindrome(String s,int left ,int right) {


        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }








}