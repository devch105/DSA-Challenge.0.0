package Trainings;

public class Removechar {



    public static  String RemoveCharacter(String str,char ch){
        if(str==null){
            System.out.println("Enter a valid string");
            return null;
        }
        char strchar[]=str.toCharArray();

        int j=0;
        for(int i=0; i<strchar.length; i++){
            if(strchar[i]!=ch){
                strchar[j++]=strchar[i];
            }
        }
        return  new String(strchar,0,j);
    }
    public static void main(String[] args) {

        String A="HillyBilly";
        System.out.println(" Given string : "+A);
        char ch='l';
        System.out.println(" String After removal : "+RemoveCharacter(A,ch));

    }
}
