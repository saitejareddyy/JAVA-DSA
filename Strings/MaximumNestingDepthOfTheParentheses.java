// LeetCode: 1614 
class MaximumNestingDepthOfTheParentheses{
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";

        int maxi = 0;
        int depth = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                depth++;
                maxi = Math.max(maxi, depth);
            } else if(s.charAt(i) == ')') {
                depth--;
            }
        }
        System.out.println("max depth is: "+maxi);
    }
}