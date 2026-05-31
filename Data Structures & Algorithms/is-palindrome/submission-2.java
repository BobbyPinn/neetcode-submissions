class Solution {
    public boolean isPalindrome(String s) {
        String  t = s.toLowerCase();
        System.out.println(t);
        int l = 0;
        int r = s.length() -1;
        while(l < r){

            if(!Character.isLetterOrDigit(t.charAt(l))){
                l ++;
            }
            
            else if(!Character.isLetterOrDigit(t.charAt(r))){
                r --;
            }
            else{
                if(t.charAt(l) != t.charAt(r)){
                    return false;
                }
                
                l ++;
                r --;
            }
        }
        return true;
    }
}
