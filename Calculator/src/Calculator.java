import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    /*
    Made by Yerbolat Bekbau on 6th of November of 2019, 15:15, Prague for JavaMentor test exercise.

    1. "Operations" class makes an expression.
    2. "ArabicNumerals" class calculates input data with the arabic type of numerals.
    3. "RomanNumerals" class calculates input data with the roman type of numerals.
    4. They both are called in "Calculator" class according to User's choice.
    5. Thank you.

     */

    public static void main(String[] args) throws IOException {

        ArabicNumerals arabicNumerals = new ArabicNumerals();
        RomanNumerals romanNumerals = new RomanNumerals();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("To choose the numerals, type Arabic/Roman: ");
        String userChoice = input.readLine();
        int result = 0;

        if (userChoice.equals("Arabic")) {

            ArabicNumerals.printArabic(result);

        } else if (userChoice.equals("Roman")) {

            System.out.println(RomanNumerals.printRoman(result));

        }
    }
}