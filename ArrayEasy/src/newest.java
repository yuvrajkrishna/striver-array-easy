import java.util.Arrays;

public class newest {
    static void main() {
        String str = "a1c1e1";
        char ch [] = str.toCharArray();
        for(int i = 0 ; i < ch.length ; i++){
            if(i%2 != 0 ){
                ch[i] = (char)(ch[i - 1] + (ch[i] - '0'));
            }
        }
        System.out.println(ch);
    }
}
