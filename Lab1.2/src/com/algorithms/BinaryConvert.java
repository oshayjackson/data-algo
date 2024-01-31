package com.algorithms;

public class BinaryConvert {

    public static void main(String[] args) {
        int value = convertFromBinary("100101");
        System.out.println("Decimal value of binary 100101 = " + value);
        // TODO-Lab1.2: Uncomment first 2 and/or last 2 lines of
        //  the following, for a simple check of octal or
        //  hexadecimal conversion.
//        value = convertFromOctal("17");
//        System.out.println("Decimal value of octal 17 = " + value);
//        value = convertFromHexadecimal("2A");
//        System.out.println("Decimal value of hexadecimal 2A = " + value);
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
        // TODO-Lab1.2: Complete this method, to return calculated
        //  decimal value converted from octal String, or the following.
        return 0;
    }

    public static int convertFromHexadecimal(String hexadecimal) {
        // TODO-Lab1.2: Complete this method, to return calculated
        //   decimal value converted from hexadecimal String, or
        //   the preceding method.
        return 0;
    }

}
