package accounts;

public abstract class User {
    private int id;    //auto fetched from json and created by increasing last of json
    private String username;
    private String email;
    private String password;
    private String gender;
    private String role;

    public User(int id,String username , String email,String password,String gender,String role) { //typical users
        this.id=id;
        this.username=username;
        this.email=email;
        this.password=password;
        this.gender=gender;
        this.role=role;
    }
    public User(int id,String username , String email,String password,String gender) {  //no role users
        this.id=id;
        this.username=username;
        this.email=email;
        this.password=password;
        this.gender=gender;
    }
    

    //setters for future editable data fields
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
    public String toString(){
        return (
            "username: "+this.username+"\nEmail:  "+this.email+"\nRole: "+this.role);
    }
}
