package com.SuanFaStu;

public class GupiaoMax {
    public static int maxProfit(int[] prices){
        return calculate(prices,0);
    }
    public static int calculate(int[] prices,int s){
        if(s >= prices.length) return 0;
        int max = 0;
        for(int start = s;start < prices.length;start++){
            int maxprofit = 0;
            for(int i=start+1;i<prices.length;i++){
                if(prices[start] < prices[i]){
                    int profit = calculate(prices,i+1)+prices[i]-prices[start];
                    if(profit > maxprofit){
                        maxprofit = profit;
                    }
                }
            }
            if(maxprofit > max){
                max = maxprofit;
            }
        }
        return max;
    }
    //所有上升线段都计算进去
    public static int maxProfit_01(int[] prices){
        int maxProfit = 0;
        for(int i = 1;i<prices.length;i++){
            if(prices[i] > prices[i-1]){
                int chazhi = prices[i] - prices[i-1];
                maxProfit += chazhi;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] ProfitPrice = new int[]{1,7,2,3,6,7,6,7};
        int ans = maxProfit(ProfitPrice);
        int ans_01 = maxProfit_01(ProfitPrice);
        System.out.println(ans_01);
    }
}
