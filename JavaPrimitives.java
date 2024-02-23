  public class JavaPrimitives {
      /**
       *
       *
       *
       *
       *
       *
       *
       *
       *
       *
       *
       *
        */
      public static void main(String[] args){
          //1. Boolean (logical) data type
          // example boolean isRaining true;
          // example boolean isRunning false;
          System.out.println(isRaining);
          System.out.println(isRunning);

          //2. char (Textual) data type
          //represents a single unicode character
          //to create a character data type, we use the char keyword
          char d = 'd' ;
          char D = 'D' ;

          //insert a tab
          // System.out.println("\t\t\t\t\t\t\t\tSoftware Development")

          //insert a line break-> \n
          System.out.println("This is a very very veeeery long sentence, \nwe have inserted a line break here...);"
                  // insert a single quote
                  char singleQuote = '\'' ;
                  System.out.println("singleQuote");

           //insert a doubleQuote
          char doubleQuote = '"';
          System.out.println(doubleQuote);

          // create euro pound
          char euroPound '\u00A3';
          System.out.println(euroPoUnd);

            char thaiBhat = '\u00A3';
          System.out.println(thaiBhat);

           char infinity = '\u0e3f';
          System.out.println(infinity);

          // strings -> represents a data type that represents multiple characters.
          // it is not a primitive data type
          //it has literals enclosed in double quotes
          //created using String keyword
          String greetingsMessage = "Hello Everyone!";
          System.out.println(greetingsMessage);


           //3. Intergral data types (byte, short, int and long)
          // intergral data types uses three forms -> decimal, octal and hexadecimal.
          //example:
          //2 (hexadecimal), 077 (octal) and 0x12 (int)
          //the default type of intergral data types id int
          // //For instance, you define a long value of the interger by using capital letter L or l
          //e.g 10L
          // Byte ->range -128 to 127 length 1byte
          //to create a byte  we use a byte key word
          byte myByte;
          myByte = 127;

          //short-> range-32,768 to 32,767
          // to create a short data type, we use a short key word
          short myShort;
          myShort =32767;

          // int-> range -2,147,483,648 to 2,147,483,647-> size four bytes
          //to create an int data type, ude int key word
          int myInt;
          myInt = 2147483647;
          System.out.println(myInt);

          //lomg -> range -92233372036854776 to -9223372036854775 -> size 8 bytes
          //to create a long data type, use a long key word
          long myLong;
          myLong = 9_223_332_036_854_775L;
          System.out.println(myLong);

          //7. Floating-Point primitive data types (float and double)
          // Floating point type has double as default data type.
          // Floating-point literal includes either a decimal point or one of the following
          // E or e(exponential values)
          // F or f (float)
          // D or d(double)
          //Example:
          // 3.14 - simple floating-point value
          //6.02E23 -large  floating-point value
          //
          //

          //float ->  -2,147,483,648 to 2,147,483,647 -> size 4 bytes
          //to create a float type, use float key word
          float myFloat;
          myFloat = 1234567;
          System.out.println(myFloat);

          //8 double -> range -92233372036854776 to -9223372036854775 size ->8bytes
          //to create a double data type,use double key word
          double myDouble;
          myDouble = 6653677548878D;
          System.out.println(myDouble);












      }
}