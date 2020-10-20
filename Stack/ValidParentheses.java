class Solution {

    public boolean isValid(String s) {
        HashMap<Character, Character> maps=new HashMap();
        Stack<Character> stack = new Stack();
        maps.put(')','(');
        maps.put('}','{');
        maps.put(']','[');
        
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(maps.containsKey(c)){
                char topElement = stack.empty() ? '#':stack.pop();
                if(topElement!=maps.get(c)){
                    return false;
                }
            } 
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
