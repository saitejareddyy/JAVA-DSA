
// 1.length: str.length  ,  Returns the length of the string.

// 2.charAt: str.charAt(index),  Returns the character at the specified index.

// 3.subString: str.subString(startIndex), str.subString(startIndex, endIndex),  Returns a substring from the specified start index to the end of the string or up to the specified end index where start index is inclusive, and end index is exclusive.

// 4.contains: str.contains(CharSequence S), Checks if the string contains the specified sequence of characters.

// 5. equals: str.equals(anotherString), Compares this string to the specified object. The result is true if and only if the argument is not null and is a String object that represents the same sequence of characters as this object.

// 6.equalsIgnoreCase: str1.equalsIgnoreCase(str2), Compares this String to another String, ignoring case considerations.

// 7.startsWith: str.startsWith("ja"),  Tests if this string starts with the specified prefix

// 8.endsWith: str.endsWith("va"),  Tests if this string ends with the specified suffix.

// 9.replace: str.replace(oldChar, newChar), Returns a string resulting from replacing all occurrences of oldChar in this string with newChar

// 10.toUpperCase: str.toUpperCase(), Converts all of the characters in this String to upper case using the rules of the default locale.

// 11.toLowerCase: str.toLowerCase(), Converts all of the characters in this String to lower case using the rules of the default locale.

// 12.trim: str.trim(), Returns a copy of the string, with leading and trailing whitespace omitted.

// 13.split: str.split(regex), Splits this string around matches of the given regular expression.

// 14.indexOf: str.indexOf(int ch), str.indexOf(String str),  Returns the index within this string of the first occurrence of the specified character or substring.

// 15.lastIndexOf: str.lastIndexOf(int ch or String str), Returns the index within this string of the last occurrence of the specified character or substring.

// 16.toCharArray: str.toCharArray(),  Converts this string to a new character array.

class StringMethods {

    String str1;
    String str2;

    public StringMethods(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public void length_method() {
        System.out.println("Length of str1: " + str1.length());
    }

    public void charAt_method(int index) {
        char chr = str1.charAt(index);
        System.out.println("Character at index " + index + " in str1: " + chr);
    }

    public void subString_method(int startIndex, int endIndex) {
        String result = str1.substring(startIndex, endIndex);
        System.out.println("Substring of str1 from " + startIndex + " to " + endIndex + ": " + result);
    }

    public void contains_method(CharSequence seq) {
        System.out.println("Does str1 contain \"" + seq + "\"? " + str1.contains(seq));
    }

    public void equals_method() {
        System.out.println("Is str1 equal to str2? " + str1.equals(str2));
    }

    public void equalsIgnoreCase_method() {
        System.out.println("Is str1 equal to str2 (ignoring case)? " + str1.equalsIgnoreCase(str2));
    }

    public void startsWith_method(String prefix) {
        System.out.println("Does str1 start with \"" + prefix + "\"? " + str1.startsWith(prefix));
    }

    public void endsWith_method(String suffix) {
        System.out.println("Does str1 end with \"" + suffix + "\"? " + str1.endsWith(suffix));
    }

    public void replace_method(char oldChar, char newChar) {
        System.out.println("Replacing '" + oldChar + "' with '" + newChar + "' in str1: " + str1.replace(oldChar, newChar));
    }

    public void toUpperCase_method() {
        System.out.println("str1 in uppercase: " + str1.toUpperCase());
    }

    public void toLowerCase_method() {
        System.out.println("str1 in lowercase: " + str1.toLowerCase());
    }

    public void trim_method() {
        System.out.println("str1 after trimming spaces: \"" + str1.trim() + "\"");
    }

    public void split_method(String regex) {
        System.out.println("Splitting str1 by \"" + regex + "\":");
        String[] parts = str1.split(regex);
        for (String part : parts) {
            System.out.println("- " + part);
        }
    }

    public void indexOf_method(String s) {
        System.out.println("First index of \"" + s + "\" in str1: " + str1.indexOf(s));
    }

    public void lastIndexOf_method(String s) {
        System.out.println("Last index of \"" + s + "\" in str1: " + str1.lastIndexOf(s));
    }

    public void toCharArray_method() {
        System.out.print("Characters of str1: ");
        char[] arr = str1.toCharArray();
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StringMethods sm = new StringMethods("Java Programming  ", "JAVA programming");

        sm.length_method();
        sm.charAt_method(2);
        sm.subString_method(0, 4);
        sm.contains_method("Pro");
        sm.equals_method();
        sm.equalsIgnoreCase_method();
        sm.startsWith_method("Ja");
        sm.endsWith_method("ing");
        sm.replace_method('a', 'x');
        sm.toUpperCase_method();
        sm.toLowerCase_method();
        sm.trim_method();
        sm.split_method(" ");
        sm.indexOf_method("a");
        sm.lastIndexOf_method("a");
        sm.toCharArray_method();
    }
}
