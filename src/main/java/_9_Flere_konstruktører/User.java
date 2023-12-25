package _9_Flere_konstruktører;

public class User {
    private String name;
    private String password;
    private String email;
    private int phoneNumber;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public User(String name, String password, String email, int phoneNumber) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (name != null)
            sb.append("Name: " + name);
        if (password != null)
            sb.append(" Password: " + password);
        if (phoneNumber != 0)
            sb.append(" Phone Number: " + Integer.toString(phoneNumber));
        if (email != null)
            sb.append(" Email: " + email);

        return sb.toString();
    }
}
