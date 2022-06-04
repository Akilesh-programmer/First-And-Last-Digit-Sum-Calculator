package com.akilesh;

public class SumFirstAndLastDigit {

    public static String sumFirstAndLastDigit(int number) {
        // Validating the parameter
        if (number < 0) {
            return "Enter a positive number.";
        } else if (number < 10){
            return "Enter a double digit number";
        }

        // Finding the last digit.
        int lastDigit = number % 10;

        // Declaring some variables which we need to find the first digit.
        int numberAfterDividingByTen = number;
        int firstDigit;

        // Finding the first digit.
        // The logic we are using is: Let's take  example of 121, if we divide it by 10, then it becomes 12.1, if we
        // store it in a variable which is int, then it gets sliced off and becomes 12. If we just do the same then we
        // will reach a stage where we have only one digit, then the loop will not continue, then we assign that digit
        // to the value of the firstDigit variable.
        // Here we int variables that we are using to slice off is numberAfterDividingByTen.
        while (!(numberAfterDividingByTen < 10)) {
            numberAfterDividingByTen = numberAfterDividingByTen / 10;
        }
        firstDigit = numberAfterDividingByTen;
        int sum = firstDigit + lastDigit;
        return "The sum of first and last digit of " + number + " is " + sum;
    }
}
