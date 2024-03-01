public class JavaArray {
    /**
     * Java Arrays
     *
     * What is an array?
     *
     * Suppose we have three variables of type int with different identifiers for each variable .
     *
     * int number1;
     * int number2;
     * int number3;
     *
     * int number1 = 1;
     * int number2 = 2;
     * int number3 = 3;
     *
     * As you can see, it is a very tedious task in order to just initialize and use the variables especially if they are for the purpose.
     *
     * In java and other programming languages, there is one capability wherein we can use one variable to store a list of data and manipulate the more efficiently. This type of variable is called an array.
     *
     * An array stores multiple data item of the same data type, in a contiguous block of memory, divided into a number of slots.
     *
     * Declaration of an array
     *
     * Declaring Arrays
     *
     * To declare an array write the data type, followed by a set of square brackets [], foll wed by the identifier name.
     *
     * For example: int[] ages; or int ages[];
     *
     * Instantiation of an Array
     *
     * Array Instantiation
     * After declaring we must create an array and specify its length with a constructor
     * Definitions:
     * Instantiation->in Java, it implies creation
     * Constructor-> In order to instantiate an object, we need to use a constructor for this. A constructor is a method that is called to create a certain object.
     * we will cover more about instantiating objects and constructors
     *
     * To instantiate an array, write the 'new' keyword, foolwed by the square brackets containing the no. of items elements you want the array to have
     */

    public static void main(String[] args) {
        // for Example
        //Declaration
        int ages[];

        //instantiate object
        ages = new int[100];


        //or, ca also be written as
        //declare and instantiate object
        //int ages[] = new int[100];

        //you can also instantiate an array by directly initializing it with data
        //For Example:
        int[] arr = {1, 2, 3, 4, 5};

        //The statement above declares and instantiates an array of integers with five elements (initialized to the value 1 2 3 4 5

        //boolean array
        boolean[] results = {true, false, true, false };

        //double array
        double[] grades = {100, 90, 80, 75};

        //string array
        String[] days = {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat"};

        //Accessing an array element
        //to access amn array element or part of the array, you use a number called 'index' or a 'subscript'
        //index number or subscript ->is assigned to each number of program to access individual member of array
        //-> begins with zero and progress sequentially by whole numbers to the end of the array
        //NOTE: Elements inside your array are from 0 to(sizeOfArray - 1)

        //For example: given the array we declared a while ago, we have

        //assign 10 to the first element in the array
        ages[0] = 10;
        //prints the last element of an array
        System.out.println(99);

    }
}
