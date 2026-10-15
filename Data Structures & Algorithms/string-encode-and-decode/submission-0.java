class Solution {

    public String encode(List<String> strs) {
        String encoded = "";

        for(int i = 0; i < strs.size(); i ++){
            encoded += strs.get(i).length();
            encoded += "#";
            encoded += strs.get(i);
        }

        return encoded;
    }

    public List<String> decode(String str) {
       List<String> result = new ArrayList<>();
    int i = 0;
    while (i < str.length()) {
        // 1. move j from i until str.charAt(j) == '#'
        int j = i;

        while(j < str.length()){
            if(str.charAt(j) != ('#')){
                j ++;
            }
            else{
                break;
            }
        }

        // 2. length = Integer.parseInt(str.substring(i, j))
        int length = Integer.parseInt(str.substring(i, j));

        // 3. grab str.substring(j + 1, j + 1 + length)
        result.add(str.substring(j + 1, j + 1 + length));

        // 4. move i to j + 1 + length
        i = j + 1 + length;
    }
    return result;
    }

}
