package itvtest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRomanNumber {

    @Test
    public void testSingleDigits(){
        assertEquals("", RomanNumber.convertToRomanNumber(0));
        assertEquals("I", RomanNumber.convertToRomanNumber(1));
        assertEquals("II", RomanNumber.convertToRomanNumber(2));
        assertEquals("III", RomanNumber.convertToRomanNumber(3));
        assertEquals("IV", RomanNumber.convertToRomanNumber(4));
        assertEquals("V", RomanNumber.convertToRomanNumber(5));
        assertEquals("VI", RomanNumber.convertToRomanNumber(6));
        assertEquals("VII", RomanNumber.convertToRomanNumber(7));
        assertEquals("VIII", RomanNumber.convertToRomanNumber(8));
        assertEquals("IX", RomanNumber.convertToRomanNumber(9));
    }

    @Test
    public void testMultiDigits(){
        // test Unit 'L' in "reverse" order
        assertEquals("XLVII", RomanNumber.convertToRomanNumber(47));
        // test Unit 'L' in 50s
        assertEquals("L", RomanNumber.convertToRomanNumber(50));
        assertEquals("LVII", RomanNumber.convertToRomanNumber(57));
        // test Unit 'L' in "regular" order
        assertEquals("LXXVII", RomanNumber.convertToRomanNumber(77));
        // test Unit 'C' in "reverse" order
        assertEquals("XCIX", RomanNumber.convertToRomanNumber(99));
        // test Unit 'C' in a 10X number
        assertEquals("CIX", RomanNumber.convertToRomanNumber(109));
        // test unit 'C' in a 19X number, number with "reverse" C
        assertEquals("CXCIX", RomanNumber.convertToRomanNumber(199));
        // test unit 'L' in 100s numbers
        assertEquals("CL", RomanNumber.convertToRomanNumber(150));
        assertEquals("CXL", RomanNumber.convertToRomanNumber(140));
        assertEquals("CXXX", RomanNumber.convertToRomanNumber(130));
        assertEquals("CLX", RomanNumber.convertToRomanNumber(160));
        assertEquals("CLXIII", RomanNumber.convertToRomanNumber(163));

        // test unit 'C' in multiple 'C' context
        assertEquals("CC", RomanNumber.convertToRomanNumber(200));
        assertEquals("CCCL", RomanNumber.convertToRomanNumber(350));

        //test unit 'D' in XXX number
        assertEquals("CD", RomanNumber.convertToRomanNumber(400));
        assertEquals("D", RomanNumber.convertToRomanNumber(500));
        assertEquals("DC", RomanNumber.convertToRomanNumber(600));
        assertEquals("DCCC", RomanNumber.convertToRomanNumber(800));

        // test unit 'M' in "reverse" order
        assertEquals("CM", RomanNumber.convertToRomanNumber(900));
        //test unit 'M' in X000s
        assertEquals("M", RomanNumber.convertToRomanNumber(1000));
        assertEquals("MM", RomanNumber.convertToRomanNumber(2000));
        assertEquals("MMM", RomanNumber.convertToRomanNumber(3000));
        assertEquals("MMMM", RomanNumber.convertToRomanNumber(4000));
    }
}
