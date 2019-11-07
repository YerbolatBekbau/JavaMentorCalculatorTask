import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Operations {

    static String expressionToClasses(String a) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        return s;
    }

    int addition(int fNum, int sNum) {
        return fNum + sNum;
    }
    int subtraction(int fNum, int sNum) {
        return fNum - sNum;
    }
    int multiplication(int fNum, int sNum) {
        return fNum * sNum;
    }
    int dividing(int fNum, int sNum) {
        return fNum / sNum;
    }
}
