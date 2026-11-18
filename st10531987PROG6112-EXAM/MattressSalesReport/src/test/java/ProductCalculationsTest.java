/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductCalculationsTest {

    @Test
    public void GetVat_WithValidData_ReturnsCorrectValue() {

        ProductCalculations calculations =
                new ProductCalculations(3500);

        double expected = 525.00;
        double actual = calculations.GetVat();

        assertEquals(expected, actual, 0.001);
    }

    private static class ProductCalculations {


        private ProductCalculations() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private ProductCalculations(int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private double GetVat() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
@Test
public void GetTotal_WithValidData_ReturnsCorrectValue() {

    // Arrange: Create a product with price R3500
    ProductCalculations calculations =
            new ProductCalculations(3500);

    // Expected total:
    // Price = R3500
    // VAT = R525
    // Commission = R175
    // Total = R4200

    double expected = 4200.00;

    // Act: Calculate actual total
    double actual = calculations.GetTotal();

    // Assert: Compare expected and actual
    assertEquals(expected, actual, 0.001);
}