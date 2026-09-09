public class BuyandSellStock {
    static void main() {
        int arr[] = {7,1,5,3,6,4};
        int maxprofit= 0;
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = i+1; j < arr.length ; j++) {
                int profit = arr[j] - arr[i];
                maxprofit = Math.max(maxprofit, profit);
            }
        }
        System.out.println(maxprofit);
    }
}
