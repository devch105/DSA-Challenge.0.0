public class Newstring {
    public static void main(String[] args) {
        String locations="hydrabad chennai banallore noida";
        String locArr[]=locations.split(" ");
        for(int i=locArr.length-1; i>=0; i--){
            System.out.print(" "+locArr[i]);
        }

        String email="devdhama23@gmail.com";
        String mail="skydhama105@hotmail.com";


        int indexofa=email.lastIndexOf("@");
        int indexofdot=email.lastIndexOf(".");
        System.out.println("---------------------------");

        System.out.println(email.substring(indexofa+1,indexofdot));
    }
}
