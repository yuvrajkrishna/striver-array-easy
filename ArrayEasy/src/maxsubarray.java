public class maxsubarray {
    static void main() {
        int arr[] = {2, 3, 5, -2, 7, -4};
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int count = 0;
                for(int k = i ; k <= j; k++){
                    count += arr[k];
                }
                max = Math.max(max, count);
            }
        }
        System.out.println(max);
    }
}
