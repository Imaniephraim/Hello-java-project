public class oop {
    /** Creating your own classes
     *
     * At the end of this lecture you should be able to :
     *
     * -> Create your own classes
     * ->Declare properties (fields) and methods(actions) for your classes
     *->Use the 'this' keyword to access instance data
     * ->Create and call overloaded methods
     * ->Use access modifiers to control access to class members
     *
     * Defining Your Own Class
     * In java, a class is a blueprint or template for creating objects
     * It defines the structure  and behaviour of objects
     * They encapsulate data(attributes)and methods(functions) that operate on that data.
     * Encapsulation involves bundling the data(attributes0 amd methods(function) together within a class
     * Encapsulation helps in hiding the internal implementation details of a class and exposing only necessary functionalities through well-defined
     * It also ensures data integrity and improves code maintainability by restricting direct access to class members from outside the class
     * Methods(also called member functions) define the behaviour of an object.They perform operations on the objects data or provide functionality
     * both attributes and methods are declared within the class definition.
     *
     */

    //Things to take note for the syntax in this section
    // * ->means that there maybe 0 or more occurrences of the line where it was applied
    // <description> indicates that you have to substitute an actual value of this part instead of typing it as it is.
    //[] -> indicates that this part is optional.

    //To define a class,we write

    //<modifiers> class <name> {
    //<attributeDeclaration>*
    //<constructorDeclaration>
    //<methodDeclaration>
    //}

    //where :

    //-><modifiers> is an access modifier which maybe combined with other types of modifiers

    //EXAMPLE
    //public class StudentRecords{

    //}

    //Where
    //Public -> means the class is accessible to other classes outside the package
    //class -> keyword used to create a class in java
    //StudentRecords -> is a Unique identifier that describes our class


    //Coding guidelines

    //i. Think of an appropriate name for your class.Don't just call your class XYZ or ABC or any random names you think of.
    //ii. Class names start with a 'CAPITAL LETTER' -not a requirement,however.
    //iii. The filename of your class must have the same Name as your class name.


    //Instance variables versus Static Variables


    //Instance variable(Properties) vs Class (static) variables

    //Instance variables
    //Belong to an object instance
    //value of the variable of an object instance is different from the ones of other object instances


    //class Variables.
    //Variables that belong to the whole class
    //This means that they have the same value for all the object instances in the same class



    //Instance variables
    //Declaring(Properties) attributes
    //To declare a certain attribute for our class,we write;

    //<modifiers><type><name>[<default_value>];

    //Coding guidelines
    //i.Declare all instance variables right after "public" class
    //ii. Declare one variable for each line.
    //iii. Use an appropriate data type for each variable you declare
    //iv. Declare instance variables as private so that only class methods can access them directly(encapsulation)


    //Static variables(Class variables)
    //We use the keyword "static" to indicate that a variable is a static variable.

    //we'll add more code here
    //where:
    //Private here means that the variable are only accessible within the class.Other objects cannot access these variables directly.

    //Methods
    //To declare methods we write:

    //<modifier> <returnType> <name> (<parameter> *) {
    // <Statement>*
    //}

    //Where :
    //<modifier> can carry a number of different modifiers
    //<returnType> can be any data type (including void)
    //<name> can be any valid identifier
    //<parameter> - <parameter_Type><parameter_name>

    //Accessor (Getter) Methods
    //Used to read values from our class variables (instance/static)
    //usually written as
    //get<NameOfInstanceVariable>
    //it also returns a value


    //public String getName(){
    //return name;
    //}

    //where :
    //public - means that the method can be called from objects outside the class.
    //String - is the return type of the method.This means that the method should return a string type
    //getName - the Name of the method
    //() - this means that our method does not have any parameters

    //Mutators (Setters) Method
    //Used to write or change values of our class variables (instance/static)
    //usually written as:
    //set<NameOfInstanceVariable>

    // public void setName(String temp){
    //  name = temp;
    //}
    //


    //where :
    //public - means the method can be called from outside our class
    //void - means that the method does not return any value
    //setName - the Name of the method
    //(String temp) - parameter that will be used inside our method

    //multiple return statement
    //You can have multiple return statements for a method as long as they are on the same block
    //you can also use constants to return values instead of variables


    //EXAMPLE:
    public String getNumberInWord(int num){
        String defaultNum = "zero";
        if (num==1){
            return "One";//return a constant
        }else if (num ==2){
            return "Two";//return a constant
        }
        return defaultNum;
    }


    //public static int getStudentCount(){
    //    return studentCount
    //}

    //where:
    //Static - means that the class is static and should be called by typing,[ClassName.MethodName].For Example: in this case,we the method studentRecord.getStudentCount()
    //int - is the return type of the method.This method should return a type int.
    //getStudentCount - the name of the method
    //() - this means that our method does not have any parameters


    //Coding Guidelines
    //i.Method names should start with a small letter
    //ii. Method names should be verbs
    //iii. Always provide documentation before the declaration of the method. You can use javadocs style for this






}

