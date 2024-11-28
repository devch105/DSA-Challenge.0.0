package Bits;

import java.util.Scanner;

public class Firstbit {
     /*
     * right shift
     * 10 -> 1 0 1 0
     *   10>>1
     *       1 0 1 0
     *         1 0 1
     *    10>>2
     *       1 0 1 0 -> 10
     *         1 0 1  -> 5
     *           1 0  -> 2

     *
     *   */

    public static int firstOpen(){
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter N :");
        int N=sc.nextInt();
        System.out.println(" Enter M :");
        int M =sc.nextInt();
        // Right shift
        //  N= N>>M; // 100 /2 pow 2;
        // left shift
        N=N<<M;   // 10 * 2 pow 3;
        System.out.println("Answer : "+N+"");
        return N;
    }
    public static void swapusingBits () {                                                //3
        int n = 10; // 1 0 1 0
        int m = 3;  // 0 1 0 0
        // 1  1  1  0
        System.out.println(" N : " + n + " M : " + m);
        n = n ^ m;  //12
        m = n ^ m;  //8
        n = n ^ m;  //d4
        System.out.println(" N : " + n + " M : " + m);
        int sum = n ^ m;
        System.out.println(" Sum = " + sum);
    }
    public static void masking () {

        int n = 3;
        int mask = 0x1;
        if ((n & mask) == 0) {
            System.out.println(" Even ");
        } else {
            System.out.println(" Odd ");
        }
    }//1

    public static boolean isPowerOfTwo(int n) {
        // agar  number is > 0  aur ( AND of Number and Number -1 == 0)
        // Toh number two ki power mai hai
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    public static int getPowerOfTwo(int n) {
        if (!isPowerOfTwo(n)) {
            return -1;
        }
        int power = 0;
        while (n > 1) {
            n >>= 1;
            power++;
        }
        return power;
    }

    // Enter a string Encrypt and Decrypt
    public static void Encrypt_Dycrypt(){
//        char x='A';
//        System.out.println(" Normal :"+x);
//        x= (char) ~x;
//        System.out.println(" Encrypt :"+x);
//        x=(char) ~x;
//        System.out.println("Decrypt : "+x);

        String A="Dev";
        String Result="";
        System.out.println("Normal : "+A);
        for(int i=0; i<A.length(); i++){
            char x= (char) ~A.charAt(i);
            Result+=x;
        }
        System.out.println("Encrypt : "+Result);
        System.out.println("Decrypt : ");
        for(int i=0; i<Result.length(); i++){
            char z=(char) ~Result.charAt(i);
            System.out.print(z+" ");
        }

    }


    public static void main(String[] args) {
        System.out.println(" power : "+ getPowerOfTwo(64));
        System.out.println("--------------------------------");
        Encrypt_Dycrypt();
    }
}
