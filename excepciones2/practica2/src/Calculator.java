public class Calculator {
    public static void main(String[] args) 
        throws IllegalArgumentException, NumberFormatException {

        try {
            checkArguments(args);
            isOperation((args[1]).charAt(0));
            isNumber(args[0], args[2]);
            int result = 0;
        
            switch (args[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(args[0])
                    + Integer.parseInt(args[2]);
                    break;
                
                case '-':
                    result = Integer.parseInt(args[0])
                    - Integer.parseInt(args[2]);
                    break;
                
                case 'x':
                    result = Integer.parseInt(args[0])
                    * Integer.parseInt(args[2]);
                    break;
                
                case '/':
                    result = Integer.parseInt(args[0])
                    / Integer.parseInt(args[2]);
                    break;
            }

            System.out.println(args[0] + ' ' + args[1]
            + ' ' + args[2] + " = " + result);

        } catch (NumberFormatException e){
            System.out.println(e);
        } 
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    public static void isOperation(char operation) throws IllegalArgumentException{
        boolean registred = false;
        char[] operations = {'+', '-', 'x', '/'};
        for (char i : operations) {
            if (operation == i){
                break;
            }
        }
        IllegalArgumentException SymbolError;
        SymbolError = new IllegalArgumentException("Unrecognized operation symbol");   
    }

    public static void isNumber(String num1, String num2) throws NumberFormatException {
        try {
            Integer.parseInt(num2);
            Integer.parseInt(num1);
        } catch (Exception e) {
            NumberFormatException exception;
            throw exception = new NumberFormatException("Whole numbers must be entered");
        }
    }

    public static void checkArguments(String[] args) throws IllegalArgumentException {
        if (args.length != 3){
            IllegalArgumentException argumentException;
            throw argumentException = new IllegalArgumentException(
                "Usage: Java Calculator operand1 operator operand2");
        } else {
            return;
        }
    }
}
