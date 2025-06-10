import java.util.Arrays;

public class sorted2DSearch {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };
        int[] ans = StaircaseSearch(arr, 35);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] StaircaseSearch(int[][] arr, int target) {
        int r = 0;
        int c = arr[0].length - 1;

        while (r <= arr.length - 1 && c >= 0) {
            if (arr[r][c] == target) {
                return new int[] { r, c };
            } else if (arr[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[] { -1, -1 };
    }
}
