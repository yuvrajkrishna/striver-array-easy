import java.util.ArrayList;

public class spiraltraverseofmatrix {

    static void main() {

        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        ArrayList<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;

        while(top <= bottom && left <= right) {

            // Left → Right
            for(int i = left; i <= right; i++) {
                result.add(arr[top][i]);
            }
            top++;

            // Top → Bottom
            for(int i = top; i <= bottom; i++) {
                result.add(arr[i][right]);
            }
            right--;

            // Right → Left
            for(int i = right; i >= left; i--) {
                result.add(arr[bottom][i]);
            }
            bottom--;

            // Bottom → Top
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    result.add(arr[i][left]);
                }
                left++;
            }
        }

        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}