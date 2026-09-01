import java.util.Arrays;

public class findthelargestbruteforce {
    static void main() {
        int arr[] = {13,46,24,52,20,9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("The Largest Element : " + arr[arr.length-1]);
    }
}