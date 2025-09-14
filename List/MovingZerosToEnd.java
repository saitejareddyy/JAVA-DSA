class MovieZerosToEnd {
    // Qusetion: 
    // You are given an array of integers. Your task is to write a program that moves all the zeros in the array to the end while maintaining the order of the non-zero elements.
    public static void main(String[] args) {
        int arr[] = {0, 0, 3, 0, 0, 5, 0 };
        int n = arr.length;
        int j = 0;
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                arr[i] = 0;
                // or we can perform swap operation : swpa(arr[j], arr[i]);
                j++;
            }
        }

        for(int x: arr){
            System.out.print(x + " ");
        }
    }
}