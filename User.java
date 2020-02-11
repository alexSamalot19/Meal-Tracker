import java.util.Scanner;

public class User {
    private static int sUsersCreated = 0;
    private String firstName;
    private String lastName;
    private String email;
    private int targetAdherence = 90;

    /* This is called a constructor. This is th function that's called whenever
     *   you create a new User, and is generally where we put our initialization
     *   logic. */
    User(String firstName, String lastName, String email, int targetAdherence) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setTargetAdherence(targetAdherence);

        // Increment count whenever we create a new user.
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

    public int getTargetAdherence() {
        return this.targetAdherence;
    }

    public void setTargetAdherence(int targetAdherence) {
        this.targetAdherence = targetAdherence;
    }

    public void introduce() {
        System.out.println(String.format("My username is %s.", this.firstName));
    }

    // This is a method on the CLASS-not an individual user object.
    public static int getCount() {
        return User.sUsersCreated;
    }

}
