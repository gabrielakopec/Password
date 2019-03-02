import java.util.Scanner;

public class Password {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        System.out.println(IfCorrectPassword(password));
    }


    public static boolean IfHasEightSigns(String password) {
        if (password.length() >= 8) {
            return true;
        } else
            return false;
    }

    public static boolean IfContainsNumbersLettersSpecialSigns(String password) {


        long numberOfCorrectSigns = password.chars()
                .filter(s -> s >= 48 && s <= 57 || s >= 64 && s <= 90 || s >= 97 && s <= 127 || s == 33 || s >= 35 && s <= 38)
                .count();

        if (numberOfCorrectSigns == password.length())
            return true;
        else
            return
                    false;
    }

    public static boolean IfContainsAtLeastTwoNumbers(String password) {

        long numberOfNumbers = password.chars().filter(s -> s >= 48 && s <= 57)
                .count();

        if (numberOfNumbers >= 2)
            return true;
        else
            return false;
    }

    public static boolean IfContainsAtLeastOneBigLetter(String password) {

        long numberOfNumbers = password.chars().filter(s -> s >= 65 && s <= 90)
                .count();

        if (numberOfNumbers >= 1)
            return true;
        else
            return false;
    }

    public static boolean IfContainsAtLeastOneSpecialSign(String password) {

        long numberOfNumbers = password.chars().filter(s -> s >= 35 && s <= 38 || s == 64 || s == 33)
                .count();

        if (numberOfNumbers >= 1)
            return true;
        else
            return false;
    }

    public static boolean IfCorrectPassword(String password) {
        if (IfHasEightSigns(password) &&
                IfContainsNumbersLettersSpecialSigns(password) &&
                IfContainsAtLeastTwoNumbers(password) &&
                IfContainsAtLeastOneBigLetter(password) &&
                IfContainsAtLeastOneSpecialSign(password)) {
            return true;
        } else
            return false;
    }

}
