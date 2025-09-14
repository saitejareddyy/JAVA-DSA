// Find Single Element
// You have an array of integers, and all the elements in this array occur twice, except for one element. Your task is to identify and locate the unique element that appears only once in the array.

import java.util.*;

class SingleElement {

    int arr[];
    int n;

    public SingleElement(int arr[]) {
        this.arr = arr;
        this.n = arr.length;
    }

    public int getSingleElement() {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (var e : map.entrySet()) {
            if (e.getValue() == 1) {
                return e.getKey();
            }
        }
        return -1;

        // T.C = O(n)
        // S.C = O(n)
    }

    public void getSingleElement_method2(){
        int xor1 = 0;
        for(int i=0; i<n; i++){
            xor1 = xor1 ^ arr[i];
        }
        System.out.println("Unique element is: "+xor1);
    }



    public static void main(String[] args) {
        int arr[] = {3, 5, 9, 4, 9, 6, 5, 3, 4};
        SingleElement obj = new SingleElement(arr);
        // System.out.println("Unique element is: " + obj.getSingleElement());
        obj.getSingleElement_method2();
    }
}
