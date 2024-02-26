public class Operators {
    /**
     * Operators in java
     *
     * We have different types of operators in java
     * 1. Arithmetic operators
     * Relational operators
     * Logical operators
     * Conditional operators
     *
     * They follow a certain precedence so that the compiler can know which operator to evaluate first in case multiple operators are used in statement
     */

    public static void main(String[] args){
        //1. Arithmetic operators
        //Addition-> +
        System.out.println("x+y");//returns 26

        //subtraction->-
        System.out.println("x-y");// returns 14

        //multiplication->*
        System.out.println("x*y");//returns 120

        //Division->/
        System.out.println("x/y");//returns 3.33333

        //Modulus->%(Finds the remainder of division)
        //System.out.println("x%y");//returns 2

        //2. Increment and decrement operators (++, --)
        // increment and decrement operators increase and decrease a value stored in a number by 1.
        // unary increment operator ++
        //unary decrement operators --

        //For example: count = count + 1; increment the value of count by 1
        //the above example is equivalent to: count++

        //operator     Use    Description
        //++           x++    Increment X by 1; evaluates to the value of x before it was incremented
        //++           ++x    Increment x by 1; evaluates to the value of x after it was incremented
        //--           x--    Decrement x by 1; evaluates to the value of x before it was decremented
        //--           --x    Decrements x by 1; evaluates to the value of x after it was decremented

        //The increment and decrement of operators can be placed before or after an operand.

        // When used before an operand, it causes the variable to be incremented or decremented by 1 and then the new value is used in the expression in which it appears

        //For example:
        int i =10;
         int j=3;
         int k=0;

         k =++j + i; // will result to k = 4 + 10+ 14
        System.out.println("The value of k is: " + k);

        k = j++ + i; //
        System.out.println("The value of k is: "+ k);

        int op = 1;
        System.out.println(op++); //1
        System.out.println(op); //2

        k = j-- + i;
        System.out.println(k);
        System.out.println(j);

        //3. Relational operators
        // Relational operators compare two values and determine the relationship between those values
        // the output of the evaluation is a boolean value -> true or false

        //Operator   Name                           Use      Description
        //>          greater than                    x>y      x is greater than y
        //.=         greater than or equal to       x>=y     x is greater thn or equal to y
        //<          less than                      x<y      x is less than y
        //<=         less than or equal to          x<=y      x is less than or equal to y
        //==         equal to                       x==y     x is equal to y
        //!=         not equal to                   x!=y     x is not equal to y

        int a=20;
        int b=6;
        // EXAMPLES:

        //Greater than
        System.out.println("20>6? " + (a > b));
        System.out.println("20 >= 6? " + (a >b ));
        System.out.println("20 < 6?"  + (a < b));
        System.out.println("20 <= 6" + (a <= b));

        //4. Logical operators
        // have one or two boolean operands that yield a boolean result

        int c= 2;
        int d = 1;

        //There are 3 logical operators

        //i. logical AND -> when using logical AND operator, both operand(expressions) must evaluate to true to get a true result
        //symbol ->&&
        //X1     X2     Result
        //TRUE   TRUE    TRUE
        //TRUE   FALSE   FALSE
        //FALSE  TRUE    FALSE
        //FALSE  FALSE   FALSE
        // Examples
        System.out.println((c > d) && (c < d));
        System.out.println((c <= d) && (d != c));

        //ii. logical OR-> when working with logical OR, you only need one operand (expression) to evaluate to true to get the entire result true.
        //symbol-> ||
        //Logical OR Truth table
        //X1      X2        Result
        //TRUE    TRUE      TRUE
        //TRUE    FALSE     TRUE
        //FALSE   TRUE      TRUE
        //FALSE   FALSE     FALSE
        //Example
        System.out.println((2 == 1)  || (2> 2));
        System.out.println((2 != 1) || (2 != 2));

        //III. logical NOT
        // Takes in one argument, wherein that argument can be expression, variable or constant.
        //Symbol-> !

        //x1      Result
        //TRUE    FALSE
        //FALSE   TRUE

        boolean isRaining = true;
        boolean isRunning = false;

        System.out.println(!isRaining);
        System.out.println(!isRunning);


        // a login program

        //create variables here
        //User login credentials
        String userName = "Ephraim";
        String password ="password";

        //correct user credentials
        String correctUsername ="Ephraim";
        String correctPassword ="password";

        // check if the user entered the correct credentials
        if ((userName == correctUsername) && (password == correctPassword)) {
            // if user credentials match (meaning true), login the user
            System.out.println("Logged in Successfully!");
        } else {
            // if user credentials do not match(meaning false), throw an error
            System.out.println("Invalid Username or Password, Please try again!");

        }

        //5. Conditional Operator
        //Symbol -> ?:
        //is also called a ternary operator
        //the structure/syntax of an expression using a conditional operator is
        //exp1 ? exp2 : exp3

        //wherein:
        //exp1-> is a boolean expression whose result must either be true or false.

        //Result:
        //if exp1 is true, exp2 is the result returned
        //if exp 1 is false, then exp3 is the result returned

        String status ="";
        int grade = 80;

        //get the status of thr student
        status = (grade >= 60) ? "Passed" : "Failed";
        System.out.println(status);

        //Getting input from Keyboard














    }
}

































