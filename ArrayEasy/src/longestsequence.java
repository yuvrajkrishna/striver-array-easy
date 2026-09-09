import java.util.Arrays;

public class longestsequence {
    static void main() {
        int arr[] = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        Arrays.sort(arr);
        int max = 0;
        int i = 0 ;
        int count = 1;
        while(i < arr.length-1){
            if(arr[i+1] - arr[i] == 1){
                count++;
            }
            else if(arr[i+1] - arr[i] == 0){
                i++;
                continue;
            }
            else{
                count = 1;
            }
            i++;
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
