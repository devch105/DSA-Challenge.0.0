import java.util.Scanner;

public class Stringhere {
    public static void main(String[] args) {
//        String n1="Dev";
//        String n2="Dev";
//
//        String n4=n1; // check refrence
//
//        String n6=new String("dev"); // check contents
//
//
//        System.out.println(n4==n6);
//        System.out.println("-------------");
//        System.out.println(n4.equals(n6));
//        System.out.println(n1.compareTo(n6));
//
//        System.out.println(n2.compareTo(n1));
//

        Scanner sc=new Scanner(System.in);
        System.out.println( " Enter word ");
        String word=sc.next();
        System.out.println("Enter Line :");
        String line= sc.nextLine();

        System.out.println(" word is : "+word);
        System.out.println(" line is : "+line);



    }
}
