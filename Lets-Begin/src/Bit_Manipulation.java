public class Bit_Manipulation {
    public static void main(String[] args) {
//     PrintBits(33);
//     int rest=setbit(29,1);
//        System.out.println(" -----");
//     PrintBits(rest);
//        System.out.println("  ----");
//        int x=Toggleint(33,5);
//        PrintBits(x);
//
//        PrintBits(25);
//        int res3=UnsetIthBit(25,3);
//        System.out.println();
//        PrintBits(res3);

//        IspowerOFTwo(32);
//        PrintBits(48);
//        System.out.println();
//       int res4= UnsetrightMostsetBit(48);

        PrintBits(53);
        int x1=clearLSB(53,4);
        PrintBits(x1);
        int x2=clearMSB(53,4);
        PrintBits(x2);
        int x3=clearMSBexclusive(53,4);
        PrintBits(x3);

    }


    public static  void PrintBits(int num){

        for(int i=7; i>=0; i--){
            System.out.print((num>>i)&1);
        }
        System.out.println();
        System.out.println("-----------------");

    }

    public static  void  printevenodd(int num){}

    public static  boolean isbitset(int num,int bit){
        int res=num&(1<<bit);
        return (res==0)?false:true;
   }

    public static int setbit(int num,int bit) {
        return num | (1 << bit);
    }


    public  static  int Toggleint(int num, int bit){
        return num ^(1<<bit);
    }


    public static  int UnsetIthBit(int num, int bit){
        int res=(1<<bit);
        int pst=~res;
        return num&pst;
    }

    public static  void IspowerOFTwo(int num){
        if((num&(num-1))==0){
            System.out.println("Power of Two");
        }else {
            System.out.println(" Not Power Of Two");
        }

    }

    public static int UnsetrightMostsetBit(int num){
        return num&(num-1);
    }


   public static int clearLSB(int num, int bit){
           return num & ~((1<<bit+1)-1);
   }
    public static int clearMSB(int num, int bit){
        return num & ((1<<bit)-1);
    }
    public static int clearMSBexclusive(int num, int bit){
        return num & ((1<<bit+1)-1);
    }


}