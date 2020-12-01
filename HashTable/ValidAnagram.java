import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        HashMap<Character, Integer> map = new HashMap();
        
        for (char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        
        for (char f: t.toCharArray()) {
            int count = map.getOrDefault(f,0);
            if (count == 0) {
                return false;
            }
            map.put (f, count-1);
        }
        return true;
    }
}
