
package com.mycompany.practiceexams_2025_2025_g;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author reaganrichards
 */
public class ProductSalesTest {
    
        private int [][] sales = {
        
        {300, 150, 700},
        {250, 200, 600},
        
    }; 
        
            @Test
    public void GetSalesOverTarget_ReturnsNumberOfSales() {
        ProductSales instance = new ProductSales();
        int expected = 2;
        int actual = instance.GetSalesOverLimit();
        assertEquals(expected, actual);
    }
 
    @Test
    public void GetSalesUnderTarget_ReturnsNumberOfSales() {
        ProductSales instance = new ProductSales();
        double expected = 4;
        double actual = instance.GetSalesUnderLimit();
        assertEquals(expected, actual);
    }
    
    public ProductSalesTest() {
    }

    @Test
    public void testGetProductSales() {
    }

    @Test
    public void testGetTotalSales() {
    }

    @Test
    public void testGetSalesOverLimit() {
    }

    @Test
    public void testGetSalesUnderLimit() {
    }

    @Test
    public void testGetProductsProcessed() {
    }

    @Test
    public void testGetAverageSales() {
    }
    
}
