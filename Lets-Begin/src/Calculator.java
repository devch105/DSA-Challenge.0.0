import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {





    }


    public static  void Operation(){
        Scanner sc=new Scanner(System.in);

        System.out.println(" enter your operation ");

        System.out.println(" Addition -> +");
        System.out.println(" subtraction -> -");
        System.out.println(" Multiplication -> *");
        System.out.println(" Division -> /");
        System.out.println(" Modulus -> %");
        System.out.println(" exit -> $");
        String str=sc.next();
        char open=str.charAt(0);

    }

    public static void Perform_Task( char open){
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter number 1= ");
        int x=sc.nextInt();
        System.out.println(" Enter number 2 = ");
        int y=sc.nextInt();
        sc.close();

        switch (open){

            case '+':
                System.out.println("Addition "+(x+y));
                break;

            case '-':
                System.out.println("subtraction "+(x-y));
                break;

            case '*':
                System.out.println("Multiplication "+(x*y));
                break;

            case '/':
                System.out.println("Division "+(x/y));
                break;


            case '%':
                System.out.println("Modulus "+(x%y));
                break;


            case'$':


            default:
                System.out.println("Not valid");
        }
    }


}
