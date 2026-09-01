public class findthelargestOptimal {
    static void main() {
        int arr[] = {8, 10, 5, 7, 9};
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The maximum number is " + max);
    }
}
