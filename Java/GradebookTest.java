import java.util.*;
public class GradebookTest {
    public static void main(String[] args){
        int [][] gradesArray = {{87,88,90},{87,98,67},{34,67,78},{35,78,67},{79,69,67},{87,96,94},{85,48,89}};
        Gradebook myGradeBook = new Gradebook("Java Test", gradesArray);
        System.out.printf("welcome to gradebok for %n%s%n%n",
        myGradeBook.getCourseName());
        myGradeBook.processGrades();

    }
    
}
