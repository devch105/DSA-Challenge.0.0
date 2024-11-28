public class BinaryStringOpen {
    /*
    given string of binary digit and alphabets

    A=and
    B=or
    C=XOR
     */

    public static int OperationBinary(char A[]){

        if(A.length==0){
            return -1;
        }
        int result=A[0];

        for(int i=0; i<A.length; i++){
            if(A[i]=='C'){
               result=result&(A[i]);

            }else if(A[i]=='B'){
                result=result&(A[i]);

            }else if(A[i]=='A'){
                result=result&(A[i]);

            }
        }
        return result;

    }


    public static void main(String[] args) {

        String str="1C0C1C1A0B1";
     char A[]=str.toCharArray();
     System.out.println(" Answer "+OperationBinary(A) );



    }
}
