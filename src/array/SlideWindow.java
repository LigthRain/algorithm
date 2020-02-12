package array;

public class SlideWindow {

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1,2,4,3};
        System.out.println(getResult(arr, 6, 7));
    }

    private static int getResult(int[] arr, int length, int target) {
        int l = 0;  //[l,r]是滑动窗口
        int r = -1;
        int sum = 0;
        int result = length + 1;
        while (l < length) {
            if ( r + 1 < length && sum < target) {
                sum += arr[++r];
            } else if (sum >= target) {
                result = Math.min(result, r - l + 1);
                sum -= arr[l++];
            }
        }
        return result;
    }

}
