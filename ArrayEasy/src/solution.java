class Solution {
    public static boolean uniformArray(int[] nums1) {
        int nums2[] = new int [nums1.length];
        int diff;
        if(nums1[0]%2==0){
            diff = 2;
        }
        else{
            diff = 3;
        }
        int k = 0 ;
        for(int i = 0 ; i < nums2.length; i++){
            if(nums1[i]%diff == 0){
                nums2[k++] = nums1[i];
            }
            else{
                int calc = nums1[i] - nums2[i-1];
                if(calc < nums2[i-1]){
                    return false;
                }
                else if(calc%diff==0 && calc > nums2[i-1]){
                    nums2[k++] = calc;
                }

            }
        }
        return true;
    }

    public static void main() {
        int nums1[] = {13,10};
        boolean ans = uniformArray(nums1);
        System.out.println(ans);
    }
}