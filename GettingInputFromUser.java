import java.io.*;
public class GettingInputFromUser {
    /**
     * Getting user inputs
     *
     * we have two ways
     *
     * 1. BufferedReader class-> console line way
     * 2. JOptionPane -> GUI(Graphical user interface)
     *
     */

    public static void main(String[] args) {
        //Lets get user input using BufferedReader class

        //Create an instance of BufferedReader class
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        //create a variable for holding the user input
        String userName = null;

        //use a try... catch block to execute the code
        try {
            //ask the user for their name
            System.out.println("Please enter your name: ");
            userName = dataIn.readLine();
        } catch (IOException ex) {
            System.out.println("There was an Error reading the user Input...");
        }

        //output the user input
        System.out.println("Greetings" + userName);

        // write a java program that asks user for their name and age, then converts that age into minutes the user has lived.
        String name = "";
        int age = 0;

        try {
            System.out.println("Enter your name: ");
            name = dataIn.readLine();
            System.out.println("Enter your age: " );
            age = dataIn.read();
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        //convert the user age into minutes
        int ageInMinutes = age * 365 * 24 * 60;

        //out the user info
        System.out.println("Hello " + name + ", you have lived for " +ageInMinutes + " minutes.");




    }
    }
