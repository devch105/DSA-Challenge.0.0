package Unstop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studentHeight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter size =");
        int size=sc.nextInt();

        int heights[]=new int[size];
        System.out.println(" enter elements ");

        for(int i=0; i<heights.length; i++){
            heights[i]=sc.nextInt();
        }
        System.out.println();
        System.out.print(" Heights = ");
        for(int n:heights){
            System.out.print(" "+n);
        }
        int expected[]={1,1,1,2,3,4};

        CheckHeights(heights,expected);

    }

    public static  void CheckHeights(int [] heights, int[] expected){
        int count=0;
        List<Integer> l1=new ArrayList<>();
        for(int i=0; i<expected.length; i++){
            if(heights[i]!=expected[i]){
                count++;
                l1.add(i);
            }
        }
        System.out.println();
        System.out.print(count+"indexes does not match index");
        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i)+", ");
        }
    }


}
