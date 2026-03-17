package dao;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AttendanceDAO {

    public void markAttendance(int studentId, String date, String status) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO Attendance(student_id,attendance_date,status) VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, studentId);
            ps.setString(2, date);
            ps.setString(3, status);

            ps.executeUpdate();

            System.out.println("Attendance Marked");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}