package com.algorithms;

public class BinaryConvert {

    public static void main(String[] args) {
        int value = convertFromBinary("100101");
        System.out.println("Decimal value of binary 100101 = " + value);
        value = convertFromOctal("17");
        System.out.println("Decimal value of octal 17 = " + value);
        value = convertFromHexadecimal("2A");
        System.out.println("Decimal value of hexadecimal 2A = " + value);
    }

    public static int convertFromBinary(String binary) {
        int result = 0;
        int positionValue = 1;
        char[] digits = binary.toCharArray();
        for (int i = digits.length - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                result += positionValue;
            }
            positionValue *= 2;
        }
        return result;
    }

    public static int convertFromOctal(String octal) {
        int result = 0;
        int positionValue = 1;
        char[] digits = octal.toCharArray();
        for (int i = digits.length - 1; i >= 0; i--) {
            int digitValue = Character.getNumericValue(digits[i]);
            if (digitValue >= 0 && digitValue < 8) {
                result += positionValue * digitValue;
            }
            positionValue *= 8;
        }
        return result;
    }

    public static int convertFromHexadecimal(String hexadecimal) {
        int result = 0;
        int positionValue = 1;
        char[] digits = hexadecimal.toCharArray();
        for (int i = digits.length - 1; i >= 0; i--) {
            int digitValue = Character.getNumericValue(digits[i]);
            if (digitValue >= 0 && digitValue < 16) {
                result += positionValue * digitValue;
            }
            positionValue *= 16;
        }
        return result;
    }

}
