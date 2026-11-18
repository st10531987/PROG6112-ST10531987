/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssalesreport;

public class PrintProduct {

    private Product product;

    public PrintProduct(Product product) {
        this.product = product;
    }

    public void printReport() {

        System.out.println();
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("********************************");

        System.out.println(
            "TOTAL PRODUCT SALES: "
            + product.GetTotalProductsSold()
        );

        System.out.printf(
            "AVERAGE PRODUCT SALES: %.2f%n",
            product.GetAverageProductsSold()
        );

        System.out.println(
            "MOST POPULAR PRODUCT: "
            + product.GetMostPopularProduct()
        );
    }
}
