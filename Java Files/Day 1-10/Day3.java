import java.util.Scanner;

public class Day3{
    public static void main(String[] args) {
        String subject[] = {"Maths", "Science", "English", "History", "Geography"};
        String checkSubject = "null";
        int marks[] = {90, 85, 78, 92, 88};
        int totalMarks = 0, averageMarks = 0, highest = 0;
        boolean found = false;

        for(int i=0; i<subject.length; i++){
            totalMarks += marks[i];

            if(highest < marks[i]) {
                highest = marks[i];
                checkSubject = subject[i];
            }
            System.out.println("Marks in " + subject[i] + " : " + marks[i]);
        }
        System.out.println("Highest Marks: " + highest + " In Subject: " + checkSubject);
        System.out.println("Average Marks: " + totalMarks / subject.length);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the subject name to find in the array : ");
        checkSubject = sc.nextLine();
        for (String s : subject) {
            if (s.toLowerCase().equals(checkSubject.toLowerCase())) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(checkSubject + " is present in the array.");
        } else {
            System.out.println(checkSubject + " is not present in the array.");
        }
        
    }
}