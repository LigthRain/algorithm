package sort;

public class MergeSort {

    public static void main(String[] args) {

    }

    private static void mergeSort(int[] arr) {
        int l = 0;
        int r = arr.length;
        sort(arr, l, r);
    }

    //处理arr[l...r]
    private static void sort(int[] arr, int l, int r) {
        if (l == r) {
            return;
        }
        int mid = (l + r) / 2;
        sort(arr, l, mid);
        sort(arr, mid+1, r);
        merge(arr, l, r);
    }

    private static void merge(int[] arr, int l, int r) {
        //保留原数组
        int[] temp = new int[r-l+1];
        for (int i = l; i <= r; i++) {
            temp[i-l] = arr[i];
        }

        //对原数组进行排序，结果放置在arr中
        int i = 0;
        int j = (temp.length - 1)/2+1;
        int mid = j - 1;
        for (int k = 0; k <= temp.length - 1; k++) {
            if (i > mid) {
                arr[k+l] = temp[j++];
            } else if (j >= temp.length - 1){
                arr[k+l] = temp[i++];
            }

            if (i <= mid && j <= temp.length - 1) {
                if (temp[i] < temp[j]) {
                    arr[k+l] = temp[i++];
                } else {
                    arr[k+l] = temp[j++];
                }
            }
        }
    }

}
