package com.company;
/*
    Program to generate Raven's Invoice

    Sample output:
    ********
   To:
    Dave Wolf
    12 S. Summit Ave
    Gaithersburg, MD 20877

    Items:
    Quantity Description Price Total
    1 Session 100.00 100.00
    10 Questions .35 3.50

    Total Due: $103.50

    Thank you for doing business with Raven.
    ******
 */

import java.util.Scanner;

public class Invoice {
    String name;
    String address;
    String city;
    String state;
    String zip;
    float price;
    int quantity;


    public Invoice() {
        name = new String("");
        address = new String("");
        city = new String("");
        state = new String("");
        zip = new String("");
        price = 0;
        quantity = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void getPersonalInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        this.setName(scanner.nextLine());
        System.out.print("Enter your address: ");
        this.setAddress(scanner.nextLine());
        System.out.print("Enter your city: ");
        this.setCity(scanner.nextLine());
        System.out.print("Enter your state: ");
        this.setState(scanner.nextLine());
        System.out.print("Ener your zip: ");
        this.setZip(scanner.nextLine());


    }
    public void printInvoice() {

        System.out.println("\n\n*********** INVOICE ************\n");

        System.out.println("To: ");
        System.out.println("" +getName());
        System.out.println("" +getAddress());
        System.out.println("" + getCity() +", "+getState() +" "+getZip());

        System.out.println();
        System.out.println("Items: ");
        System.out.println("Quantity Description Price Total");
        System.out.println("===================================");
        System.out.println(""+"1 \t\tsession\t\t" +"$100.00\t" +"$100.00");
        double price = .35*getQuantity();
        System.out.format(""+getQuantity() +" \t\tQuestions\t" +"$.35\t$%.02f\n", price);
        double total = 100+price;
        System.out.println();
        System.out.println();
        System.out.println("===================================");
        System.out.format("Total Due:\t\t"+"$%.02f\n", total);
        System.out.println("\n\n" + "Thank you for doing business with Raven.");

    }
}
