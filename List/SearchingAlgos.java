
public class SearchingAlgos {

    int arr[] = {1, 2, 3, 4, 5, 6};
    int n = arr.length;

    public int linearSearch(int target) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return  -1;
    }

    public int BinarySearch(int target){
        int l = 0, r = n-1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(arr[mid] == target){
                return  mid;
            }
            else if(arr[mid] < target){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        SearchingAlgos obj = new SearchingAlgos();
        // System.out.println(obj.linearSearch(4));
        System.out.println(obj.BinarySearch(4));
    }
}
