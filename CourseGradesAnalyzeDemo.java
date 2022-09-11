/**
 * 
 */
public class CourseGradesAnalyzeDemo {

    public static void main(String[] args) {
        
        // Instance of CourseGrades class
        CourseGrades grades = new CourseGrades();
        
        // Instance for LabActivity
        GradedActivity lab = new GradedActivity();
        lab.setScore(85);
        grades.setLab(lab);

        // Instance of PassFailExam class
        PassFailExam exam = new PassFailExam(85);
        exam.setScore(85);
        grades.setPassFailExam(exam);

        // Instance for Essay
        GradedActivity essay = new GradedActivity();
        essay.setScore(80);
        grades.setEssay(essay);

        // Instance of FinalExam class
        FinalExam f_exam = new FinalExam();
        f_exam.setScore(80);
        grades.setFinalExam(f_exam);

        System.out.println(grades);
        System.out.printf("Average Score: %.1f\n", grades.getAverage());
        GradedActivity high = grades.getHighest();
        System.out.printf("Highest Score: %.1f\n", high.getScore());
        GradedActivity low = grades.getLowest();
        System.out.printf("Lowest Score: %.1f\n\n", low.getScore());
    }

}