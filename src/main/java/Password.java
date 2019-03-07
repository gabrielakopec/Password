import java.util.Scanner;

public class Password {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        System.out.println(ifCorrectPassword(password));
    }


    static boolean ifHasEightSigns(String password) {
        return password.length() >= 8;
    }

    static boolean ifContainsNumbersLettersSpecialSigns(String password) {


        return password.chars()
                .filter(s ->
                        charIsBetween(s, 48, 57) ||
                        charIsBetween(s, 64, 90) ||
                        charIsBetween(s, 97, 127) ||
                        charIsBetween(s, 35, 38) ||
                        s == 33)
                .count() == password.length();
    }

    static boolean ifContainsAtLeastTwoNumbers(String password) {
        return password
            .chars()
            .filter(s -> charIsBetween(s, 48, 57))
            .count() >= 2;
    }

    static boolean ifContainsAtLeastOneBigLetter(String password) {
        return password
            .chars()
            .filter(s -> charIsBetween(s, 65, 90))
            .count() >= 1;
    }

    static boolean ifContainsAtLeastOneSpecialSign(String password) {

        return password
            .chars()
            .filter(s ->
                    charIsBetween(s, 35, 38) ||
                    s == 64 ||
                    s == 33)
            .count() >= 1;
    }

    static boolean ifCorrectPassword(String password) {
        return ifHasEightSigns(password) &&
            ifContainsNumbersLettersSpecialSigns(password) &&
            ifContainsAtLeastTwoNumbers(password) &&
            ifContainsAtLeastOneBigLetter(password) &&
            ifContainsAtLeastOneSpecialSign(password);
    }

    private static boolean charIsBetween(int s, int start, int end) {
        return s >= start && s <= end;
    }

}
