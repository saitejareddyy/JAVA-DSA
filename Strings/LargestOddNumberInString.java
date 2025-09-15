//LeetCode 1903 , Easy
class LargestOddNumberInString{
    public static void main(String[] args) {
        String num = "2608";
        int n = num.length();
        boolean isTrue = false;
        for(int i=n-1; i>=0; i--){
            char val = num.charAt(i);
            if((val - '0') % 2 != 0){
                System.out.println("LargestOddNumberInString is: " + num.substring(0, i+1));
                isTrue = true;
                break;
            }
        }
        if(!isTrue) System.out.println("LargestOddNumberInString is: " + "empty");
    }
}