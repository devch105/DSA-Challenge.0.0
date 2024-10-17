package DriveCDC;
import java.util.Scanner;
public class Solution {

    public static int printnthtermofFib(int n){

        int firstTerm = 0, secondTerm = 1, nextTerm = 0;

        if (n == 0) {
            return  firstTerm;
        } else if (n == 1) {

            return secondTerm;
        }
        for (int i = 2; i <= n; i++) {
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        return nextTerm;
    }


    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int x= printnthtermofFib(num);
        System.out.println(x);



    }

}
