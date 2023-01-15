package com.Stock_Management;

import jdk.internal.icu.text.UnicodeSet;

import java.util.Scanner;

public class Stock_M {


    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        StockPortfo p = new StockPortfo();
        while (flag == 0) {
            System.out.println("----Enter details of Stock ");
            StockPortfo.Stock s = p.new Stock();
            System.out.println("Enter Company Name:");
            s.company = sc.nextLine();
            System.out.println("Enter number of share:");
            s.noOfShare = sc.nextInt();
            System.out.println("Enter Price of share:");
            s.price = sc.nextDouble();

            p.portf.add((CharSequence) s);
            System.out.println("Want to enter more Stocks? enter 0 for YES or 1 for NO!");
            flag = sc.nextInt();
        }
        for (int i = 0; i < p.portf.size(); i++) {
            System.out.println(p.totalValue());

        }
    }
}

class StockPortfo {
    public UnicodeSet portf;
    double totalValue = 0;

    public boolean totalValue() {
        return false;
    }

    class Stock {
        int noOfShare;
        String company;
        double price;
    }

     {

    }
}