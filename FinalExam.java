/**
   This class determines the grade for a final exam.
*/

public class FinalExam extends GradedActivity {
   
   double numericScore;  // To hold a numeric score

   public FinalExam() {
      // Call the inherited setScore method to
      // set the numeric score.
      setScore(numericScore);
   }
   /**
      The equals method compares the calling object
      to the argument object for equality.
      @return true if the calling
      object's score is equal to the argument's
      score.
   */
   public boolean equals(GradedActivity g) {
      boolean status; 

      if (this.getScore() == g.getScore())
         status = true;
      else
         status = false;

      return status;
   }

   /**
      The isGreater method determines whether the calling
      object is greater than the argument object.
      @return true if the calling object's score is
      greater than the argument object's score.
   */
   public boolean isGreater(GradedActivity g) {
      boolean status; 

      if (this.getScore() > g.getScore())
         status = true;
      else
         status = false;

      return status;
   }

   /**
      The isLess method determines whether the calling
      object is less than the argument object.
      @return true if the calling object's score is
      less than the argument object's score.
   */
   public boolean isLess(GradedActivity g) {
      boolean status; 

      if (this.getScore() < g.getScore())
         status = true;
      else
         status = false;

      return status;
   }
}