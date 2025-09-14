// Longest Subarray with sum k
// Problem Statement
// You are given an array arr of integers and an integer k. Write a program to find the length of the longest subarray with a sum equal to k.
import java.lang.*;
import java.util.*;

class LongestSubarrayWithSumK{

    int arr[];
    int n;

    public LongestSubarrayWithSumK(int arr[]) {
        this.arr = arr;
        this.n = arr.length;
    }

    public void get_longest_subarray_for_positive_nums(int target){
        int i=0;
        int maxi = 0, sum = 0;
        for(int j=0; j<n; j++){
            sum += arr[j];

            while (sum > target && i <= j) { 
                sum -= arr[i];
                i++;
            }

            if(sum == target){
                maxi = Math.max(maxi, j - i + 1);
            }
        }

        System.out.println("Longest subarray of sum k, is: "+maxi);

        // T.C = O(n)
        // S.C = O(1)
    } 

    public void get_longest_subarray_for_both_pos_and_neg(int target){
        // prefix sum + HashMap: {if array contains negative numbers}
        Map<Integer, Integer> map = new HashMap<>(); //{prefix_sum, index}

        int sum = 0, maxi = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];

            if(sum == target){
                maxi = Math.max(maxi, i + 1);
            }
            if(map.containsKey(sum - target)){
                maxi = Math.max(maxi, i - map.get(sum - target));
            }

            map.putIfAbsent(sum, i);
        }

        System.out.println("Longest subarray of sum k, is: "+maxi);
        // T.C = O(n)
        // S.C = O(n)

    }

    
    public static void main(String[] args) {
        int arr[] = {1, -4, 1, 3, 1, 2, -1, 4}; 
        //int arr[] = {1, 4, 1, 3, 1, 2, 1, 4};  non negative
        int target = 5;
        LongestSubarrayWithSumK obj = new LongestSubarrayWithSumK(arr);
        // obj.get_longest_subarray_for_positive_nums(target);
        obj.get_longest_subarray_for_both_pos_and_neg(target);
    }
}
