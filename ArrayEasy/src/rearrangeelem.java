import java.util.Arrays;

public class rearrangeelem {
    static void main() {
        int arr[] = {1,2,-4,-5};
        int n = arr.length;
        int pos[] = new int [n/2];
        int neg[] = new int [n/2];
         int j = 0 ;
         int k = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < 0){
                neg[j++] = arr[i];
            }
            else{
                pos[k++] = arr[i];
            }
        }
         j = 0;
         k = 0;
        for(int i = 0 ; i < n ; i+=2){
            arr[i] = pos[j++];
            arr[i+1] = neg[k++];
        }
        System.out.println(Arrays.toString(arr));
    }
}
