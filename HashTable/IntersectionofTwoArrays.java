class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet();
        Set<Integer> intersection = new HashSet();
        
        for(Integer num: nums1){
            set1.add(num);
        }
        
        for(Integer num: nums2){
            if(set1.contains(num)){
                intersection.add(num);
            }
        }
        
        int[] result=new int[intersection.size()];
        
        int i=0;
        for(Integer num: intersection){
            result[i++]=num;
        }
        return result;
        
    }
}
