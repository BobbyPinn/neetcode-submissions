class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<String, Integer> map = new HashMap<>();

     char[] sv = s.toCharArray();
     Arrays.sort(sv);
     char[] tv = t.toCharArray();
     Arrays.sort(tv);
     String ss = new String(sv);
     String tt = new String(tv);


     

        for(int i = 0; i < s.length(); i ++){
            if(ss.charAt(i) == tt.charAt(i)){
                continue;
            }
            else{
                return false;
            }
        }


        return true;
    }
}
