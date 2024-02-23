public class Variables {
    /**
     * Variables in java
     * <p>
     * A variable is a named memory location in the computer's memory for storing different types of
     * A variable is an item for storing the state of objects
     * A variable is a container or box for holding data
     * <p>
     * A variable has:-
     * data type->specifies the type of data that the variable can hold
     * name->used to reference the variables (must folllow the identifier rules)
     */
    public static void main(String[] args) {

    }

    {
        //Declaring and initialising variables
        // in java we declare variables as follows:
        //<data_type> ,variable name> [= initial_value];
        //declare and initialise 8 variables of 8 data types

        // String
        String userName = "Dennis";
        //Interger
        int userAge =18;

        //Byte
        byte userId = 100;

        //Short
        short userStaffNumber =12345;

        //Long
        long userAccountBalance = 2557325757368L;

        //Float
        float userApprovedLoanAmount;

        ////character
        char favLetter ='d';
                //variable declared on one line(Not recommended)
        double quiz =10 ,exam =0, grade =0;

        //Recommended (Declare a single variable on a single line)
        double studentQuiz =10;
        double studentExam =0;
        double studentGrade =0;

        String firstName ="Dennis";
        String lastName ="Muthui";

        //Outputting variable data
        //System.out.println()->appends a line break
        //System.out.print()->appends the data on the same line
        System.out.println(firstName);
        System.out.print(lastName);

        String userGreeting = "Hello,";
        String userTarget = "World";

        System.out.println(userGreeting);
        System.out.print(userTarget);

        //In java programming we have two types of variables namely:
        //-> Primitive variables->stores data in the actual memory location of where the variable is e.g int, long
        int number =10; //Primitive variable example

        //-> Reference variables->stores the address in the memory location.Points to another memory location,where the actual data is e.g String
        String favLanguage = "Java";
    }



}
