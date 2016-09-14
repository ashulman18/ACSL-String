# ACSL-String

For this program you will be asked to code algorithms that replicates the ACSL string function STR defined below:

STR (float_expression, length, decimal) – Converts a given floating point number to a formatted string value.

Length - The desired total length of the resulting string which includes all digits, decimals and signs.

Decimal - The number of decimal places to display in the resulting string. The result will be rounded to the given number of decimal places if necessary.

A length value that does not allow a value to be printed in the given format would cause an error. The # symbol will be printed to show the desired format. Example: STR (523.125, 5, 2) would produce ##.##

A length value greater than the length of the float expression causes the correct result to be right justified with the # symbol printed to the left to fill the desired length. Example: STR(523.125, 9, 2) would produce ###523.13 .

For non-negative numbers, rounding up occurs when the digit to the right is 5 or more.
Rounding down occurs when the digit to the right is less than point 5. If the value is negative the rule that applies is -0.75 rounds down to -0.8 and -0.74 rounds up to -0.7.

For Contest 2 in ACSL's Senior Division in 2015-2016

To run this code use `javac StringFunc.java` then `java StringFunc`
