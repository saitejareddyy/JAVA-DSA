
class AnagramCheck {

    public boolean without_using_map(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] arr = new int[26]; 

        for (char ch : s1.toCharArray()) arr[ch - 'a']++;
        for (char ch : s2.toCharArray()) arr[ch - 'a']--;

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) return false;
        }
        return true;
}

    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";
        // int n = str1.length();

        // if (str1.length() != str2.length()) {
        //     System.out.println("Not an Anagram");
        //     return;
        // }

        // Map<Character, Integer> map = new HashMap<>();

        // // update frequency from str1
        // for (int i = 0; i < n; i++) {
        //     char c = str1.charAt(i);
        //     map.put(c, map.getOrDefault(c, 0) + 1);
        // }

        // // reduce frequency from str2
        // for (int i = 0; i < n; i++) {
        //     char c = str2.charAt(i);
        //     map.put(c, map.getOrDefault(c, 0) - 1);
        // }

        // // check all counts are zero
        // boolean isAnagram = true;
        // for (var e : map.entrySet()) {
        //     if (e.getValue() != 0) {
        //         isAnagram = false;
        //         break;
        //     }
        // }

        // if (isAnagram) {
        //     System.out.println("Anagram");
        // } else {
        //     System.out.println("Not an Anagram");
        // }

        AnagramCheck obj = new AnagramCheck();
        System.out.println( "output: " + obj.without_using_map(str1, str2));
    }
}
