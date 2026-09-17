public class countcommas {
    static void main() {
        int n =  1000;
        int total = 0;
        for(int i = 1 ;  i <= n ; i++){
            int num = i;
            int digit = 0 ;
            while(num > 0 ){
                digit++;
                num /= 10;
            }
            if(digit >= 4){
                total += (digit - 1)/3;
            }
        }
        System.out.println(total);
    }
}
