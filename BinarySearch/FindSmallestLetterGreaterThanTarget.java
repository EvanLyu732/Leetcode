class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ch=letters[0];
        
        //compare each ch whether if it is greater than target or not.
        for(int i=0;i<letters.length;i++){
            if(letters[i]>target){
                 ch=letters[i];
                 break;
             }
        }
     return ch;
    }
}
