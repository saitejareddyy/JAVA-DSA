
import java.util.*;

// Problem Statement
// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.

// LeetCode: 15 {3Sum}

class ThreeSum {
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            int j = i + 1, k = n - 1;

            if(i > 0 && arr[i] == arr[i-1]) continue;

            while (j < k) { 
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == 0){
                    ans.add(new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k])));
                    j++;
                    while (arr[j] == arr[j-1] && j < k) j++;
                }
                else if(sum < 0){
                    j++;
                }
                else if(sum > 0){
                    k--;
                }
            }
        }

        for (List<Integer> triplet : ans) {
            for (int num : triplet) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // T.C = O(n^2)
    // S.C = O(1)
}