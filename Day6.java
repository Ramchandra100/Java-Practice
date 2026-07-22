import java.util.Scanner;

// Custom exception class for invalid marks
public class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}
//` Custom exception class for exam failure
public class ExamFailureException extends Exception {
    public ExamFailureException(String message) {
        super(message);
    }
}

public class Day6 {
    // Method to validate marks and throw exceptions if necessary
    static void validateMarks(int marks) throws InvalidMarksException , ExamFailureException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Invalid marks: " + marks + ". Marks should be between 0 and 100.");
        }
        else if (marks < 40) {
            throw new ExamFailureException("You have failed the exam with marks: " + marks);
        }
        else {
            System.out.println("Congratulations! You have passed the exam.");
        }
        System.out.println("You scored: " + marks);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks you scored : ");
        // Read the input and validate it
        try {
            int marks = Integer.parseInt(sc.nextLine());
            validateMarks(marks);// Call the method to validate marks
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        } 
        catch (ExamFailureException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
            
        
            