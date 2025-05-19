package Que_Solve;

class InvalidCourseException extends Exception {
    public InvalidCourseException(String titel,int minCredit) {
        super(titel + " is not a valid course as it doesn't fulfill the minimum credit requirement of "+ minCredit + " credits.");
    }
}

public class CourseTest {

    public static void main(String[] args) {
        String courseName = "Java Programming";
        int credits = 2;

        try {

            int minCredits = 3;
            if (credits < minCredits) {
                throw new InvalidCourseException(courseName, minCredits);
            } else {
                System.out.println(courseName + " is a valid course.");
            }

        } catch (InvalidCourseException e) {
            System.out.println(e.getMessage());
        }
    }

}
