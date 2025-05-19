
class InvalidCourseException extends Exception {
    public InvalidCourseException(String titel, int Credits, int minCredit) {
        super(titel + " is not a valid course. " + minCredit + " Credits");
    }
}

public class CourseTest {

    public static void main(String[] args) {
        String courseName = "Java Programming";
        int credits = 2;

        try {
            
            int minCredits = 3;
            if (credits < minCredits) {
                throw new InvalidCourseException(courseName, credits, minCredits);
            } else {
                System.out.println(courseName + " is a valid course.");
            }

        } catch (InvalidCourseException e) {
            System.out.println(e.getMessage());
        }
    }

}
