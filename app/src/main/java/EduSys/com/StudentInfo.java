package EduSys.com;

public class StudentInfo {

    // Private variables
    private int studentId;
    private String name;
    private String birthday;
    private String password;

    // Constructor
    public StudentInfo(int id, String name, String birthday, String pass) {
        this.studentId = id;
        this.name = name;
        this.birthday = birthday;
        this.password = pass;
    }

    // Set functions
    public void setId(int id) { this.studentId = id; }
    public void setName(String name) { this.name = name; }
    public void setBirthday(String birthday) { this.birthday = birthday; }
    public void setPassword(String pass) { this.password = pass; }

    // Get functions
    public int getId() { return studentId; }
    public String getName() { return name; }
    public String getBirthday() { return birthday; }
    public String getPassword() { return password; }
}
