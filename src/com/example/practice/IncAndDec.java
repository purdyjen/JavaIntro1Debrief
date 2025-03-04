package com.example.practice;

public class IncAndDec {
    public static void main(String[] args) {
        /*
            INCREMENTING AND DECREMENTING
            in this section, we will apply the increment and decrement operators

            1. Create an integer variable that stores the value 10

            2. using System.out.println(), output "Initial value: " followed by the value of this variable

            3. then use the increment operator on this variable
            followed by another System.out.println() call with the output "Value after incrementation: "
            followed by the value of the variable

            4. Then repeat step 3 with the decrement operator
            (make sure to adjust the string output appropriately)
         */
        int num = 10;
        System.out.println("Initial value: " + num); // 10
        num++;
        System.out.println("Value after increment: " + num); // 11
        num--;
        System.out.println("Value after decrement: " + num); // 10

        /*
            Now, using System.out.println(), print the value of your variable as you increment it
            note whether the value of the variable that is returned is already incremented,
            or if the returned value is not yet incremented
         */

        System.out.println(num++); // Not yet incremented


    }
}
