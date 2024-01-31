### Binary Convert Test Plan

**Important**: Conversions don't yet handle negative values; these are not included in test plan.

* Constructors: none
* Getters/setters: none
* Other non-`private` methods (behaviors):

    ```java
    public static int convertFromBinary(String binary)
    public static int convertFromOctal(String octal)
    ```

* Success paths: Test with valid inputs and known outputs.
    * Binary
        * Binary `"0"` = Decimal `0`
        * Binary `"1"` = Decimal `1`
        * Binary `"110"` = Decimal `6`
        * Binary `"1101"` = Decimal `13`
        * Binary `"100101"` = Decimal `37`
    * Octal
        * Octal `"0"` = Decimal `0`
        * Octal `"7"` = Decimal `7`
        * Octal `"10"` = Decimal `8`
        * Octal `"4321"` = Decimal `2257`
        * Octal `"54321"` = Decimal `22737`

* Failure paths: Test with invalid inputs and expected exceptions.
    * `null` string reference
    * Non-digit character:
        * Binary `"11O1"` (uppercase `"o"`, instead of `"0"` digit)
        * Octal `"7O5"` (uppercase `"o"`, instead of `"0"` digit)
    * Digit out of range for base:
        * Binary `"100102"` (`2` not valid in base 2.)
        * Octal `"2087"` (`8` not valid in base 8.)
    * Converted value out of range for `int` type:
        * Binary `"10000000000000000000000000000000"`
        * Octal `"20000000000"`

        (As unsigned representations, both parse to a value of `Integer.MAX_VALUE + 1`.)
    
    All should fail with `IllegalArgumentException` or a subclass of that (e.g. `NumberFormatException`). 