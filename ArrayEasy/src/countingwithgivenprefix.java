public class countingwithgivenprefix {
    public static void main() {
        String str [] = {"pay","attention","practice","attend"};
        String prefix = "at";
        int len = prefix.length();
        int count = 0;
        for(int i=0;i<str.length;i++) {
            if(str[i].substring(0,len).equals(prefix)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
