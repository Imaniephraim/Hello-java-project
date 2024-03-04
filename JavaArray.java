import java.util.Scanner;
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
        System.out.println(ages[0]);

        //NOTE once an array is declared  and constructed, the store value of each member of the array will be initialized to zero for data type
        //For reference data type like strings, they are Not initialized to blanks or empty string "". Therefore, you must populate the String array explicitly.

        //Example
        //The following is a sample code on how to print all the elements in the array . It uses a for loop -> Print all the elements of ages[] array

//        for (int w = 0; w<ages.length; w++) {
//            System.out.println(w);
//        }

        //write a java program that will ask the user to enter five student names and store them in an array. Then output all the names using a for loop

       // Solution

        //create an array to store the 5 names
//        String[] names = new String[5];

      //create new scanner object
//        Scanner sc =new Scanner(System.in);
//
//        for (int idx = 0; idx < names.length; idx++) {
//            System.out.println("Enter the names of student " + (idx + 1 ) + ":");
//            names[idx] = sc.next();
//        }
//        for (int l=0 ;l < names.length; l++) {
//            System.out.println(names[l]);
//        }

        //Array length
        //In order to get the number of elements in an array, ypu can use the length field of an array
        //The length filed returns the size of an array
        //It can be used in writing the following
        //arrayName.length
        //Example:
//        System.out.println(names.length);

        //Create a program that asks the user for 5 integers then prints out their sum and averages

        Scanner nc = new Scanner(System.in);
//        double[] numbers = new double[5];
//
//        for (int num = 0; num < numbers.length; num++) {
//            System.out.println("Enter the 5 integers");
//            numbers[num] = nc.nextInt();
//        }
//
//        double sum = 0;
//        double average = 0;
//
//        // use a for loop to calculate the sum and average
//        for (int n = 0; n< numbers.length; n++) {
//            sum = sum + numbers[n];
//        }
//        //compute the average
//        average = sum / numbers.length;
//
//        //output the sum and average
//        System.out.println("The sum of the 5 integers is: " + sum);
//        System.out.println("The average of the 5 integers is: " + average);
//
//        System.out.println("================================");

        //Multi Dimensional array
        //Are implemented as arrays of arrays
        //Are declared by appending the appropriate number of bracket pairs after the array name
        //syntax: (2-D Array)
        //type[][] arrayName = new type[row][column];

        //Example:
        // an 2-D integer Array
//        int[][] twoD = new int[512][128];
//
//        //3-D Array
//        char[][][] threeD = new char[8][16][24];
//
//        // a 2D String array 4rows by 2columns
//        String[][] dogNames = {
//                {"terry", "brown"},
//                {"kristin","white" },
//                {"toby", "grey"},
//                {"fido", "black"},
//        };

        //accessing elements of multidimensional array
        //To access an element in a multidimensional array is just the same as accessing the elements in a one dimensional array
        //For example
        //To access the first element in the first row of the array dogNames, we write the following:

//        System.out.println(dogNames[0][0]);

        //This will print the string "terry" on the string

        //Challenge
        //Create a java program to track the grades of students across multiple subjects using 2D array
        //Implement the following functionalities to:
        // 1. input grades for each student in each subject
        //2. calculating and displaying the average grade for each student
        //3. calculating and displaying the average grade for each subject


        //STEPS
        //create variables to store the number of students and number of subjects
        //Prompt the use for the numbers and store them in their appropriate arrays
        //create an array to store the grades
        //input grades (using nested for loops)
        //calculate the average grade for each student and output it
        //calculate the average grade for each subject and output it

        Scanner sc = new Scanner(System.in);
        //create variables to store the numbers of students and number of subjects
        int studentNumber =0;

        int subjects = 0;


        System.out.println("Enter studentNumber; " + studentNumber );
        studentNumber = sc.nextInt();

        System.out.println("Enter number of subjects " + subjects );
        subjects = sc.nextInt();

        int[][] studentGrades = new int [studentNumber][subjects];

        for (int i =0; i< studentNumber; i++){
            System.out.println("Enter Grade for Student " + (i + 1) + ":");
            for (int j = 0; j< subjects; j++){
                System.out.println("Enter Grade for Subject " + (j + i) + ":");
                studentGrades[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i< studentNumber; i++) {
            int total = 0;
            for (int j = 0; j<subjects; j++) {
                total= total + studentGrades[i][j];
            }
            double averageGrade= (double) total /subjects;
            System.out.println("Average Grade for Student: " + (i + 1) + ":" + averageGrade );
        }

        //calculate the average grade for subject and output it
        for (int j= 0; j< subjects; j++) {
            int total = 0;
            for(int i = 0; i < studentNumber; i++) {
                total += studentGrades[i][j];
            }
            double averageSubject = (double) total / studentNumber;
            System.out.println("Average Grade for All Subjects: " + (j + 1) + ":" + averageSubject);
        }
























    }
}













