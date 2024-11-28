import java.util.Scanner;

public class StringFunctions {
 // ************ STRING FUNCTION ************* //
 public static void  prints(char arr[]){
        int len1=getlength(arr);

        for(int i=0; i<len1; i++){
            System.out.print(arr[i]+"");
        }
 }
 public static  int  getlength(char arr[]){
        int length=0;
        for(char c:arr){
            length++;
        }
        return  length;
 }
 public  static  void  strcpy(String str1, String str2){
        char str11[]=str1.toCharArray();
        char str22[]=str2.toCharArray();
        int len2=getlength(str22);
        for(int i=0; i<len2; i++){
            str11[i]=str22[i];
        }
        System.out.println(" Second String :");
        prints(str22);
        System.out.println();
        System.out.println(" First String  after copy :");
        prints(str11);

    }
 public  static void stringNcopy(String str1,  String str2,int copyindex){
        char str11[]=str1.toCharArray();
        char str22[]=str2.toCharArray();
        int length1= getlength(str11);
        if(length1<copyindex){
            System.out.println(" cannot copy string");
        }else{

            for(int i=0; i<copyindex; i++){
                str11[i]=str22[i];
            }
        }

        //String s1=str11.toString();
     System.out.println(" Second String  :");
     prints(str22);
     System.out.println();
     System.out.println(" First String  after copying  :");
     prints(str11);
 }

    public static boolean StringSensitivecompare(char str1[],char str2 []) {
    if (getlength(str1) != getlength(str2)) {
        return false;
    } else {

        for (int i = 0; i < getlength(str2); i++) {
            char ch1 = str2[i];
            int asci1 = (int) ch1;
            char ch2 = str1[i];
            int asci2 = (int) ch2;
            if (asci2 != asci1) {
                return false;
             }

        }
    }
    return true;
    }
    public  static  boolean stringNcompare(char str1[], char str2[] , int nindex) {
        if (getlength(str1) < nindex) {
            return false;
        } else {

            for (int i = 0; i < nindex; i++) {
                char ch1 = str2[i];
                int asci1 = (int) ch1;
                char ch2 = str1[i];
                int asci2 = (int) ch2;
                if (asci2 != asci1) {
                    return false;
                }
            }

        }
        return true;
    }
    public  static  boolean StringInsensitiveCompare(char str1[], char str2[]) {
        if (getlength(str1) != getlength(str2)) {
            return false;
        } else {

            for (int i = 0; i < getlength(str2); i++) {
                char ch1 = str1[i];
                char ch2 = str2[i];
                // Normalize both characters to the same case using ASCII values
                if (ch1 >= 'A' && ch1 <= 'Z') {
                    ch1 = (char) (ch1 + 32); // Convert to lowercase
                }
                if (ch2 >= 'A' && ch2 <= 'Z') {
                    ch2 = (char) (ch2 + 32); // Convert to lowercase
                }
                // Compare normalized characters
                if (ch1 != ch2) {
                    return false;
                }
            }

            return true; // All characters matched

        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1="amit";
        String str2="Amit";
        //   strcpy(str1,str2);
        //   System.out.println("Enter copy Index : " );
        //    int ci= sc.nextInt();
        //   stringNcopy(str1,str2,ci);
        char string1[]=str1.toCharArray();
        char string2[]=str2.toCharArray();

        System.out.println(" check  sensitive compare  : "+StringSensitivecompare(string1,string2));
        System.out.println(" check index compare : "+stringNcompare(string1,string2,4));
        System.out.println(" check  insensitive  compare : "+StringInsensitiveCompare(string1,string2));
    }
}



