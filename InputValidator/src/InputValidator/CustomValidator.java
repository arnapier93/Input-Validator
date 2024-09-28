package InputValidator;

public class CustomValidator extends OOValidator{

    
  
    public String getStringWith ( String prompt, String included ) {
        String input = null;
        boolean valid = false;
        while (!valid){
            input = getString(prompt);
            if (input.contains(included)){
                valid = true;
            }
            else {
                System.out.println("Error! String must contain "
                                 + "\"" + included + "\" "
                                 + "Please try again.");
            }
        }
        return input;
    }
    
    public String getStringChoice ( String prompt, String choice_a, String choice_b ){
        String input = null;
        boolean valid = false;
        while (!valid){
            input = getString(prompt);
            if (input.equalsIgnoreCase(choice_a) || 
                    input.equalsIgnoreCase(choice_b) ){
                valid = true;
            }
            else {
                System.out.println( "Error! Must be " + 
                            choice_a + " or " + choice_b );
            }
        }
        return input;
    }
}