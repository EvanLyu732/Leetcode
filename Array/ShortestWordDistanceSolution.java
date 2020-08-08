class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int dis=words.length;
        int p1=-1,p2=-1;
        
         for(int i=0; i<words.length; i++){
            if(words[i].equals(word1)){
                p1=i;
            }else if(words[i].equals(word2)){
                p2=i;
            }
            if(p1!=-1 && p2!=-1){
                 dis=Math.min(dis,Math.abs(p1-p2));
             }
         }
        return dis;
        }
}

