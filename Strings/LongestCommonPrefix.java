class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = {"flower","flow","flight"};
        int n = words.length;
        if (n == 0) {
            System.out.println("empty");
            return;
        }

        int k = 0;
        boolean isTrue = false;

        while (true) {
            if (k >= words[0].length()) break;  
            char c = words[0].charAt(k);

            for (int i = 1; i < n; i++) {
                if (k >= words[i].length() || words[i].charAt(k) != c) {
                    System.out.println(words[0].subSequence(0, k));
                    isTrue = true;
                    break;
                }
            }
            if (isTrue) break;
            k++;
        }
        if (!isTrue) System.out.println(words[0].subSequence(0, k));
    }
}
