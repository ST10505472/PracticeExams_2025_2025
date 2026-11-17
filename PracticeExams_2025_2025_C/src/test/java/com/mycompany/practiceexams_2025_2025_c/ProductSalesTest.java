
package com.mycompany.practiceexams_2025_2025_c;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author reaganrichards
 */
public class ProductSalesTest {
    
        int [][] ProductSales = {
    
        {300, 150, 700},
        {250, 200, 600},
    };
        
            @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        ProductSales instance = new ProductSales();
        int expected = 2200;
        int actual = instance.TotalSales(ProductSales);
        assertEquals(expected, actual);
    }
 
    @Test
    public void AverageTicketSales_ReturnsAverageTicketSales() {
        ProductSales instance = new ProductSales();
        double expected = 366.6666666666667;
        double actual = instance.AverageSales(ProductSales);
        assertEquals(expected, actual);
    }
    
    public ProductSalesTest() {
    }

    @Test
    public void testTotalSales() {
    }

    @Test
    public void testAverageSales() {
    }

    @Test
    public void testMaxSale() {
    }

    @Test
    public void testMinSale() {
    }
    
}
