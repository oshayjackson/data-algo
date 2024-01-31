package com.algorithms;

public class BinaryConvert {

    private static final String NULL_STRING_MESSAGE = "Cannot parse null string.";
    private static final String CHARACTER_NOT_DIGIT_FORMAT =
            "Cannot parse \"%1$s\"; \"%2$s\" is not a digit character.";
    private static final String DIGIT_TOO_LARGE_FORMAT =
            "Cannot parse \"%1$s\"; digit value \"%2$d\" is too large for radix %3$d.";
    private static final String INT_OVERFLOW_FORMAT =
            "Parsed value of \"%1$s\" exceeds Integer.MAX_VALUE.";

    public static int convertFromBinary(String binary) {
        if (binary == null) {
            throw new NumberFormatException(NULL_STRING_MESSAGE);
        }
        long result = 0;
        long positionValue = 1;
        char[] digits = binary.toCharArray();
        for (int i = digits.length - 1; i >= 0; i--) {
            char digit = digits[i];
            int digitValue = Character.getNumericValue(digit);
            if (digitValue < 0) {
                throw new NumberFormatException(
                        String.format(CHARACTER_NOT_DIGIT_FORMAT, binary, digit));
            } else if (digitValue >= 2) {
                throw new NumberFormatException(
                        String.format(DIGIT_TOO_LARGE_FORMAT, binary, digitValue, 2));
            } else {
                result += positionValue * digitValue;
                if (result > Integer.MAX_VALUE) {
                    throw new NumberFormatException(String.format(INT_OVERFLOW_FORMAT, binary));
                }
            }
            positionValue *= 2;
        }
        return (int) result;
    }

    public static int convertFromOctal(String octal) {
        if (octal == null) {
            throw new NumberFormatException(NULL_STRING_MESSAGE);
        }
        long result = 0;
        long positionValue = 1;
        char[] digits = octal.toCharArray();
        for (int i = digits.length - 1; i >= 0; i--) {
            char digit = digits[i];
            int digitValue = Character.getNumericValue(digit);
            if (digitValue < 0) {
                throw new NumberFormatException(
                        String.format(CHARACTER_NOT_DIGIT_FORMAT, octal, digit));
            } else if (digitValue >= 8) {
                throw new NumberFormatException(
                        String.format(DIGIT_TOO_LARGE_FORMAT, octal, digitValue, 8));
            } else {
                result += positionValue * digitValue;
                if (result > Integer.MAX_VALUE) {
                    throw new NumberFormatException(String.format(
                            INT_OVERFLOW_FORMAT, octal));
                }
            }
            positionValue *= 8;
        }
        return (int) result;
    }

}
