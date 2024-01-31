### Intersection Test Plan

* Constructors: none
* Getters/setters: none
* Other non-`private` methods (behaviors):

    ```java
    public Set<Integer> intersection(int[] a, int[] b)
    public Set<Integer> intersectionFast(int[]a, int[]b)
    ```

    **Important**: Expected return value is same for both methods, and for invocation with arguments reversed. That is, `intersection(a, b)`, `intersection(b, a)`, `intersectionFast(a, b)`, and `intersectionFast(b, a)` must all return equal sets for any given (and non-`null`) `a` and `b`. (A helper method can be used to reduce boilerplate.)

* Success paths:
    * Non-empty intersection: 
        * `a = {66, 24, 75, 22, 12, 87}`
        * `b = {32, 41, 98, 66, 39, 24}`
        * Expected intersection = `[24, 66]` (order not significant)
    * One array contains subset of values of other array:
        * `a = {66, 24, 75, 22, 12, 87}`
        * `b = {24, 87, 66}`
        * Expected intersection = `[24, 66, 87]` (order not significant)
    * Arrays contain identical contents (not necessarily in same order):
        * `a = {0, 9, 7, 8, 6}`
        * `b = {7, 6, 9, 0, 8}`
        * Expected intersection = `[0, 6, 7, 8, 9]` (order not significant)
    * Arrays don't contain any values in common:
        * `a = {2, 4, 1, 3, 5}`
        * `b = {7, 6, 9, 0, 8}`
        * Expected intersection = `[]` (empty set)
  
* Failure paths:
    * One or the other (or both) of the array references is `null`; should throw `NullPointerException`.
