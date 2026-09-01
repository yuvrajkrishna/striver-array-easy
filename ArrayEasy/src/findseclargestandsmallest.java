import java.util.Arrays;

public class findseclargestandsmallest {
    static void main() {
        int arr[] = {1, 2, 4, 7, 7, 5};
        Arrays.sort(arr);
        int min =  arr[0];
        int max = arr[arr.length-1];
        int secmin = Integer.MAX_VALUE;
        int secmax = Integer.MIN_VALUE;
        int i = 0;
        while(i < arr.length){
            if(arr[i] > min){
                secmin = arr[i];
                break;
            }
            i++;
        }
        i = arr.length-1 ;
        while(i >= 0){
            if(arr[i]  <  max){
                secmax = arr[i];
                break;
            }
            i--;
        }
        System.out.println("The second max :"+secmax);
        System.out.println("The second min :"+secmin);
    }
}
