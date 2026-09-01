import java.util.Arrays;

public class findseclargestandsmallest {
    static void main() {
        int arr[] = {1, 2, 4, 7, 7, 5};
        int max = arr[0];
        int min = arr[0];
        int secmax = Integer.MIN_VALUE;;
        int secmin = Integer.MAX_VALUE;
        for(int i = 1 ; i < arr.length ; i++) {
            if(arr[i] > max) {
                secmax = max;
                max = arr[i];
            }
            else if(arr[i] > secmax && arr[i] < max) {
                secmax = arr[i];
            }
            if(arr[i] < min) {
                secmin = min;
                min = arr[i];
            }
            else if(arr[i] > min && arr[i] < secmin) {
                secmin = arr[i];
            }
        }
        System.out.println("The second max :"+secmax);
        System.out.println("The second min :"+secmin);
    }
}
