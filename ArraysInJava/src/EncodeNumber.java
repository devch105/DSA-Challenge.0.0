import java.util.Scanner;

public class EncodeNumber {

    public static int Encode(int n) {
        String ans = "";

        while(n != 0){
            int last = n % 10;
            ans = (last*last) + ans;
            n = n / 10;
        }

        return Integer.parseInt(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of terms
        System.out.println("Enter number:");
        int n = sc.nextInt();

        System.out.println("Encoded number is: " + Encode(n));
    }
}