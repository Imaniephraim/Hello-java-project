import javax.swing.*;
import java.awt.*;

public class GettingInputJOptionPane {
    public static void main(String[] args) {
//        // create a variable to store the username
//        String userName = "";
//
//        //ask the user for their name
//          userName = JOptionPane.showInputDialog("Please enter your name");
//
//          //create the output message
//        String msg = "Hello" +userName + "!";
//
//        //output the user data
//        JOptionPane.showMessageDialog(null, msg);
//
//
//        //write java program that gets the radius of as circle from the user and then outputs in a dialog box or a message box the perimeter and area of that circle
//
//        //convert string to a float ->Float.parseFloat(someValue)
//        //convert string to a Integer->Integer.parseInt(someValue)

        float PI = 3.13F;

        String radius = JOptionPane.showInputDialog("Enter radius");

        float floatRadius = Float.parseFloat(radius);

        //CALCULATE THE PERIMETER
        float perimeter = PI * (floatRadius + floatRadius);

        //Calculate the area
        float area = PI * (floatRadius * floatRadius);

        //create the output
        String output = "Perimeter: "+ perimeter + "\n" + "Area: "  +area;

        //output the area and the perimeter
        JOptionPane.showMessageDialog(null, output);







    }


}
