public class Digit_Operations {
    public static void main(String[] args) {
    int x= DecimaltoBinary(357,2);
    binarytoDecimal(x,2);
    BinaryevenOdd(101);
    }

    public static int binarytoDecimal(int binarynum , int base){
        int resnum=0;
        int power=0;
        while (binarynum>0){
            int unitdigit=binarynum%10;
            binarynum/=10;
            resnum+=unitdigit*Math.pow(base,power);
            power++;
        }
        System.out.println(" Result is = "+resnum);
         return  resnum ;
    }

   public static int DecimaltoBinary(int decimalNum ,int base){
        int resNum=0;
        int power=0;
        while(decimalNum>0){
            int rem=decimalNum%base;
            decimalNum/=base;
            resNum+=rem*Math.pow(10,power);
            power++;
        }
       System.out.println(" result = "+resNum);
        return  resNum;
    }
    public static void BinaryevenOdd(int num){
        int numms=binarytoDecimal(num,2);
        if(numms%2==0){
            System.out.println(num+" is even");
        }
        else {
            System.out.println(num+" is oddd");
        }
    }


    public void FindoddEven(int numm){

        if(numm%2==0) {
            System.out.println(" even");
        }else {
            System.out.println(" Odd");
        }

    }


}
