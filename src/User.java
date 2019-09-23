import java.security.MessageDigest;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static boolean validateUsername(String username) {
        String regex = "^(?=.*\\d)[A-Z][a-z0-9_-]{5,9}$"; //at least one number, must start with a capital, and between 6 and 11 characters
        if(username.matches(regex)) return true;
        return false;
    }

    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hashInBytes = md.digest(password.getBytes());

            StringBuilder sb = new StringBuilder();
            for (byte b : hashInBytes) {
                sb.append(String.format("%02x", b));
            }
            System.out.println(sb.toString());
            return sb.toString();
        } catch (Exception e) {
            return null;
        }
    }

    public String toString() {
        return "User successfully created.\nUsername: " + this.username + "\nHashed password: " + this.password;
    }
}
