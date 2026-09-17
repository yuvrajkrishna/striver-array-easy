public class truncatestring {
    static void main() {
        String s = "Hello how are you contestant";
        int k = 3;
        char ch [] = s.toCharArray();
        int count = 0;
        int end = s.length();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;

                if (count == k) {
                    end = i;
                    break;
                }
            }
        }

        System.out.println(s.substring(0, end));
    }
}
