class TwoSum {
    HashMap<Integer, Integer> map;
    /** Initialize your data structure here. */
    public TwoSum() {
        this.map = new HashMap();
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
        if(this.map.containsKey(number)){
            this.map.replace(number,this.map.get(number)+1);
        }else{
            this.map.put(number,1);
        }
    }
    
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        for(int current: this.map.keySet()){
            int complement = value -current;
            if(this.map.containsKey(complement) && (current!=complement || this.map.get(current)>1))
                return true;
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */
