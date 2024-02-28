import java.util.Scanner;

public class ScannerExercise {
    /*

    A shopkeeper wants to streamline the process of calculating the total price of items purchased by customer and offer discounts based on the total amount.Write the java program using the 'Scanner' class to assist the shopkeeper in achieving this.

    The shop offers the following items with respective prices:
    Milk - ksh 67.50
    Bread - ksh 95.00
    Eggs - ksh 20.50
    Sugar - ksh 250.00
    Tea Masala - ksh 76.99

    The java program should perform the following task:
    1. Prompt the shopkeeper to input the quantity of each item sold (in integers) using the Scanner class
    2. Calculate the total price of all items
    3. Apply a discount of 10% if the total is over ksh 1000
    4. Display the total price, the applied discount(if any)and the final balance payable by the customer
     */

    public static void main(String[] args) {
        //Create a scanner object
        //display the name of your shop
        //define the prices of the items
        //prompt the shopkeeper to enter the quantity of each item
        //calculate the total price of all items
        //Apply discount if total price is over ksh 1000
        //calculate the final balance payable by the customer
        //Display  the result



        //Create a scanner object
        Scanner sc = new Scanner(System.in);

        //Display name of shop
        String shopName = "Wallmart";
        System.out.println(shopName);

        //define prices of each item
        double milk = 67.50;
        double bread = 95.00;
        double eggs = 20.50;
        double sugar = 250.00;
        double teaMasala = 76.99;

        //prompt shopkeeper to enter quantity of each item

        System.out.print(" Enter quantity of each milk: " );
        int milkQuantity = sc.nextInt();
        System.out.println(" Enter quantity of each bread: " );
        int breadQuantity = sc.nextInt();
        System.out.println(" Enter quantity of each egg: " );
        int eggsQuantity = sc.nextInt();
        System.out.println(" Enter quantity of each sugar: " );
        int sugarQuantity = sc.nextInt();
        System.out.println(" Enter quantity of each teaMasalaQuantity: " );
        int teaMasalaQuantity = sc.nextInt();

        //calculate total price
        double TotalPrice = (milk + milkQuantity) + (bread + breadQuantity) + (eggs + eggsQuantity) + (sugar + sugarQuantity)  + (teaMasala + teaMasalaQuantity);

        //Apply discount if total price s over 1000
        double discount = (TotalPrice > 1000) ? (TotalPrice * 0.10) : 0.0;

        //Calculate the final balance payable by the customer
        double finalBalance = TotalPrice - discount;
        //display the results
        System.out.println("============================");
        System.out.println("TotalPrice: ksh" + TotalPrice);
        System.out.println("Discount Applied: ksh " + discount);
        System.out.println("Final balance: ksh " + finalBalance);
        System.out.println("======================");


        // Display total price and final balance payable by customer
        System.out.println("Display total price: " + TotalPrice);

        //close the scanner object
        sc.close();






    }



}
