package model;

import java.time.LocalDate;

public class Attendance {
    private int studentId;
    private LocalDate date;
    private boolean present;

    public Attendance(int studentId, LocalDate date, boolean present){
        this.studentId = studentId;
        this.date = date;
        this.present = present;
    }

    // Getters
    public int getStudentId() { return studentId; }
    public LocalDate getDate() { return date; }
    public boolean isPresent() { return present; }
}