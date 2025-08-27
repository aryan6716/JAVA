package arrays;

public class buy_sell_stocks {
    public static int  profit(int prices[]){
        int  buy_price= prices[0];   // or Integer.MAX_VALUE;
        int maxprofit = 0; 
        for(int i=0 ; i<prices.length ;i++){
            if (prices[i] >  buy_price){
                int profit =prices[i] - buy_price;
                maxprofit =  Math.max(maxprofit,profit);
            }else{
                buy_price = prices[i];
            }
        }   
            return maxprofit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.print(profit(prices));
    }
}
//max prifit is when we buy the stock at the price of 1 and sell at 6 (6-1=5)