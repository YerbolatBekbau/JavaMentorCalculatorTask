import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RomanNumerals {

    public static int getResult (int result) throws IOException {

        Operations operations = new Operations();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Type an expression: ");
        String stringExpression = input.readLine();
        String[] numbers = stringExpression.split(" +");

        String fNum = numbers[0];
        String sNum = numbers[2];

        int firstNum = 0;
        int secondNum = 0;

        if (fNum.equals("I")) firstNum = 1;
        if (fNum.equals("II")) firstNum = 2;
        if (fNum.equals("III")) firstNum = 3;
        if (fNum.equals("IV")) firstNum = 4;
        if (fNum.equals("V")) firstNum = 5;
        if (fNum.equals("VI")) firstNum = 6;
        if (fNum.equals("VII")) firstNum = 7;
        if (fNum.equals("VIII")) firstNum = 8;
        if (fNum.equals("IX")) firstNum = 9;
        if (fNum.equals("X")) firstNum = 10;
        if (sNum.equals("I")) secondNum = 1;
        if (sNum.equals("II")) secondNum = 2;
        if (sNum.equals("III")) secondNum = 3;
        if (sNum.equals("IV")) secondNum = 4;
        if (sNum.equals("V")) secondNum = 5;
        if (sNum.equals("VI")) secondNum = 6;
        if (sNum.equals("VII")) secondNum = 7;
        if (sNum.equals("VIII")) secondNum = 8;
        if (sNum.equals("IX")) secondNum = 9;
        if (sNum.equals("X")) secondNum = 10;


        if ((firstNum <= 10 && firstNum >= 1) && (secondNum <= 10 && secondNum >= 1)) {

            if (numbers[1].equals("+")) {
                result = operations.addition(firstNum, secondNum);
            }
            if (numbers[1].equals("-")) {
                result = operations.subtraction(firstNum, secondNum);
            }
            if (numbers[1].equals("*")) {
                result = operations.multiplication(firstNum, secondNum);
            }
            if (numbers[1].equals("/")) {
                result = operations.dividing(firstNum, secondNum);

            }
        }
        else throw new IllegalArgumentException();
        return result;
    }

    private static String[] numerals = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX",
                                                     "V", "IV", "I"};
    private static int[] values = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};//внести сюда значение result

    public static String printRoman (int value) throws IOException {
        int result = 0;
        value = getResult(result);

        if (value > 3999 || value < 1) throw new IllegalArgumentException();

        StringBuilder numeral = new StringBuilder();
        int i = 0;
        while (value > 0) {
            if (value - values[i] >= 0) {
                numeral.append(numerals[i]);
                value -= values[i];
            } else {
                i++;
            }
        } return numeral.toString();
    }
}
