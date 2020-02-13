import java.util.Scanner;

public class User {
    private static int sUsersCreated = 0;
    private String firstName;
    private String lastName;
    private String email;
    private double targetAdherence = 90;

    User(String firstName, String lastName, String email, double targetAdherence) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setTargetAdherence(targetAdherence);

        User.sUsersCreated += 1;
    }

    public String getFirstName() {
        return this.firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public double getTargetAdherence() {
        return this.targetAdherence;
    }

    public void setTargetAdherence(double targetAdherence) {
        this.targetAdherence = targetAdherence;
    }

    public void introduce() {
        System.out.println(String.format("My username is %s.", this.firstName));
    }

    public static int getCount() {
        return User.sUsersCreated;
    }

}
