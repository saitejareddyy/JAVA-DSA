// LeetCode 451 
import java.util.*;

class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s = "eebga";

        int[] freq = new int[128];
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

       
        List<int[]> arr = new ArrayList<>();
        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                arr.add(new int[]{freq[i], i}); 
            }
        }

        
        arr.sort((a, b) -> {
            if (b[0] == a[0]) return a[1] - b[1]; 
            return b[0] - a[0];                   
        });


        StringBuilder ans = new StringBuilder();
        for (int[] p : arr) {
            int count = p[0];
            char ch = (char) p[1];
            ans.append(String.valueOf(ch).repeat(count));
        }

        System.out.println("output: " + ans);
    }
}
