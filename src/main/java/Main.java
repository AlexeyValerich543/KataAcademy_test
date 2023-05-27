import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        System.out.println(calc(input));
    }


    static String[] parsing(String str) {
        String[] arr = str.split(" ");
        return arr;
    }
    public static String calc(String input) throws IOException {
        String[] arrayString = parsing(input);
        int result;
        int number1, number2;
        boolean rome;
        String answer;

        VerificationNumber.verificationLength(arrayString);
        rome = VerificationNumber.verificationSymbols(arrayString[0], arrayString[2]);


        if (rome) {
            number1 = (int) VerificationNumber.digitMap.get(arrayString[0]);
            number2 = (int) VerificationNumber.digitMap.get(arrayString[2]);
        } else {
            number1 = Integer.parseInt(arrayString[0]);
            number2 = Integer.parseInt(arrayString[2]);
        }


        result = Operation.operation(arrayString[1], number1, number2, rome);

        if (rome) {
            return IntegerConverter.intToRoman(result);
        } else answer = String.valueOf(result);
        return answer;
    }
}
