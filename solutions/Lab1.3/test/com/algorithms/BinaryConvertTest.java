package com.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryConvertTest {

    @Test
    public void convertFromBinary_valid() {
        String[] binaryStr = {"0", "1", "110", "1101", "100101"};
        int[] expected = {0, 1, 6, 13, 37};
        for (int num = 0; num < expected.length; num++) {
            int actual = BinaryConvert.convertFromBinary(binaryStr[num]);
            assertEquals(expected[num], actual);
        }
    }

    @Test
    public void convertFromOctal_valid() {
        String[] octalStr = {"0", "7", "10", "4321", "54321"};
        int[] expected = {0, 7, 8, 2257, 22737};
        for (int num = 0; num < expected.length; num++) {
            int actual = BinaryConvert.convertFromOctal(octalStr[num]);
            assertEquals(expected[num], actual);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertFromBinary_null() {
        BinaryConvert.convertFromBinary(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertFromOctal_null() {
        BinaryConvert.convertFromOctal(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertFromBinary_nonDigitCharacter() {
        BinaryConvert.convertFromBinary("11O1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertFromOctal_nonDigitCharacter() {
        BinaryConvert.convertFromOctal("7O5");
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertFromBinary_digitInvalidForRadix() {
        BinaryConvert.convertFromBinary("100102");
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertFromOctal_digitInvalidForRadix() {
        BinaryConvert.convertFromOctal("2087");
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertFromBinary_overflow() {
        BinaryConvert.convertFromBinary("10000000000000000000000000000000");
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertFromOctal_overflow() {
        BinaryConvert.convertFromOctal("20000000000");
    }

}