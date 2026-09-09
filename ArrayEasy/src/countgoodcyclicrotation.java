import java.util.Arrays;

public class countgoodcyclicrotation {
    static void main() {
        int arr[] =  {1,2,3,4,5,6};
        int n = arr.length;
        int count = 0 ;
        for(int k = 0 ;  k < n-1; k++) {
            int temp = arr[0];
            for(int i = 0; i < n-1; i++){
                arr[i] = arr[i+1];
            }
            arr[n-1] = temp;
            int firstsum = 0 ;
            int lastsum = 0;
            for(int i = 0 ; i < n; i++){
                if(i < n/2){
                    firstsum += arr[i];
                }
                else{
                    lastsum += arr[i];
                }
            }
            if(firstsum > lastsum){
                count++;
            }
        }
        System.out.println(count);
    }
}
