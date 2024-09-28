
package InputValidator;

public class Main {
    
    public static CustomValidator vld = new CustomValidator();
    
    public static void main (String [] Args){
        
        String welcome = "WELCOME to the Validation Tester Application!\n";
        System.out.println(welcome);
        
        System.out.println("Int Test");
        String prompt = "Enter an integer";
        int minInt = vld.getInt( prompt + ": ");
        prompt += " greater than " + minInt;
        int maxInt = vld.getInt( prompt + ": " , minInt );
        prompt += " and less than " + maxInt;
        vld.getInt( prompt + ": ", minInt, maxInt);
        
        System.out.println("Double Test");
        prompt = "Enter a double";
        double minDbl = vld.getDouble(prompt + ": ");
        prompt += " greater than " + minDbl;
        double maxDbl = vld.getDouble(prompt + ": ", minDbl);
        prompt += " and less than " + maxDbl;
        vld.getDouble(prompt + ": ", minDbl, maxDbl);
        
        System.out.println("Required String Test");
        vld.getStringWith("Enter your e-mail adress: ", "@");
        
        System.out.println("String Choice Test");
        vld.getStringChoice("Choose one (x/y)", "x", "y");
       
        System.out.println("Thank you for validating!");
    }
        
}
