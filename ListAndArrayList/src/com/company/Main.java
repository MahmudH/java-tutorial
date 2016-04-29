package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine();
            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }

        }
    }

    public static void printInstruction() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 -  To quit the application");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(s.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Please enter the current item name ");
        String itemNo = s.nextLine();
        s.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = s.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item name: ");
        String itemNo = s.nextLine();
        s.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchItem() {
        System.out.println("Item to search for: ");
        String searchItem = s.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in the grocery list ");
        } else {
            System.out.println(searchItem + " not found in the grocery list");
        }
    }
}
