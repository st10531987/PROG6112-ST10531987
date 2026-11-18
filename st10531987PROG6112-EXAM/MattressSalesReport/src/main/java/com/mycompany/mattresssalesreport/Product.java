/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssalesreport;

public class Product implements IProduct {

    private String[] products;
    private int[][] sales;

    public Product(String[] products, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }

        return total;
    }

    @Override
    public double GetAverageProductsSold() {
        return (double) GetTotalProductsSold()
                / products.length;
    }

    @Override
    public String GetMostPopularProduct() {
        int highestTotal = -1;
        String popular = "";

        for (int i = 0; i < sales.length; i++) {
            int productTotal = 0;

            for (int j = 0; j < sales[i].length; j++) {
                productTotal += sales[i][j];
            }

            if (productTotal > highestTotal) {
                highestTotal = productTotal;
                popular = products[i];
            }
        }

        return popular;
    }
}