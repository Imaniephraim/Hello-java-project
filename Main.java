import java.awt.*;

public class Main {
    //use class to run StudentRecord class

    public static void main (String [] args){

        //Create three objects for student record class

        StudentRecord frankRecord = new StudentRecord();
        StudentRecord muznaRecord = new StudentRecord();
        StudentRecord ianRecord = new StudentRecord();


        //set the names of the students
        frankRecord.setName("Frank");
        muznaRecord.setName("Muzna");
        ianRecord.setName("Ian");

        //print the names of the students
        System.out.println(frankRecord.getName());
        System.out.println(muznaRecord.getName());
        System.out.println(ianRecord.getName());

        //print number of students
        System.out.println("count = " +StudentRecord.getStudentCount());

        //set info for students
        frankRecord.setAddress("Nairobi");
        frankRecord.setAge(19);
        frankRecord.setMathsGrade(90);
        frankRecord.setEnglishGrade(90);
        frankRecord.setScienceGrade(96);

        //Overloaded methods
        frankRecord.print(frankRecord.getName());
        frankRecord.print(frankRecord.getMathGrade(), frankRecord.getEnglishGrade(), frankRecord.getScienceGrade());

    }
}
