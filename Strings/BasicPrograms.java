
import java.util.*;

class BasicPrograms {

    String str;
    public BasicPrograms(String str) {
        this.str = str;
    }

    public boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    // private boolean isVowel(char c){
    //     return  "aeiouAEIOU".indexOf(c) != -1;
    // }

    public void count_vowels(){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(isVowel(c)) count++;
        }

        System.out.println("no of vowels in str is: " + count);
    }

    public void palindrome(){
        int i=0, j = str.length()-1;
        boolean isPallin = true;
        while (i < j) { 
            char c1 = str.charAt(i);
            char c2 = str.charAt(j);
            if(c1 != c2){
                System.out.println("The give string is not a palindrome");
                isPallin = false;
                break;
            }
            i++;
            j--;
        }
        if(isPallin) System.out.println("The given string is applindrome");
    }

    public void Count_frequency_of_characters(){
        // using  map 
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        BasicPrograms obj = new BasicPrograms(str);
        obj.Count_frequency_of_characters();
    }
}