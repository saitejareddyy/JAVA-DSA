import java.util.HashMap;
import java.util.Map;

// LeetCode 205, Easy

class IsIsomorphic {

    public boolean solve(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int n = s1.length();
        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Character> m2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);

            if (m1.containsKey(a) && m1.get(a) != b) {
                return false;
            }
            if (m2.containsKey(b) && m2.get(b) != a) {
                return false;
            }

            m1.put(a, b);
            m2.put(b, a);
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "ghee";
        String s2 = "fear";
        IsIsomorphic obj = new IsIsomorphic();
        System.out.println(
            (obj.solve(s1, s2) && obj.solve(s2, s1)) ? "Isomorphic" : "Not Isomorphic");
            
    }
}
