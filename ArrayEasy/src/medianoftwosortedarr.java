import java.util.Arrays;

public class medianoftwosortedarr {
    static void main() {
        int num1[] = {1,3};
        int num2[] = {2,4};
        int n = num1.length;
        int m = num2.length;
        int merge[] = new int [n+m];
        int i = 0 ;
        int j = 0 ;
        int k = 0;
        while(i < n  && j < m){
            if(num1[i] < num2[j]){
                merge[k++] = num1[i++];
            }
            else{
                merge[k++] = num2[j++];
            }
        }
        while(i < n){
            merge[k++] = num1[i++];
        }
        while(j < m){
            merge[k++] = num2[j++];
        }
        System.out.println(Arrays.toString(merge));

        if(merge.length % 2 == 0){
            double mid = merge[merge.length/2];
            double secmid = merge[(merge.length/2)-1];
            double ans = (mid+secmid)/2;
            System.out.println(ans);
        }
        else{
            System.out.println(merge[(merge.length/2)]);
        }
    }
}
