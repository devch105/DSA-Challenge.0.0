package Bits;

public class CheckcountCarry {

    public static int addAndCountCarries(int num1, int num2) {
        int carry = 0;
        int carryCount = 0;

        while ( num2 != 0) {





            carry = num1 & num2;
            if (carry>0) {
                carryCount++;
            }
            num1 =num1 ^num2;
           num2 = carry<<1;
        }

        return carryCount; // Return total carry count
    }
    public static void main(String[] args) {
        int N=238;
        int M=174;
        System.out.println("Answer ; "+addAndCountCarries(N,M));


    }
}
