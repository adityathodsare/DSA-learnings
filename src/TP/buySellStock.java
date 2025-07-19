package TP;

public class buySellStock {

    public static  int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;

        for (int price: prices){

            if (price <minPrice){
                minPrice = price;
            }

            if (price-minPrice > maxPrice){
                maxPrice = minPrice-price;
            }

        }
        return maxPrice;
    }
}
