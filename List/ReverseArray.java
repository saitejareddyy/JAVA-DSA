import java.lang.*;

class ReverseArray {

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        // using two pointers methos 
        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int l = 0, r = n - 1;
        while (l < r) {
            swap(arr, l, r);
            l++;
            r--;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
