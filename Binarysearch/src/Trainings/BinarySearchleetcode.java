package Trainings;

public class BinarySearchleetcode {


    public static void main(String[] args) {
int arr[]={12,34,67,90};
        System.out.println("Answer--");
int answer=113;
int result=bookalllocation(arr,2);

        System.out.println("Expected Output"+answer);

        System.out.println("Your Output "+result);


    }
    public  static  int bookalllocation(int books[], int students) {

        if (books.length < students) {
            return 1;
        }
        //range will be max 0f array and sum of array
        int strt = FindMin(books); // Find Max
        int end = FindSum(books); // Sum of Array
        System.out.println(strt+ "+________+"+end);
        int res = -1;

        while (strt <= end) {
            //Max Pages alloted to single students
            int mid = strt + (end - strt) / 2;
            // If True than MINIMIZE Number of pages
            if (isAllocationPossible(books, mid, students)) {
                res = mid;
                end = mid - 1;
            } else {
                strt = mid + 1;

            }
        }

        return res;
    }

    private static boolean isAllocationPossible(int[] books, int maxpages, int students) {
                  int currentstudent=1;
                  int pages=0;

                  for(int i=0; i<books.length; i++){
                      pages+=books[i];
                      if(pages>maxpages){
                          // No of Student increase  allocated to next
                          currentstudent+=1;
                          pages=books[i];
                      }
                      if(currentstudent>students){
                          return  false;
                      }
                  }
                  return true;
    }


    public static int FindMin(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return  max;
    }


    public static int FindSum(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
           sum=sum+arr[i];
        }
        return  sum;
    }

}

