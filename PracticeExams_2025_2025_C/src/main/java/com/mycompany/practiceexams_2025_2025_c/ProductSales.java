
package com.mycompany.practiceexams_2025_2025_c;


public class ProductSales implements IProductSales {
    
    int [][] ProductSales = {
    
        {300, 150, 700},
        {250, 200, 600},
    };

    @Override
    public int TotalSales(int[][] productSales) {
        
        int TotalSales = 0;
        
        for (int row = 0; row < ProductSales.length; row++)
        {
            for (int col = 0; col < ProductSales[row].length; col++)
            {
                TotalSales += ProductSales[row][col];
            }
        }
        return TotalSales;
    }

    @Override
    public double AverageSales(int[][] productSales) {
        
        return (double) TotalSales(ProductSales)/6;

    }

    @Override
    public int MaxSale(int[][] productSales) {
                   
        int Max = 0;
        
        for (int row = 0; row < ProductSales.length; row++)
        {
            for (int col = 0; col < ProductSales[row].length; col++)
            {
                if (ProductSales[row][col] > Max)
                {
                Max = ProductSales[row][col];
                }
            }
        }
        return Max;
    }

    @Override
    public int MinSale(int[][] productSales) {
        
        int Min = ProductSales[0][0];
        
        for (int row = 0; row < ProductSales.length; row++)
        {
            for (int col = 0; col < ProductSales[row].length; col++)
            {
                if (ProductSales[row][col] < Min)
                {
                Min = ProductSales[row][col];
                }
            }
        }
    return Min;
    
    }
    }
