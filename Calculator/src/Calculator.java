import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*   Made by Yerbolat Bekbau on 6th of November of 2019, 15:15, Prague for JavaMentor test exercise.
    1. "Operations" class takes input data and makes an operation with numbers given.
    2. "ArabicNumerals" class calculates input data with the arabic type of numerals.
    3. "RomanNumerals" class calculates input data with the roman type of numerals.
    4. They both are called in "Calculator" class one by one.
    5. Thank you.
     */

public class Calculator {

    public static void main(String[] args) throws IOException {
        int result = 0;

        System.out.println("Type Arabic numerals expression: ");
        ArabicNumerals.printArabic(result);
        System.out.println("Type Roman numerals expression: ");
        System.out.println("Answer: " + RomanNumerals.printRoman(result));

        }
    }
