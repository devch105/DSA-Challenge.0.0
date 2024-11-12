public class RotateString_796 {


   public  static  boolean CheckRotateString(String s1,String s2){
      String s3=s1+s2;
      if(s3.contains(s2)){
          return  true;
      }
      else {
          return  false;
      }

   }

    public static void main(String[] args) {
        String s="abcde";
        String goal="cdeab";
        boolean x=CheckRotateString(s,goal);
        System.out.println(" Answer : "+x);
    }
}
