import java.util.Objects;

public class Operation {
    public static int operation(String str, int number1, int number2, boolean roman) {
        int result = 0;


        switch (str) {
            case "+":
                result = number1 + number2;
                return result;
            case "-":
                if (roman & number2 >= number1)
                    throw new ArithmeticException("в римском исчислении нет отрицательных чисел и ноля");
                result = number1 - number2;
                return result;
            case "*":
                result = number1 * number2;
                return result;
            case "/":
                if (number2 == 0) throw new ArithmeticException("на ноль делить нельзя");
                result = number1 / number2;
                return result;
        }


        return result;
    }

}
