package Array;

public class BuyAndSellStocks {
	public static void main(String[] args) {
		int[] prices = {7, 1, 5, 3, 6, 4};// buy the stock price at 1 and sell at 6 which makes profit of 5
		int res = maxProfit(prices);
		System.out.println(res);
	}
	
	public static int maxProfit(int[] prices) {
        // TODO
//        int minIndex = Integer.MAX_VALUE;
//        for(int i=0;i<prices.length-1;i++){
//            for(int j=i+1;j<prices.length;j++){
//                if(prices[i]<prices[j] && prices[i]<minIndex){
//                    minIndex = prices[i];
//                }
//            }
//        }
//        int maxIndex = 0;
//        for(int i=minIndex;i<prices.length-1;i++) {
//        	if(prices[i]<prices[i+1]) {
//        		maxIndex = prices[i+1];
//        	}
//        }
//        int result = maxIndex-minIndex;
		
		int minprice = Integer.MAX_VALUE;
		int maxPrice = 0;
		
		
		for(int price : prices) {
			if(price<minprice) {
				minprice= price;
			}else if((price-minprice)>maxPrice) {
				maxPrice=price-minprice;
			}
		}
        return maxPrice;
    }
}
