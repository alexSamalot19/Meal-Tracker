public class User {
    private String firstName;

    public User(String firstName) {
        this.firstName = firstName;
    }

    public void welcomeUser() {
        System.out.printf("Welcome %s ! %n", firstName);
    }
}
