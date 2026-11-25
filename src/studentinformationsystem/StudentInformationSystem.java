package studentinformationsystem;

public class StudentInformationSystem {
    public static void main(String[] args) {
        String name = "Nurhafizah binti Mahmuda";
        String studentId = "S85571";
        double mark1 = 67;
        double mark2 = 98;
        double total = mark1 + mark2;

        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Total marks: " + total);

        String message;
        if (total >= 80) {
            message = "Excellent";
        } else if (total >= 60) {
            message = "Good";
        } else {
            message = "Needs Improvement";
        }
        System.out.println("Result: " + message);
    }
}