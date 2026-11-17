
package com.mycompany.practiceexams_2025_2025_g;


public class ProductSales implements IProductSales {
    
    private int [][] sales = {
        
        {300, 150, 700},
        {250, 200, 600},
        
    }; 
    
    
    private final int SALES_LIMIT = 500;

    @Override
    public int[][] GetProductSales() {

        return sales;
    }

    @Override
    public int GetTotalSales() {
        
        int total = 0;
        
        for (int row = 0; row < sales.length;row++)
        {
            for (int col = 0; col < sales[row].length; col++)
            {
                total += sales[row][col];
            }
        }
        return total;
    }

    @Override
    public int GetSalesOverLimit() {
        
               int over = 0;
        
        for (int row = 0; row < sales.length;row++)
        {
            for (int col = 0; col < sales[row].length; col++)
            {
            
              if (sales[row][col] > SALES_LIMIT){
             }
          }
        }
        
        return over;

              }
            
    @Override
    public int GetSalesUnderLimit() {
                       int under = 0;
        
        for (int row = 0; row < sales.length;row++)
        {
            for (int col = 0; col < sales[row].length; col++)
            {
            
              if (sales[row][col] < SALES_LIMIT){
             }
          }
        }
        
        return under;

    }

    @Override
    public int GetProductsProcessed() {

        return sales.length;
    }

    @Override
    public double GetAverageSales() {
        
        int count = 0;
        
        for (int row = 0; row < sales.length; row++)
        {
            for (int col = 0; col < sales[row].length; col++)
            {
            count++;
            }
        }
        if (count == 0)
        {
            return 0;
        }
        return (double) GetTotalSales()/count;
    }
    
}