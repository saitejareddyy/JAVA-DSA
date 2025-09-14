class MaximumConsecutive1s{
    // Maximum Consecutive 1's
    // You are given an array consisting of only 0s and 1s, and your task is to determine the longest consecutive sequence of ones in an array.
    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0};
        int n = arr.length;

        int maxi = 0;
        int current = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                current++;
                maxi = Math.max(maxi, current);
            } else{
                current = 0;
            }

        }

        System.out.println("max consecutive ones: "+maxi);

    }
}
