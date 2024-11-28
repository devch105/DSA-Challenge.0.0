package Trainings;

public class Binaryoperation {
   public static int OperationBinary(String str,int len){
       if(len==0){
            return -1;
        }
       int res = 0;
       for(int i=1; i<len;i++){
           char opn =str.charAt(i);
           i++;

           char nxtdigit = str.charAt(i);

           switch (opn) {
               case 'A':
                   res = res & (nxtdigit - '0');
                   break;
               case 'B':
                   res = res | (nxtdigit - '0');
                   break;
               case 'C':
                   res = res ^ (nxtdigit - '0');
                   break;
               default:
                   return -1;
           }
       }
     return  res;
    }


    public static void main(String[] args) {
        int len=0;
        String str="1C0C1C1A0B1";
        for(char c:str.toCharArray()){
            len++;
        }
        System.out.println(" Answer "+OperationBinary(str,len));
    }

}
