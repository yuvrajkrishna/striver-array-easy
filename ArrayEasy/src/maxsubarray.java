public class maxsubarray {
    static void main() {

        int arr[] = {2, 3, 5, -2, 7, -4};

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){

            int sum = 0;

            for(int j = i; j < arr.length; j++){

                sum += arr[j];

                max = Math.max(max, sum);
            }
        }

        System.out.println(max);
    }
}