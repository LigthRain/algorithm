package array;

public class MoveZeros {

    public static void main(String[] args) {
        int[] array = new int[]{1,0,2,0,4};
        move(array, 5);
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }

    private static void move(int[] array, int n) {
        int k = 0; //[0,k)都是非零元素
        for (int i = 0; i < n; i++) {
            if (array[i] != 0) {
                array[k] = array[i];
                k++;
            }
        }
        while (k < n) {
            array[k++] = 0;
        }
    }

}
