package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class OperationQueue {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        queueoperation();

    }

    public static int queueoperation() {

        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        Queue<Integer> Q1 = new ArrayDeque<>();

        for (int i = 0; i <= Q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            sc.nextLine();
            if (x == 1) {
                Q1.add(y);
            } else if (x == 2) {
                if (Q1.size() != 0) {
                   Q1.peek();
                } else {
                    return -1;
                }
            } else if (x == 3) {
                if (Q1.size() != 0) {
                    Q1.poll();
                }else{
                    return -1;
                }
            }
            else {
                return -1;
            }

        }

      return 0;
    }

}