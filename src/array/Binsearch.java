package array;

public class Binsearch {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4};
        int target = 3;
        System.out.println(binSeaech(array, 4, target));
    }

    private static int binSeaech(int[] array, int n, int target) {
        int l = 0;
        int r = n-1;
        while (l <= r) {
            int mid = (l+r)/2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] > target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

}
