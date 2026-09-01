public class checkifarrayissorted {
    static void main() {
        int array[] = {1,1,3,2,5};
        for(int i = 1; i < array.length ; i++){
            if(array[i] < array[i-1]){
                System.out.println("Not sorted");
                return;
            }
        }
        System.out.println("Sorted array");
    }
}
