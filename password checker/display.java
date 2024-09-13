import java.util.Scanner;
import package1.BruteForceTimeEstimator;
import package1.PasswordStrengthChecker;

public class display {
    public static void main(String[] args) {
        PasswordStrengthChecker strengthChecker = new PasswordStrengthChecker();
        BruteForceTimeEstimator bruteForceEstimator = new BruteForceTimeEstimator();
        Scanner input = new Scanner(System.in);

        System.out.print("\n------**** Password Strength Checker ****------\n");
        System.out.print("\n");
        System.out.print("Enter a password to check its strength : ");
        String userPassword = input.nextLine();

        int strength = strengthChecker.checkPasswordStrength(userPassword);
        System.out.println("Password Strength: " + strengthChecker.getStrengthDescription(strength));

        int length = userPassword.length();
        long time = bruteForceEstimator.estimateBruteForceTime(length);

        System.out.println("Estimated time to break the password using brute force: " + bruteForceEstimator.formatTime(time));
    }
}
