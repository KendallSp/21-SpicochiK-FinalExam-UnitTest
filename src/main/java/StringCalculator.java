public class StringCalculator {
    public static int add(final String numbers) throws IllegalArgumentException{
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                //checks if number is less than 1000, else ignore
                if(Integer.parseInt(number.trim())<0){
                    throw new IllegalArgumentException("negatives not allowed");
                }
                if(Integer.parseInt(number.trim())<1000) {
                    returnValue += Integer.parseInt(number.trim());
                }
            }
        }
        return returnValue;
    }
}