package Trainings;

import java.util.Scanner;

public class ToggleEachCharater {

    public static String  Toggleword(StringBuilder str){
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            int ascii= (int)ch;
            if(ascii>97){
                ascii=ascii+32;
               char dh = (char) ascii;
                str.setCharAt(i,dh);
            }else{
                ascii=ascii-32;
               char dh = (char) ascii;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
       return  new String(str);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        StringBuilder str = new StringBuilder(scanner.nextLine());
        System.out.println(" answer "+Toggleword(str));

        // Toggle uppercase to lowercase and lower to upper



    }
}
