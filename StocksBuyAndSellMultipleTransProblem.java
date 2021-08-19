package arrays;

public class StocksBuyAndSellMultipleTransProblem {

    private static int maxProfitWithContinuousBuyAndSell(int prices[]) {

        int total_profit=0;

        for(int i =1;i<prices.length;i++){

            if(prices[i]>prices[i-1])
                total_profit+=Math.subtractExact(prices[i], prices[i-1]);
                System.out.println(total_profit);
        }
        return total_profit;

    }

    public static void main(String[] args) {


        // int prices[] = {100, 180, 260, 310,
        //     40, 535, 695};

        int prices[] = {7,1,5,3,6,4};

        int maxProfit = maxProfitWithContinuousBuyAndSell(prices);

        System.out.println("Max profit from n transactions =  "+maxProfit);
    }

}
