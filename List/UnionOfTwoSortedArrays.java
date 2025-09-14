class UnionOfTwoSortedArrays {
    // Problem Statement
    // You are given two sorted arrays, arr1 of size m and arr2 of size n. Your task is to finds the union of these two arrays. 
    public static void main(String[] args) {
        int arr1[] = {3, 3, 4, 5, 6, 6, 7};
        int arr2[] = {4, 5, 6, 7, 8, 8};
        int n = arr1.length, m = arr2.length;
        int ans[] = new int[n + m];   // max possible size
        int k = 0; 
        int i = 0, j = 0;

        while (i < n && j < m) { 
            if (arr1[i] < arr2[j]) {
                ans[k++] = arr1[i];
                i++;
            } else {
                ans[k++] = arr2[j];
                j++;
            }
        }

        while (i < n) { 
            ans[k++] = arr1[i];
            i++;
        }
        while (j < m) { 
            ans[k++] = arr2[j];
            j++;
        }

        for (int x = 0; x < k; x++) {
            System.out.print(ans[x] + " ");
        }
    }
}
