public class secondlargeselement {

   public static int SecondLargestElement( int arr[]){
        int Large=Integer.MIN_VALUE;
        int secondlarge=Integer.MIN_VALUE;

        for(int num:arr){
            if(num>Large){
                secondlarge=Large;
                Large=num;
            } else if (num>secondlarge && num!=Large) {
                 secondlarge=num;
            }
        }
        return secondlarge==Integer.MIN_VALUE ?-1:secondlarge;

   }

    public static void main(String[] args) {
        int arr[]={15,3 ,6 ,11 ,12 ,17};
        System.out.println(" Second Largest : "+SecondLargestElement(arr));
    }
}
