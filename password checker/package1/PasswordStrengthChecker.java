package package1;

public class PasswordStrengthChecker {

    public int checkPasswordStrength(String password) {
        int strength = 0;

        if (password.length() >= 8) {
            strength++;
        }

        if (password.matches(".*\\d.*")) {
            strength++;
        }

        if (password.matches(".*[A-Z].*")) {
            strength++;
        }

        if (password.matches(".*[a-z].*")) {
            strength++;
        }

         if (password.matches(".[!@#$%^&()_+=-{};:'<>,./?].*")) {
            strength++;

        
        }

        return strength;
    }


    public String getStrengthDescription(int strength){
        if (strength == 1){
            return "Very Weak ! - it takes only some minutes to break ";
        }

        else if (strength == 2){
            return "Weak ! - it takes some hours to break only";
        }

        else if (strength == 3){
            return "Medium ! - it may take some days to break";
        }

        else if (strength == 4){
            return "Very Strong!! - it may take some years to break";
        }

        else {
            return "Not Calculated yet";
        }
    }
}
