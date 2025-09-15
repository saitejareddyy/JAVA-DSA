import java.util.*;

class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "  hello world  ";

        StringBuilder text = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (text.length() == 0 || text.charAt(text.length() - 1) == ' ') {
                    continue; 
                }
            }
            text.append(c);
        }

        List<String> ans = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                ans.add(text.substring(index, i));
                index = i + 1;
            }
        }
        if (index < text.length()) {
            ans.add(text.substring(index));
        }

        Collections.reverse(ans);

        String result = String.join(" ", ans);

        System.out.println("output: " + result);
    }
}
