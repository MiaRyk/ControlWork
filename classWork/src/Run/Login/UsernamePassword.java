package Run.Login;

public class UsernamePassword {
    private String login;
    private String password;
    private String correctLogin = "Masha";
    private String correctPassword = "12345";

    public UsernamePassword(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void check() {
        if (login.equals(correctLogin)) {
            System.out.println("Correct username");
        } else {
            System.out.println("Incorrect username");
            System.exit(0);
        }
        if (password.equals(correctPassword)) {
            System.out.println("Correct password");
        } else {
            System.out.println("Incorrect password");
            System.exit(0);
        }

    }
}
