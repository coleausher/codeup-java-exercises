package grades;

public class StudentTest {

    public static void main(String[] args) {
        Student s1 = new Student("Cole");
        Student s2 = new Student("Britanny");
        Student s3 = new Student("Jay");
        Student s4 = new Student("John");

        s1.addGrade(10);
        s2.addGrade(5);
        s3.addGrade(8);
        s4.addGrade(10);
        System.out.println(s1.getGrades());

    }
}
