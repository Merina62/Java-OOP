import java.util.Scanner;
public class MobileOrdering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter 1 for Sign up.");
            System.out.println("Please enter 2 for Quit.");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                signUpProcess(scanner);
            } else if (choice == 2) {
                System.out.println("Thank you for using the Application.");
                break;
            } else {
                System.out.println("Invalid input. Please enter 1 or 2.");
            }
        }
        scanner.close();
    }

    private static void signUpProcess(Scanner scanner) {
        String fullName, contactNumber, password, confirmPassword, dob;
        while (true) {
            System.out.println("Please enter your full name:");
            fullName = scanner.nextLine();
            System.out.println("Please enter your mobile number (username):");
            contactNumber = scanner.nextLine();
            System.out.println("Please enter your password:");
            password = scanner.nextLine();
            System.out.println("Please confirm your password:");
            confirmPassword = scanner.nextLine();
            System.out.println("Please enter your Date of Birth #DD/MM/YYYY (No space):");
            dob = scanner.nextLine();

            // Validate the input
            if (validateInput(fullName, contactNumber, password, confirmPassword, dob)) {
                System.out.println("You have successfully signed up.");
                break;
            }
        }
    }

    private static boolean validateInput(String fullName, String contactNumber, String password, String confirmPassword, String dob) {
        if (fullName.length() <= 4) {

            System.out.println("Full name must be greater than four characters. Please start again.");
            return false;
        }

        if (!contactNumber.startsWith("0") || contactNumber.length() != 10) {
            System.out.println("Mobile number must start with 0 and have 10 digits. Please start again.");
            return false;
        }

        if (!password.matches("^[a-zA-Z]+[@&]\\d+$")) {
            System.out.println("Password must start with alphabets, followed by @ or & and end with numeric. Please start again.");
            return false;
        }

        if (!password.equals(confirmPassword)) {
            System.out.println("Your passwords are not matching. Please start again.");
            return false;
        }

        if (!dob.matches("\\d{2}/\\d{2}/\\d{4}")) {
            System.out.println("You have entered the Date of Birth in invalid format. Please start again.");
            return false;
        }

        int birthYear = Integer.parseInt(dob.substring(6));
        int currentYear = java.time.Year.now().getValue();
        if ((currentYear - birthYear) < 21) {
            System.out.println("You must be at least 21 years old. Please start again.");
            return false;
        }
        // If all conditions are met, return true
        return true;
    }
}