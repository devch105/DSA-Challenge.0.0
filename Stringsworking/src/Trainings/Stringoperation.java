package Trainings;

public class Stringoperation {

     /*
    given string of binary digit and alphabets

    A=and
    B=or
    C=XOR

     */

    public static int OperationBinary(char A[]){
        int result=-1;
        if(A.length==0){
            return -1;
        }
        for(int i=1; i<A.length-1; i++){
            if(A[i]=='C'){
                result=(A[i-1]^A[i+1]);
                A[i+1]= (char) result;
                i++;
            }else if(A[i]=='B'){
                result=(A[i-1]|A[i+1]);
                A[i+1]= (char) result;
            }else if(A[i]=='A'){
                result=(A[i-1]&A[i+1]);
                A[i+1]= (char) result;
            }
        }
        return result;

    }


    public static void main(String[] args) {

        //String str="1C0C1C1A0B1";
        String str="1C0";
        char A[]=str.toCharArray();
        System.out.println(" Answer "+OperationBinary(A) );



    }
}
