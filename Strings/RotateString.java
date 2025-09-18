class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String target = "cdeaz";
        int n = s.length();
        if(s.length() !=target.length()){
            System.out.println("false");
        }

        boolean isTrue = false;

        for(int k=0; k<n; k++){
            boolean ans = true;
            for(int i=0; i<n; i++){
                if(s.charAt((k+i) % n) != target.charAt(i)){
                    ans = false;
                    break;
                }
            }
            if(ans == true) {
                System.out.println("true");
                isTrue = true;
            }
        }
        if(!isTrue) System.out.println("false");
    }
}