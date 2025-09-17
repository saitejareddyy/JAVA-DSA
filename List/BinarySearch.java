class BinarySearch{

    int arr[];
    int n;
    public BinarySearch(int arr[]) {
        this.arr = arr;
        this.n = arr.length;
    }

    int find(int target){
        int i=0, j = n - 1;
        while (i < j) { 
            int mid = (i + j) / 2;
            if(arr[mid] == target) return  mid;
            else if(arr[mid] > target){
                j = mid - 1;
            } else{
                i = mid + 1;
            }
        }
        return  -1;
    }

    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        BinarySearch obj = new BinarySearch(arr);
        System.out.println("output: " + obj.find(8));
    }
}