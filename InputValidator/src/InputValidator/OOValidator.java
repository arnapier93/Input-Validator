package InputValidator;

import java.util.Scanner;

public class OOValidator {

    private final Scanner sc;
    
    public OOValidator () {
        sc = new Scanner (System.in);
    }
    
    public int getInt  ( String prompt){                                        //public mehtod getInt returns an int and takes a String prompt as a parameter
        int input = 0;                                                          //creates and initializes an int as 0
        boolean isValid = false;                                                //creates a bool and initializes as false
        while (isValid == false){                                               //while loop exits when bool is set to true 
                System.out.print(prompt);                                     //print the given prompt
                if (sc.hasNextInt()){                                           //if the input is an integer value
                    input = sc.nextInt();                                       //sets it equal to the integer variable
                    isValid = true;                                             //sets bool to true and exits loop
                }
                else{                                                           //if a non-integer is entered
                    System.out.println("Error! Invalid integer value."          //prints error message
                                             + "Try again.");
                }
            sc.nextLine();                                                      // discard any data entered on the line
        }
        return input;                                                           //returns only valid integer inputs from user
    }  
    
    public int getInt ( String prompt, int min){                                //getInt method can also take an int as a min point
        int input = 0;                                                          //it will create an int and initialize it as 0
        boolean isValid = false;                                                //and create a bool and initialize it as false
        while ( isValid == false ){                                             //while loop exits when bool is set to True
        input = getInt(prompt);                                                 //takes advantage of existing getInt to provide a valid integer
            if ( input > min ){                                                 //checks that the int is greater then the min value
                isValid = true;                                                 //if yes sets bool to true and exits loop
            }
            else{
                System.out.println("Error! Integer must be greater than "       //if not prints error messgae loops until true
                                    + min + "Try again." );
            }
        }                                                                       
        return input;                                                           //returns the int
    }
    
    public int getInt ( String prompt, int min, int max){                       //getInt method can also take two ints as min and max point
        int input = 0;                                                              
        boolean isValid = false;
        while ( isValid == false ){
        input = getInt(prompt);                                                 //uses getInt to get a valid input type    
            if ( input > min && input < max){                                   //if it's within the range 
                isValid = true;                                                 //sets bool to true and exits loop
            }
            else if (input < min){
                System.out.println("Error! Integer must be greater than "       //otherwise it prints out specific error
                                    + min + "Try again.");                      //messages for less than min or greater than max
            }                                                                   
            else{
                System.out.println("Error! Integer must be less than " + max);
            }
        }                                                                       //and keeps looping until a proper input is given
        return input;                                                           //returns the input
    } 
   
    public double getDouble  ( String prompt ){                                        //public mehtod getInt returns an int and takes a String prompt as a parameter
        double input = 0.0;                                                          //creates and initializes an int as 0
        boolean isValid = false;                                                //creates a bool and initializes as false
        while (isValid == false){                                               //while loop exits when bool is set to true 
                System.out.print(prompt);                                       //print the given prompt
                if (sc.hasNextDouble()){                                           //if the input is an integer value
                    input = sc.nextDouble();                                       //sets it equal to the integer variable
                    isValid = true;                                             //sets bool to true and exits loop
                }
                else{                                                           //if a non-integer is entered
                    System.out.println("Error! Invalid double value."          //prints error message
                                             + "Try again.");
                }
            sc.nextLine();                                                      // discard any data entered on the line
        }
        return input;   
    }
    
    public double getDouble ( String prompt, double min){                                //getInt method can also take an int as a min point
        double input = 0.0;                                                              //it will create an int and initialize it as 0
        boolean valid = false;                                                //and create a bool and initialize it as false
        while ( !valid ){                                             //while loop exits when bool is set to True
        input = getDouble(prompt);                                                     //takes advantage of existing getInt to provide a valid integer
            if ( input > min ){                                                     //checks that the int is greater then the min value
                valid = true;                                                 //if yes sets bool to true and exits loop
            }
            else{
                System.out.println("Error! Integer must be greater than "       //if not prints error messgae loops until true
                                    + min + "Try again." );
            }
        }                                                                       
        return input;                                                               //returns the int
    } 
   
    public double getDouble ( String prompt, double min, double max){                       //getInt method can also take two ints as min and max point
        double input = 0.0;                                                              
        boolean valid = false;
        while ( !valid ){
        input = getDouble(prompt);                                                 //uses getInt to get a valid input type    
            if ( input > min && input < max){                                   //if it's within the range 
                valid = true;                                                 //sets bool to true and exits loop
            }
            else if (input < min){
                System.out.println("Error! Integer must be greater than "       //otherwise it prints out specific error
                                    + min + "Try again.");                      //messages for less than min or greater than max
            }                                                                   
            else{
                System.out.println("Error! Integer must be less than " + max);
            }
        }                                                                       //and keeps looping until a proper input is given
        return input;                                                           //returns the input
    } 

    public String getString ( String prompt ){
        String input = null;
        do{
            System.out.print( prompt );
            input = sc.nextLine( );
            if (input.equals("")){
                System.out.println("Error! String cannot be left blank!");
            }
        } while ( input.equals(""));
        return input;
    }
}