package model;

public class Student {

    private int studentId;
    private String name;
    private String department;
    private String email;

    public Student() {}

    public Student(String name, String department, String email) {
        this.name = name;
        this.department = department;
        this.email = email;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getEmail() { return email; }
}