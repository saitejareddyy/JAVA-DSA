import java.util.Arrays;
import java.util.Scanner;

class BasicMethods {

    int arr[];
    int n;

    public BasicMethods(int arr[]) {
        this.arr = arr;
        this.n = arr.length;
    }

    public void printArray() {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public void PrintEvenNumbers() {
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public void min_and_max() {
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max: " + max + ", Min: " + min);
    }

    public void sum_and_avg() {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        avg = sum / n;
        System.out.println("Sum of array: " + sum + ", Avg of array: " + avg);
    }

    public void sort_array() {
        Arrays.sort(arr);  // Built-in sort
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        System.out.println("Enter squence");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        BasicMethods obj1 = new BasicMethods(arr);
        // obj1.printArray();
        // obj1.PrintEvenNumbers();
        // obj1.min_and_max();
        // obj1.sort_array();
        // obj1.sum_and_avg();
    }
}
