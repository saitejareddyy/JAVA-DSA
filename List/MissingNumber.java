
// You are given an unsorted array containing n distinct numbers taken from 1, 2, ..., n. However, one number is missing from the array. Your task is to find the missing number\
// input: 6
// 3 5 4 6
//output: 2

class MissingNumber{

    int arr[];
    int n;
    public MissingNumber(int arr[]) {
        this.arr = arr;
        this.n = arr.length + 1; // sequence contains missing number
    }

    public void missingNumber_method1(){
        boolean temp[] = new boolean[n+1];
        for(int i=0; i<=n-2; i++){
            temp[arr[i]] = true;
        }

        for(int i=1; i<=n; i++){
            if(temp[i] == false){
                System.out.println("Missing number is: "+ i);
            }
        }

        // T.C = O(n) + O(n) = 2*O(n) = O(n)
        // S.C  = O(n)
    } 

    public void missingNumber_method2(){
        // using n *(n + 1) / 2;
        int sum1 = 0;
        for(int i=0; i<n-1; i++){
            sum1 += arr[i];
        }

        int sum2 = n * (n + 1) / 2;
        int missing_num = sum2 - sum1;
        System.out.println("missing number is: "+missing_num);  

        // T.C = O(n)
        // S.C = O(1)
    }

    public void missingNumber_method3(){
        // using xor operator 
        int xor1 = 0, xor2 = 0;
        for(int i=0; i<n-1; i++){
            xor1 = xor1 ^ arr[i];
            xor2 = xor2 ^ (i + 1);
        }
        int missing_num = xor1 ^ xor2;
        System.out.println("Missing Number is: " + missing_num);

        //T.C = O(n)
        //S.C = O(n)
    }
    
    public static void main(String[] args) {
        int arr[] = {3, 5, 4, 6, 1};
        MissingNumber obj = new MissingNumber(arr);
        obj.missingNumber_method2();  
    }
}