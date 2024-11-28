package Trainings;

public class Passwordchecker {
    public static int checkPassword (String str, int N)
    {
        if (N < 4)
            return 0;
        if (str.charAt (0) >= '0' && str.charAt (0) <= '9')
            return 0;
        int num = 0, cap = 0;
        for (int i = 0; i < N; i++)
        {
            if (str.charAt (i) == ' ' || str.charAt (i) == '/')
                return 0;
            if (str.charAt (i) >= 'A' && str.charAt (i) <= 'Z')
                cap++;
            if (str.charAt (i) >= '0' && str.charAt (i) <= '9')
                num++;
        }
        if (cap > 0 && num > 0)
            return 1;
        else
            return 0;
    }


    public static void main(String[] args) {
       String str="Adbc_1";
       int len=0;
       for(char c: str.toCharArray()){
           len++;
       }
        System.out.println(" Answer : "+checkPassword(str,len));
    }
}
