
import java.util.*;

// LeetCode: 1 {Two Sum}
class TwoSum {

    int arr[];
    int target;
    int n;

    public TwoSum(int arr[], int target) {
        this.arr = arr;
        this.target = target;
        this.n = arr.length;
    }

    public void find_nums_method1() {
        // using nested loops
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("index are: " + i + " " + j);
                    break;
                }
            }
        }
        System.out.println("the pair of nums are not found");
    }

    public void find_nums_method2() {
        // using hash map
        Map<Integer, Integer> map = new HashMap<>();
        boolean flag = false;

        for (int i = 0; i<n; i++) {
            int comp = target - arr[i];
            if (map.containsKey(comp)) {
                System.out.println("indexes are: " + i + " " + map.get(comp));
                flag = true;
                break;
            }
            map.put(arr[i], i); 
        }
        if(flag == false)System.out.println("the pair of nums are not found");

        // T.C = O(n)
        // S.C = O(n)
    }

    public static void main(String[] args) {
        int arr[] = {2, 15, 11, 7};
        int target = 9;
        TwoSum obj = new TwoSum(arr, target);
        // obj.find_nums_method1();
        obj.find_nums_method2();
    }
}
