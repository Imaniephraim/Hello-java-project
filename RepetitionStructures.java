import javax.crypto.spec.PSource;
import java.util.Scanner;

public class RepetitionStructures {
    /**
     * Repetition Control Structures
     * <p>
     * are java statements that allow us to specific blocks of a code a number of times
     * <p>
     * there are 3 types
     * <p>
     * while loop
     * do-while loop
     * for loop
     */

    public static void main(String[] args) {
        // 1. while loop-> is a statement or block of code that is repeated a long as some condition is satisfied.

        //while loop has the form(syntax)

        //    while (boolean_expression) {
        //      statement1;
        //    statement2;


        //The statement s inside the while loop are executed as long as the boolean_expression evaluates to true.

        //EXAMPLE
        //write a while loop that prints the integers 1 2 3 4 5 6 7 8 9 10

        int x = 1;

        //repeat as long as the value of x is less than 10
        while (x < 11) {
            System.out.println(x);
            // x++;
            // x += 1 ;
            x = x + 1 ;
        }


        System.out.println("============================");
       ;





        //output 0 2 4 6 8 10 12 14 16 18 20
        int X = 0;
        while (X < 21) {
            System.out.println(X);
            // X++;
            //X +=2;
            X = X +2 ;

        }

        //Output: 15 12 9 6 3 0 -3 -6 -9 -12 -15
        int y = 15;
        while (y >=-15) {
            System.out.println(y);
            y = y -3;
}
        //do...while
    //are statements inside a do while loop are executed several types a s long as the conditions are satisfied(true)
    // is similar to a while loop, the main difference is that statement inside a so-while loop are executed at least once


    //syntax
   // do {
       // statement1;
      //  statement2
   // }while (boolean_expression);


    //output: 1 2 3 4 5 6 7 8 9 10

    int m = 1;

       do {
        System.out.println(m);
        m++;
      }  while (m <= 10);

   // 0 5 10 15 20 25 30 35 40 45 50
    //50 45 40 35 30 25 20 15 10 5 0


        // solution 1
int k = 0;

do {
    System.out.println(k);
    k = k + 5;
}  while (k < 51);


        System.out.println("==================================");


//solution 2
        int i =50;

        do {
            System.out.println(i);
            i = i - 5;
        }  while (i > -1);

        System.out.println("=============================================");

   //3. for loop
        //allows execution of same code a number of times

        //syntax

        //for (initialisationExpression; loopCondition; StepExpression;) {
         //   statement1;
         //   statement2;
       // }

        //where;
        //-> InitializationExpression: initialize the loop expression
        //->LoopCondition: compares the loop variable to some limit
        //->StepExpression: updates the loop variable

        //Example:
        // output the values 1 2 3 4 5 6 7 8 9 1o
        for (int a = 1; a < 11; a++) {
            System.out.println(a);
        }
        System.out.println("=====================");



        //output 10 20 30 40 50 60 70 80 90 100
        for (int d = 10; d < 101; d+=10) {
            System.out.println(d);
        }

        System.out.println("===================");

        // Branching statements
        //Branching statements allows us to redirect the flow of program execution
        //Java offers three branching statements
        //i. break
        //ii. continue
        //iii. return

        //Break statement
        //Terminates the enclosing switch statement and flow of control transfers to the statement immediately following the switch statement.
        //This can also be used to terminate the for, while or do-while loop.

        String [] studentNames = {"Joannoah", "Bradley" , "Muzna", "Hamza" ,"Bradley" ,"ian", "Benson" ,"Praise", "Frank", "Ephraim", "Ryan", "Nathan","Yasmin", "Dominic", "Phill", "Brenda"};

        // create a scanner object
       Scanner sc= new Scanner(System.in);

       //ask user for the name they want to search in file
        System.out.println("Enter name of student you wish to search in file: ");
        String searchName = sc.next();
        boolean foundName = false;

        for (int idx = 0; idx < studentNames.length; idx++){
            if (studentNames[idx].equals(searchName)) {
                foundName = true;
                break;
            }
        }

        if (foundName == true) {
            System.out.println(searchName + " found!");
        } else {
            System.out.println(searchName + "not found!");
        }
        System.out.println("=======================");


        //ii. Continue
        //skips to the end of the innermost loops body and evalustes the boolean expression that controls the loop, basically skipping the remainder of this iteration of the loop

        //Example
        String[] names = {"Beah", "Bianca", "Lance", "Beah"};

        int count = 0;

        for (int p = 0; p< names.length; p++) {
            if (!names[p].equals("Beah")) {
                continue; //skip next statement
            }
            count++;
        }
        System.out.println("There are " + count + " Beahs in this list.");

        System.out.println("======================");

        //nested for loop
        //create a times table for a user provided number
        //ask user for the times table number
        System.out.println("Enter the times table number: ");
        int timesTable = sc.nextInt();

        for (int times = 1; times <= 12; times++) {
            System.out.println(timesTable + " X " + times + " = " + (timesTable * times));
        }

        System.out.println("======================");

        //create the whole times table
        for (int q = 1; q <=12; q++) {
            for (int r=1; r<=12; r++) {
                System.out.println(q + " X "  + r + " = " + (q*r));
            }
            System.out.println("--------------------");
        }

        System.out.println("======================");

        //iii. return statement
        // is used to exit from the current method
        // flow of control returns to the statement that follows the original method call.
        // to return, simply put is the value (or an expression that calculates the value) after the return keyword
        //For example:
        //return count++; or return "Java";
        //the type of data declared by the method must match the type of value returned by the returned statement
        // when a method is declared void, use the form of return that doesn't return a value.
        //For example return;
        //we will cover more about return statements later we discuss about methods.


        //close our scanner object
        sc.close();

        //Java Arrays















































}
}

