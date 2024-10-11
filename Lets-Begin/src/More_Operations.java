import java.util.Arrays;

public class More_Operations {
    public static void main(String[] args) {

         // int res=reverse_digit(1234);
         // double power=Power(2,7);
         //int count=countdigit(234);
        //int x=Count_logarthimvalue(1234);
        //   Armstrongnum(1634);
       // divisor_print(36);
      //  Prime_print(5);
        seive_prime(40);
    }

    // Reverse Digit
    public static int reverse_digit(int num) {
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println(" reverse " + rev);
        return rev;
    }
    // Power of Number


    public static double Power(int num, int pow) {
        double result = 1;
        while (pow > 0) {
            if (pow % 2 != 0) {
                result = result * num;
            }
            pow /= 2;
            num = num * num;
        }
        System.out.println(" result " + result);
        return result;
    }

    // count number of digit
    public static int countdigit(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        System.out.println("Number of digit " + count);
        return count;
    }

    // **** LOGARTHIM  values **//
    //   ->       y^x = N  then find x ?

    public static int Count_logarthimvalue(int num) {

        int x = (int) Math.log(num) / (int) Math.log(10) + 1;
        System.out.println(x);
        return x;
    }

    // Armstrong Number
    public static void Armstrongnum(int num) {
        int com = num;
        int x = countdigit(num);
        System.out.println(" **************");
        int check = 0;
        while (num > 0) {
            int unit = num % 10;
            check = (int) (check + Math.pow(unit, x));
            num /= 10;
        }
        System.out.println(check + " / " + com);
        if (check == com) {
            System.out.println(" Armstrong");
        } else {
            System.out.println(" Not Armstrong");
        }

    }


    // print all Divisor

    public  static void divisor_print(int num){
        int count=1;
        int sqrt=(int)Math.sqrt(num);
        while(count<=sqrt){
            if(num%count==0){
                System.out.println( count+"is a divsor of "+num);
                int othernum=num/count;
                if(othernum!=count){
                    System.out.println(othernum+" is a divisor "+num);
                }
            }
            count++;
        }
    }




    // prime Number

    public  static void Prime_print(int num){
        int count=2;
        int sqrt=(int)Math.sqrt(num);
        while(count<=sqrt){
            if(num%count==0){
                break;
            }else {
                System.out.println(num+" is a prime");
            }
            count++;
        }
    }


    // Print Range of Prime
    public static  void seive_prime(int num){
        boolean arr[]=new boolean[num+1];
        Arrays.fill(arr,true);
        int count =2;
        while (count<=num){
            if(arr[count]==true){
                for(int factor=count+count; factor<=num; factor+=count){
                    arr[factor]=false;
                }
            }
            count++;

        }
        for (int i=2; i<num; i++){
            if(arr[i]==true){
            System.out.println(i +" is Prime");}
            else {
                System.out.println(i+" is Not Prime");
            }
        }
    }

}




