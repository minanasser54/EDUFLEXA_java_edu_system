package accounts;

public class Student extends User {

    public Student(int id, String username, String email, String password, String gender) {
        super(id, username, email, password, gender, "STUDENT");
    }
    public static Student createStudent(int id, String username, String email, String password, String gender){
        Student student = new Student(id, username, email, password, gender);
        AccountsUtility.addUser(student);
        return student;}

    @Override
    public String toString(){
        return super.toString();
    }
    
}
