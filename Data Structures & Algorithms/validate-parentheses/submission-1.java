class Solution {
    public boolean isValid(String s) {
        Stack<Character> stac = new Stack<>();


        for(int i = 0; i <s.length(); i ++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stac.push(s.charAt(i));
            }
            else{
                if(stac.isEmpty()) return false;
                if(s.charAt(i) == ')'){
                    if(stac.pop() != '('){
                        return false;
                    }                    
                }
                else if(s.charAt(i) == '}'){
                    if(stac.pop() != '{'){
                        return false;
                    }
                }
                else if(s.charAt(i) == ']'){
                    if(stac.pop() != '['){
                        return false;
                    }
                }
            }

        }

        if(stac.isEmpty()){
            return true;
        }
        return false;
    }
}