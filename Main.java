package ui;

import java.util.Scanner;
import dao.StudentDAO;
import dao.AttendanceDAO;
import model.Student;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO studentDAO = new StudentDAO();
        AttendanceDAO attendanceDAO = new AttendanceDAO();

        while(true) {

            System.out.println("1 Add Student");
            System.out.println("2 Mark Attendance");
            System.out.println("3 Exit");

            int choice = sc.nextInt();

            if(choice==1) {

                sc.nextLine();

                System.out.println("Enter Name");
                String name = sc.nextLine();

                System.out.println("Enter Department");
                String dept = sc.nextLine();

                System.out.println("Enter Email");
                String email = sc.nextLine();

                Student s = new Student(name,dept,email);

                studentDAO.addStudent(s);
            }

            else if(choice==2) {

                System.out.println("Enter Student ID");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.println("Enter Date (YYYY-MM-DD)");
                String date = sc.nextLine();

                System.out.println("Enter Status (Present/Absent)");
                String status = sc.nextLine();

                attendanceDAO.markAttendance(id,date,status);
            }

            else if(choice==3) {
                break;
            }
        }
    }
}