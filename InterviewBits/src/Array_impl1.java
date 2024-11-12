import java.util.ArrayList;
import java.util.List;

public class Array_impl1 {
public   static   ArrayList<Integer> performOps(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<Integer>();
        for (int i = 0; i < 2 * A.size(); i++) B.add(0);
        for (int i = 0; i < A.size(); i++) {
            B.set(i, A.get(i));
            B.set(i + A.size(), A.get((A.size() - i) % A.size()));
        }
        return B;
    }


    public static void main(String[] args) {
        ArrayList<Integer> li=new ArrayList<>();
        li.add(5);
        li.add(10);
        li.add(2);
        li.add(1);
      ArrayList<Integer> l2=  performOps(li);
        System.out.println(l2);
    }
}
