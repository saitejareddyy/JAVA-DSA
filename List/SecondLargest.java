class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 7, 3 , 8, 9, 10};
        int n = arr.length;
        int maxi = arr[0];
        int second_largest = -1;

        for(int i=0; i<n; i++){
            if(arr[i] > maxi){
                second_largest = maxi;
                maxi = arr[i];
            }

            if(arr[i] < maxi && arr[i] > second_largest){
                second_largest = arr[i];
            }
        }

        System.out.println("Second Largest num: "+second_largest);
    }
}