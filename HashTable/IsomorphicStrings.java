class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() !=t.length()){
            return false;
        }
        HashMap<Character, Character> map = new HashMap();
        
        for(int i=0; i<s.length(); i++){
            // get char
            char si= s.charAt(i);
            char ti= t.charAt(i);
            // si maps ti, if ti duplicated or si multi map then return flase;
            if(map.containsKey(si)){
                if(map.get(si) !=ti) return false;
            }else{
                if(map.containsValue(ti)) return false;
            }
            map.put(si,ti);
        }
        return true;
        
    }
}
