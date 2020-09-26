class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> jset = new HashSet();
        for(char c: J.toCharArray()){
            jset.add(c);
        }
        int count=0;
        char[] sarray = S.toCharArray();
        for(char s: sarray){
            if(jset.contains(s)){
                count++;
            }
        }
        return count;
    }
}
