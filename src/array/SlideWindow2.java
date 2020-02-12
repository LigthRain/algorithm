package array;

public class SlideWindow2 {

    public static void main(String[] args) {

    }

    private static int getResult(int[] arr) {
        int l = 0;
        int r = 0; //[l,r]是无重复最长子串
        int[] freq = new int[256];
        int result = 1;
        while (l < arr.length) {
            if (freq[arr[r]] == 0) {
                result = Math.max(result, r - l + 1);
                freq[arr[r++]] ++;
            } else {
                freq[arr[l++]] --;
            }
        }
        return result;
    }

}
