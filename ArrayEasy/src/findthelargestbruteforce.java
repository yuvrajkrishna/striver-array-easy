import java.util.Arrays;

public class findthelargestbruteforce {
    static void main() {
        int arr[] = {13,46,24,52,20,9};
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]>arr[j]) {
                    int temp =  arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The maximum number is " + arr[arr.length-1]);
    }
}