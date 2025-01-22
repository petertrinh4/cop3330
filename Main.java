import java.util.Scanner;

public class Main {
    
    private static int score;
    private static int sumOfScores = 0;
    private static Scanner scoreScanner;
    static int countScoreInput = 0;
    static int seventyHigher = 0;
    static char yesOrNo;
    static Scanner yesOrNoScanner;
    static int gradeA = 0;
    static int gradeB = 0;
    static int gradeC = 0;
    static int gradeD = 0;
    static int gradeF = 0;
    
    /*
     * Instantiated Fields
     */
    

    public static void main(String[] args) {
        
        yesOrNoScanner = new Scanner(System.in);
        scoreScanner = new Scanner(System.in);

        while (true) {
          
            sumOfScores = 0;
            countScoreInput = 0;
            seventyHigher = 0;
            gradeA = 0;
            gradeB = 0;
            gradeC = 0;
            gradeD = 0;
            gradeF = 0;
            
            /*
             * Set variables to zero for counting
             */

            System.out.println("\nWelcome to my program. You will be asked to enter the scores of a test one by one, and to enter -1 to stop.\n");

            /*
             * Beginning program
             */
            
            System.out.print("Enter Score (Enter -1 to Stop): ");
            score = scoreScanner.nextInt();
            
            while (true) {
                if (score >= 90 & score <= 100) {
                    sumOfScores += score;
                    seventyHigher++;
                    gradeA++;
                    countScoreInput++;
                }
                else if (score >= 80 & score <= 89) {
                    sumOfScores += score;
                    seventyHigher++;
                    gradeB++;
                    countScoreInput++;
                }
                else if (score >= 70 & score <= 79) {
                    sumOfScores += score;
                    seventyHigher++;
                    gradeC++;
                    countScoreInput++;
                }
                else if (score >= 60 & score <= 69) {
                    sumOfScores += score;
                    gradeD++;
                    countScoreInput++;
                }
                else if (score <= 59 & score >= 0) {
                    sumOfScores += score;
                    gradeF++;
                    countScoreInput++;
                }
                else if (score > 100 || score < -1) {
                    System.out.printf("Score %d Rejected\n", score);
                    System.out.print("Enter Score (Enter -1 to Stop): ");
                    score = scoreScanner.nextInt();
                }
                else {
                    System.out.println("\nHere is your report: ");
                    System.out.printf("\n\t- A total of %d scores entered. %d of them are 70 or higher.", countScoreInput, seventyHigher);
                    System.out.println("\n\n\t- Letter Grade distribution of the scores:");
                    System.out.printf("\n\t\t- %d Students earned the grade of A (90-100)", gradeA);
                    System.out.printf("\n\t\t- %d Students earned the grade of B (80-89)", gradeB);
                    System.out.printf("\n\t\t- %d Students earned the grade of C (70-79)", gradeC);
                    System.out.printf("\n\t\t- %d Students earned the grade of D (60-69)", gradeD);
                    System.out.printf("\n\t\t- %d Students earned the grade of F (59 or below)\n", gradeF);
                    
                    if (countScoreInput > 0) {
                        double avgScore = (double) sumOfScores / countScoreInput;
                        System.out.printf("\n\t- The average score is: %.2f\n", avgScore);
                    } else {
                        System.out.println("\n\t- No valid scores entered.");
                    }
                    
                    System.out.print("\nWould you like to process another class? (Y or N): ");
                    yesOrNo = yesOrNoScanner.next().charAt(0);
                    if (yesOrNo == 'N' || yesOrNo == 'n') {
                        System.out.println("\nThank you for using the program!");
                        scoreScanner.close();
                        yesOrNoScanner.close();
                        return;
                    } else if (yesOrNo == 'Y' || yesOrNo == 'y') {
                        break;
                    }
                }
                
                System.out.print("Enter Score (Enter -1 to Stop): ");
                score = scoreScanner.nextInt();
            }
        }
    }
}
