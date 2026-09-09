import java.util.ArrayList;
import java.util.Arrays;

public class majorityelem2 {
    static void main() {
        int arr[] = {1, 2, 1, 1, 3, 2};
        Arrays.sort(arr);
       int n = arr.length;
       ArrayList<Integer> list = new ArrayList<Integer>();
       for(int i = 0 ; i < n ; i++){
           int count = 1;
           for(int j = i+1; j < n; j++){
               if(arr[i] == arr[j]){
                   count++;
               }
               else{
                   break;
               }
           }
           if(count > n/3){
               list.add(arr[i]);
           }
       }
        System.out.println(list);
    }
}
