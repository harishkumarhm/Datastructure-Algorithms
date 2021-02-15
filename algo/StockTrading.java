package algo;

public class StockTrading {
/*
 * Suppose we could access yesterday's stock prices as a list, where:

The indices are the time in minutes past trade opening time, which was 9:30am local time.
The values are the price in dollars of Apple stock at that time.
So if the stock cost $500 at 10:30am, stock_prices_yesterday[60] = 500.

Write an efficient function that takes stock_prices_yesterday and returns the best profit I could have made from 1 purchase and 1 sale of 1 Apple stock yesterday.
 */
public static void main(String[] args)
{
	int[] stock_prices_yesterday = {10, 7, 5, 8, 11, 9};
	//int[] stock_prices_yesterday = {10, 9,8,7,6,5,4,3};
//	int selling = 0;
//	int buying = 0;
//	int best_buying = stock_prices_yesterday[0];
//	int best_selling_idx = 1;
//	int best_buying_idx = 0;
//    int best_selling = 0;
//	for(int i=0; i<stock_prices_yesterday.length-1; i++)
//	{  
//		buying = stock_prices_yesterday[i];
//		selling = stock_prices_yesterday[i+1];
//		if(selling > best_selling ||  best_selling_idx < best_buying_idx)
//			{best_selling = selling;
//			best_selling_idx = i+1;
//			}
//		if(best_buying > buying)
//		{
//			best_buying = buying;
//			best_buying_idx =i;
//		}
//	}
//		System.out.println("Best Buyng: "+best_buying + " Best Selling " + best_selling);
//	}	
//	
	int min_price = stock_prices_yesterday[0];
	int max_profit = -1;
	int curr_price =0;
	int curr_profit =0;
	for(int i= 1; i < stock_prices_yesterday.length-1; i++)
	{
		curr_price = stock_prices_yesterday[i];
		curr_profit = curr_price - min_price;
		min_price = Math.min(min_price, curr_price);
		
		max_profit = Math.max(curr_profit, max_profit);
	}
	System.out.println("Minimum buying price: " + min_price + " Maximum Profit: "+ max_profit);
}
}
