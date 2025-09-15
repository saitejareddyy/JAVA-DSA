// LeetCode 13 
import java.util.*;

class RomanToInteger{
    public static void main(String[] args) {
        String roman = "XLVII";

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0;
        int n = roman.length();
        int prev = map.get(roman.charAt(n-1));
        ans += prev;
        for(int i=n-2; i>=0; i--){
            int curr = map.get(roman.charAt(i));
            if(curr >= prev){
                ans += curr;
            } else {
                ans -= curr;
            }

            prev = curr;
        }
        System.out.println("converted value is: " + ans);
    }
}