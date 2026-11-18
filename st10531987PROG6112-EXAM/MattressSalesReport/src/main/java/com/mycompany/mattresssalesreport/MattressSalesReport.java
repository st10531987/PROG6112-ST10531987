/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mattresssalesreport;

/**
 *
 * @author Student
 */

import java.util.Scanner;

public class MattressSalesReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[][] sales = new int[3][3];

        int totalSales = 0;
        int highestSales = 0;
        String popularProduct = "";

        // Enter sales for each mattress
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(
                    "Enter number of sales for month "
                    + (j + 1) + " for "
                    + products[i] + " mattress: "
                );

                sales[i][j] = input.nextInt();
            }
            System.out.println();
        }
    Product report = new Product(products,sales);
    PrintProduct printer =new
    PrintProduct(report);
    printer.printReport();
    
        // Calculate totals and most popular product
        for (int i = 0; i < products.length; i++) {

            int productTotal = 0;

            for (int j = 0; j < 3; j++) {
                totalSales += sales[i][j];
                productTotal += sales[i][j];
            }

            if (productTotal > highestSales) {
                highestSales = productTotal;
                popularProduct = products[i];
            }
        }

        // Average sales per product
        double averageSales = (double) totalSales
                / products.length;

        
     

input.close();
    }
}
