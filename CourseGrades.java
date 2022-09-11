import java.util.Arrays;

/**
 * the CourseGrades classimplements the Analyzable interface
 */
public class CourseGrades implements Analyzable{

   private final int COUNT = 4;        // for the lab, pass/fail exam, essay and final exam
   private GradedActivity[] grades = new GradedActivity[COUNT];      // array to hold the above activities

   /**
    * Constructor
    */
   public CourseGrades() {
      GradedActivity[] grades = new GradedActivity[COUNT];
   }

   /**
    * method set the grades for the lab
    * @param lab hold the grade
    */
   public void setLab(GradedActivity lab) {
      grades[0] = lab;
   }

   /**
    * method set the grades for the pass/fail exam
    * @param pass_fail_exam hold the grade
    */
   public void setPassFailExam(PassFailExam pass_fail_exam) {
      grades[1] = pass_fail_exam;
   }
   
   /**
    * the method set the grades for the essay
    * @param essay hold the grade
    */
   public void setEssay(GradedActivity essay) {
      grades[2] = essay;
   }

   /**
    * method set the grades for the final exam
    * @param final_exam hold the grade
    */
   public void setFinalExam(FinalExam final_exam) {
      grades[3] = final_exam;
   }
   
   /**
    * the method return the string and overrides the base class
    */
   @Override
   public String toString() {
      String str= "Lab Score: " + grades[0].getScore() + " \t\tGrade: " + grades[0].getGrade() +
                  "\nPass/Fail Exam Score: " + grades[1].getScore() + " \tGrade: " + grades[1].getGrade() +
                  "\nEssay Score: " + grades[2].getScore() + " \t\tGrade: " + grades[2].getGrade() +
                  "\nFinal Exam Score: "+grades[3].getScore() + " \t\tGrade: " + grades[3].getGrade();
      
      return str;
   }

   /**
    * return the average of all activites
    */
   public double getAverage() {
      double avg = (grades[0].getScore() + grades[1].getScore() + 
                    grades[2].getScore() + grades[3].getScore()) / (double) 4;
      
      return avg;
   }      
   
   /**
    * return the highest grade of all the activities
    */
   public GradedActivity getHighest() {
      int temp = 1;
      for (int i = 0; i < COUNT; i++) {
         if(grades[i].getScore() > grades[temp].getScore()) {  
            temp = i;
         }
      }

      return grades[temp];
   }
   
   /**
    * return the lowest grade of all the activities
    */
   public GradedActivity getLowest() {
      int temp = 1;
      for (int i = 0; i < COUNT; i++) {
         if(grades[i].getScore() < grades[temp].getScore()) {  
            temp = i;
         }
      }
      
      return grades[temp];
   }

}