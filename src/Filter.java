import static java.lang.Integer.parseInt;

public class Filter {
    public static boolean hasBigNumber (String input) {
        String tempNumber = "0";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {       // If the character is number, add it to temp number variable
                tempNumber += input.charAt(i);
            } else if (Integer.parseInt(tempNumber) >= 10) {
                return true;                                // Once we have a number, check if it's 10 or higher
            } else {
                tempNumber = "0";
            }
        }
        if(Integer.parseInt(tempNumber) >= 10) {
            return true;                                    // Maybe the number was at the end?
        } else return false;                                // There are no other options
    }
}
