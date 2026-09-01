import java.util.Arrays;

public class findthelargestbruteforce {
    static void main() {
        int arr[] = {13,46,24,52,20,9};
        for(int i = 0 ; i < arr.length-1; i++){
            boolean swapped = false;
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(arr));
        System.out.println("The maximum number is " + arr[arr.length-1]);
    }
}