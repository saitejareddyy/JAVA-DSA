// LeetCode: 8 , medium 
class StringToInteger {
    public static void main(String[] args){
        String s = "-0037";
        int ans = 0;
        int sign = 1;
        int i = 0;
        int n = s.length();
        boolean gotAns = false;

        while (i < n && s.charAt(i) == ' ') { 
            i++;
        }

        if(i < n && s.charAt(i) == '+'){
            sign = 1;
            i++;
        } else if(i < n && s.charAt(i) == '-'){
            sign = -1;
            i++;
        }

        while(i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            int digit = s.charAt(i) - '0';
            ans = ans * 10 + digit;

            if(ans < Integer.MAX_VALUE && sign == 1){
                System.out.println("output: " + Integer.MAX_VALUE);
                gotAns = true;
            } else if(-ans < Integer.MIN_VALUE && sign == -1){
                System.out.println("output: " + Integer.MIN_VALUE);
                gotAns = true;
            }
            i++;
        }
        if(!gotAns)System.out.println("output: " + ans);
    }
}