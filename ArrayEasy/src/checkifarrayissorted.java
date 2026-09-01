public class checkifarrayissorted {
    static void main() {
        int array[] = {1,1,2,2,5};
        for(int i = 0; i < array.length-1; i++){
                if(array[i] > array[i+1]){
                    System.out.println("Not sorted");
                    return;

            }
        }
        System.out.println("Sorted array");
    }
}
