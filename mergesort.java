public class mergesort{
    public static void conquer(int array[], int si, int ei, int mid) {
        int merge[] = new int[ei - si + 1];
        int edx1 = si;
        int edx2 = mid + 1;
        int edx = 0;
        while (edx1 <= mid && edx2 <= ei) {
            if (array[edx1] <= array[edx2]) {
                merge[edx] = array[edx1++];
            } else {
                merge[edx] = array[edx2++];
            }
            edx++;
        }
        while (edx1 <= mid) {
            merge[edx++] = array[edx1++];
        }
        while (edx2 <= ei) {
            merge[edx++] = array[edx2++];
        }
        for (int i = 0, j = si; i < merge.length; i++, j++) {
            array[j] = merge[i];
        }
    }

    public static void divide(int array[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(array, si, mid);
        divide(array, mid + 1, ei);
        conquer(array, si, ei, mid);
    }

    public static void main(String args[]) {
        int array[] = {1, 4, 5, 3, 7, 3, 2};
        int n = array.length;
        divide(array, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
