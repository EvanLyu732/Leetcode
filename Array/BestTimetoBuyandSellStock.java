class Solution {
    public static int maxProfit(int[] prices) {
        // start buyprice is infinite;
        int Buyprice=10000000;
        int profit=0;
        for(int i=0; i< prices.length; i++){
            if(prices[i]<Buyprice){
                Buyprice=prices[i];
            }
            else if(prices[i]-Buyprice>profit)
                profit=prices[i]-Buyprice;
        }
        return profit;
        }
    
    public static void main(String[] args){
        int[] prices={7,1,5,3,6,4};
        maxProfit(prices);
    }
        
    }
