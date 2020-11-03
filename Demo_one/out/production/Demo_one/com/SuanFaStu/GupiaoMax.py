def maxProfit(prices:list):
    max = 0
    for i in range(1,len(prices)):
        j = i - 1
        if(prices[i] > prices[j]):
            sub = prices[i] - prices[i-1]
            max += sub
    return max

prices = [1,7,2,3,6,7,6,7]
ans = maxProfit(prices)
print(ans)