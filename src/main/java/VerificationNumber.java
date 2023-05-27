import java.io.IOException;
import java.util.HashMap;

public class VerificationNumber {
    static HashMap digitMap = new DigitMap().myDigit();

    public static void verificationLength(String[] strings) throws IOException {
        if (strings.length != 3) {
            throw new IOException("Неправильный ввод");
        }

    }

    public static boolean verificationSymbols(String str1, String str2) throws NumberFormatException {
        if ((digitMap.containsKey(str1)) & (digitMap.containsKey(str2)))
        {

            return true;
        }else{

            if ((isDigit(str1)) & (isDigit(str2)))
                throw new NumberFormatException("Неправильные значения");
                return false;

        }
    }
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }

    }

