// LeetCode 1021 

class RemoveOutermostParentheses{
    public static void main(String[] args){
        String s = "((())(()))(()(()))";
        String ans = "";
        int n = s.length();
        int l = 0, r = 0, index = 0;

        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(c == '('){
                l++;
            } else {
                r++;
            }

            if(l != 0 && r != 0 && l == r){
                ans += s.substring(index+1, i);
                l = 0;
                r = 0;
                if(index < n) index = i + 1;
            }
        }

        System.out.println("Output is: "+ans);
    }
}