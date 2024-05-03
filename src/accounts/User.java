package accounts;

public abstract class User {
    private int id;
    private String username;
    private String email;
    private String password;
    private String gender;
    private String role;

    public User(int id, String username, String email, String password, String gender, String role) { // typical users
        if (id < 0) {
            throw new IllegalArgumentException("ID must be a positive integer");
        }
        this.id = id;

        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        this.username = username;

        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.email = email;

        if (password == null || password.length() < 4) {
            throw new IllegalArgumentException("Password must be at least 4 characters long");
        }
        this.password = password;

        if (!(gender instanceof String)) {
            throw new IllegalArgumentException("Gender must be a string");
        }
        String genderStr = (String) gender;
        if (!"male".equalsIgnoreCase(genderStr) && !"female".equalsIgnoreCase(genderStr)) {
            throw new IllegalArgumentException("Gender must be either 'male' or 'female'");
        }
        this.gender = genderStr;

        if (role == null || role.isEmpty()) {
            throw new IllegalArgumentException("Role cannot be empty");
        }
        this.role = role;
    }

    public User(int id, String username, String email, String password, String gender) { // no role users
        if (id < 0) {
            throw new IllegalArgumentException("ID must be a positive integer");
        }
        this.id = id;

        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        this.username = username;

        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.email = email;

        if (password == null || password.length() < 4) {
            throw new IllegalArgumentException("Password must be at least 4 characters long");
        }
        this.password = password;

        if (!(gender instanceof String)) {
            throw new IllegalArgumentException("Gender must be a string");
        }
        String genderStr = (String) gender;
        if (!"male".equalsIgnoreCase(genderStr) && !"female".equalsIgnoreCase(genderStr)) {
            throw new IllegalArgumentException("Gender must be either 'male' or 'female'");
        }
        this.gender = genderStr;
    }

    // setters for future editable data fields
    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return ("<user>" +
                ((Integer) this.id).toString() + "$" +
                this.username + "$" +
                this.email + "$" +
                this.password + "$" +
                this.gender + "$" +
                this.role + "</user>\n");
    }
}
