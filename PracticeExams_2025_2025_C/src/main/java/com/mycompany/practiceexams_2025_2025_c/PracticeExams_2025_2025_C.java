/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practiceexams_2025_2025_c;

/**
 *
 * @author reaganrichards
 */
public class PracticeExams_2025_2025_C {

    public static void main(String[] args) {
        
        ProductSales sales = new ProductSales();
        
            int [][] ProductSales = {
    
        {300, 150, 700},
        {250, 200, 600},
    };
            System.out.println("");
            System.out.println("PRODUCT SALES REPORT - 2025");
            System.out.println("---------------------------------------\n");
            System.out.printf("Total Sales:         %d%n" , sales.TotalSales(ProductSales));
            System.out.printf("Average Sales:       %.0f%n", sales.AverageSales(ProductSales));
            System.out.printf("Maximum Sales:       %d%n", sales.MaxSale(ProductSales));
            System.out.printf("Minimum Sales:       %d%n", sales.MinSale(ProductSales));
            System.out.println("---------------------------------------\n");
    }
}
