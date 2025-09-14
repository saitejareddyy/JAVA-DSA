
import java.util.Scanner;

class reverseTheString{

    String str;
    public reverseTheString(String str) {
        this.str = str;
    }

    public void reverse_string_method1(){
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("reversed string: " +reversed);
    }

    public void reverse_string_method2(){
        String ans = "";
        for(int i=str.length()-1; i>=0; i--){
            char c = str.charAt(i);
            ans += c;
        }

        System.out.println("reversed string is: " + ans);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        reverseTheString obj = new reverseTheString(str);
        obj.reverse_string_method2();
    }
}