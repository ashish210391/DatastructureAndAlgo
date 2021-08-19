package arrays;

public class StocksBuyAndSellProblem {



    private static int maxProfitFromStocksBuyAndSell(int ar[]){


        int len = ar.length-1;
        int maxProfit = 0;
        int localMinima = ar[0];
        for(int i=0;i<=len;i++){

            localMinima=Math.min(localMinima, ar[i]);
            maxProfit=Math.max(maxProfit, ar[i]-localMinima);

        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int ar[] = { 100, 180, 260, 310,
            40, 535, 695 };
       int maxProfit= maxProfitFromStocksBuyAndSell(ar);

       System.out.println("Maximum profit is "+maxProfit);
    }
    
}
