/**
 * the class hold the score and grade for the different activities
 * like lab, pass/fail exam, essay and final exam
 */
public class GradedActivity {

    private double score;       // To hold score

    /**
     * method set the score 
     * @param score hold the numeric grade
     */
    public void setScore(double score) {
        this.score = score;
    }

    /**
     * method return the score
     * @return the numeric grade
     */
    public double getScore() {
        return this.score;
    }

    /**
     * method return the grade
     * @return the grade
     */
    public char getGrade() {
        char letterGrade;

        if (score >= 90)
            letterGrade = 'A';
        else if (score >= 80)
            letterGrade = 'B';
        else if (score >= 70)
            letterGrade = 'C';
        else if (score >= 60)
            letterGrade = 'D';
        else
            letterGrade = 'F';
        
        return letterGrade;
    }

}