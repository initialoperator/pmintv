package itvtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

public class RomanNumber {

    public static void main(String[] args){
        String output = convertToRomanNumber(407);
        System.out.println(output);
    }

    public static String convertToRomanNumber(int n){
        char[] romanUnits = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        //convert to digits
        List<Integer> reverseDigits = new ArrayList<Integer>();
        while(n > 0){
            int remainder = n % 10;
            reverseDigits.add(remainder);
            n = n / 10;
        }
        Stack<String> romanDigits = new Stack<>();
        IntStream.range(0, reverseDigits.size()).forEach(i -> {
            int digit = reverseDigits.get(i);
            String romanDigit = convertSingleDigit(digit, i, romanUnits);
            romanDigits.push(romanDigit);
        });
        StringBuilder sb = new StringBuilder();
        while (!romanDigits.empty()){
            sb.append(romanDigits.pop());
        }
        return sb.toString();
    }

    private static String convertSingleDigit(int digit, int pos, char[] units){
        if(digit == 0)
            return "";
        if(digit == 4){
            char secondaryUnit = units[2 * pos];
            char primaryUnit = units[2 * pos+1];
            return ""+secondaryUnit+primaryUnit;
        }
        if(digit == 9){
            char secondaryUnit = units[2 * pos];
            char primaryUnit = units[2 * pos+2];
            return ""+secondaryUnit+primaryUnit;
        }
        StringBuilder sb = new StringBuilder("");
        int primaryMultiply = digit /5 ;
        int secondaryMultiply = digit % 5;
        char secondaryUnit = units[2 * pos];
        char primaryUnit = units[2 * pos+1];
        while(primaryMultiply > 0){
            sb.append(primaryUnit);
            primaryMultiply--;
        }
        while(secondaryMultiply > 0){
            sb.append(secondaryUnit);
            secondaryMultiply--;
        }
        return sb.toString();
    }
}
