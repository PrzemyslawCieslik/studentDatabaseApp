import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentId;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: prompt user to enter student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("Enter student class level: ");
        this.gradeYear = in.nextLine();

        setStudentId();
    }

    //Generate an ID
    private void setStudentId(){
        id++;
        this.studentId = gradeYear + "" + id;
    }

    //Enroll courses
    public void enroll(){
        do{
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if(!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }
        } while (1 != 0);
        System.out.println("Enrolled in: " + courses);
    }

    //View balance
    public void viewBalance(){
        System.out.println("Your balance is: £" + tuitionBalance);
    }

    //Pay Tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: £");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of £"+payment);
        viewBalance();
    }
    //Show status
    public String showInfo(){
        return "Name: " + firstName + " " + lastName +
                "\nGrade level: " + gradeYear +
                "\nStudent ID: " + studentId +
                "\n courses Enroled: " + courses +
                "\nBalance: £" + tuitionBalance;
    }

}
