import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

class ArabicNumerals {

static int printArabic(int result) throws IOException {

    Operations operations = new Operations();
    String input = "";

    String[] numbers = Operations.expressionToClasses(input).split(" +");

    int firstNum = Integer.parseInt(numbers[0]);
    int secondNum = Integer.parseInt(numbers[2]);

    result = 0;

    if ((firstNum <= 10 && firstNum >= 1) && (secondNum <= 10 && secondNum >= 1)) {

        if (numbers[1].equals("+"))
            System.out.println(operations.addition(firstNum, secondNum));

        if (numbers[1].equals("-"))
            System.out.println(operations.subtraction(firstNum, secondNum));

        if (numbers[1].equals("*"))
            System.out.println(operations.multiplication(firstNum, secondNum));

        if (numbers[1].equals("/"))
            System.out.println(operations.dividing(firstNum, secondNum));

        } else throw new IllegalArgumentException();
        return result;
    }
}
