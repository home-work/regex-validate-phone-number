import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {
    public static void main(String[] args) {
        final String PHONE_NUMBER_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        System.out.println("Enter phone number:");
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = scanner.next();
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean res = matcher.matches();
        if (res) {
            System.out.println("Valid Phone Number");
        } else {
            System.out.println("Invalid Phone Number");
        }

    }
}
