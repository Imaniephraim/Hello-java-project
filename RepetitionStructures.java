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







}
}

