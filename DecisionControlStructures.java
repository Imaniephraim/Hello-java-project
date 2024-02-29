import java.util.Scanner;

public class DecisionControlStructures {
    /**
     * Decision Control Structures
     * <p>
     * These are java statements that allow us to select and execute specific block of code while skipping other sections
     * <p>
     * There are  three types :
     * <p>
     * i, if statement
     * ii. if-else statement
     * iii. if-else-if-statement
     */
    public static void main(String[] args) {
        //i. if statement
        //specifies that a statement (or block of code) will be executed if and only if a certain boolean statement is true

        //syntax
        // if (boolean_expression)
        //     statement1;
        //     statement2;
        // }

        // where;
        //-> boolean_expression is either a boolean expression or boolean variable.

        //Example
        int grade = 68;

        //Print congratulations if grade is greater than 60
        if (grade > 60)
            System.out.println("Congratulations");
        //OR
        if (grade > 60) {
            System.out.println("Congratulations");
        }

        //Print congratulations if grade is greater than 60 and also print "You Passed!"
        if (grade > 60) {
            System.out.println("Congratulations");
            System.out.println("You Passed!");
        }

        System.out.println("==================");

        //ii. if else statement
        //used when we want to execute a certain statement if a condition is true and a different statement if the condition is false.

        // syntax
        // if (boolean_expression) {
        //  statement1;
        //   statement2;
        // } else {
        //   statement3;
        //   statement4;
        // }

        //Example:prints "Congrats" if grade is greater than 60, otherwise print "Sorry you failed"

        if (grade > 60) {
            System.out.println("Congratulations");
        } else {
            System.out.println("Sorry you failed");

        }

        System.out.println("================");

        //iii. if-else-if-else statement
        //The statement in the else of an if-else block can be another if-else structures
        //This cascading of structures allow us to make more complex selection
        //used to execute multiple courses of action

        //syntax

        //if(condition) {
        //  statement will execute if condition one is true
        // } else if (condition2) {
        //   statement will execute if conditio1 is false and condition12 is true
        // } else if (condition3) {
        // statement will execute if condition1 and condition2 are false and condition3 is true
        //} else {
        //   will execute if all conditions are false
        //   }

        //Example

        //print "Excellent" if grade is greater than 90, "Ver Good" if it is greater than 60, otherwise "Sorry You Failed"

        if (grade > 90) {
            System.out.println("Excellent");
        } else if (grade > 60) {
            System.out.println("Very Good");
        } else {
            System.out.println("Sorry You Failed");
        }

        //Switch case statement
        // a switch allows branching of multiple outcomes
        // it has the following form(syntax)

        //switch(switch_expression) {
        //   case case_select1:
        //  statement1;
        //statement2;
        //  break;
        //  case case_selector2
        ;
        //  statement1;
        // statement2;
        //   break;
        //default:
        //statement1;
        //statement2;
        //}

        //where:
        //-> switch expression is an integer or character expression.
        //-> case_selector1 case_selector2 and so on: are unique integer or character constants

        //when a switch statement is encountered :-
        // Java first evaluates the switch_expression, and jumps to the case whose selector matches the value of the expression.
        // The program executes the statement in order from that point on until a break statement is encountered, skipping them to the first statement after the end of the switch structure
        // If none of the cases are satisfied, the default block is executed. Take note however that the default part is optional.

        //NOTE:
        // unlike with the if statement, the multiple statement are executed with the switch without needing the curly braces.

        //when a case in a switch statement has been matched, all the statements associated with that case are executed. Not only that, the statements associated with succeeding cases are also executed.
        //to prevent the program from executing statements in the subsequent cases, we use a break statement as our last statement.

        int score = 90;

        switch (score) {
            case 100:
                System.out.println("Excellent");
                break;
            case 90:
                System.out.println("Good Job");
                break;
            case 80:
                System.out.println("Study Harder");
                break;
            default:
                System.out.println("Sorry, You Failed");


        }


        //create a java program using switch statement that asks the user for an integer between 1 and 7 inclusive  and then outputs the day of the week e,g if the user entered 1, then outputs the day of the week.//


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer between 1 and 7");
        int dayNumber = sc.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
            default:
                System.out.println("Invalid day please enter an integer between 1 and 7");


                //2. ask the user for a colour and then print if that is their favorite colour if it matches with the one in the system

                String favoriteColor = null;

                System.out.println("Enter any color: ");
                favoriteColor = sc.next();

                switch (favoriteColor) {
                    case "red":
                        System.out.println("Your favorite color is " + favoriteColor);
                        break;
                    case "green":
                        System.out.println("Your favorite color is" + favoriteColor);
                        break;
                    default:
                        System.out.println("We don't know your favorite color!");

                }
        }
    }
}









































