public class SumDifference {
    public static int sumDffer(int m,int n){

        int divisiblesum =0;
        int Nondivisiblesum=0;
        for(int i=0; i<=m; i++){
            if(i%n==0){
                divisiblesum +=i;
            }
            else {
                Nondivisiblesum+=i;
            }
        }
        return Nondivisiblesum-divisiblesum;
    }


    public static void main(String[] args) {
        int m=20;
        int n=4;
        System.out.println(" Answer : "+sumDffer(m,n));

    }
}
