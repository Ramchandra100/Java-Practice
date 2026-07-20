import java.util.ArrayList;
import java.util.HashMap;

public class Day5 {
    public static void main(String[] args) {
        //ArrayList of Strings for To-Do List
        ArrayList<String> toDoList = new ArrayList<>();
        toDoList.add("Wake up Early");
        toDoList.add("Exercise");
        toDoList.add("Have Breakfast");
        toDoList.add("Go to Work");
        toDoList.add("Have Lunch");
        toDoList.add("Go Home");
        toDoList.add("Have Dinner");
        toDoList.add("Go to Bed");

        for(String task : toDoList) {
            System.out.println("Task : "+task);
        }
        toDoList.remove(3);
        toDoList.remove(4);
        toDoList.add(3, "Go to Gym");
        System.out.println("After removing tasks : "+toDoList);
        for(String task : toDoList) {
            System.out.println("Task : "+task);
        }

        //HashMap of String and Integer for Student Marks
        HashMap<String, Integer> SubjectMarks = new HashMap<>();
        SubjectMarks.put("Maths", 90);
        SubjectMarks.put("Programming In Java", 95);
        SubjectMarks.put("Data Structures", 85);
        SubjectMarks.put("Database Management System", 80);

        for (String subject : SubjectMarks.keySet()) {
            System.out.println("Subject : " + subject + ", Marks : " + SubjectMarks.get(subject));
        }

        SubjectMarks.remove("Database Management System");
        SubjectMarks.put("Operating System", 75);

        for (String subject : SubjectMarks.keySet()) {
            System.out.println("Subject : " + subject + ", Marks : " + SubjectMarks.get(subject));
        }

        HashMap<String, ArrayList<Integer>> subjectScoresOfLastThree = new HashMap<>();
        ArrayList<Integer> mathsScores = new ArrayList<>();
        mathsScores.add(90);
        mathsScores.add(85);
        mathsScores.add(95);
        subjectScoresOfLastThree.put("Maths", mathsScores);
        ArrayList<Integer> JavaScores = new ArrayList<>();
        JavaScores.add(95);
        JavaScores.add(90);
        JavaScores.add(85);
        subjectScoresOfLastThree.put("Programming In Java", JavaScores);
        for (String subject : subjectScoresOfLastThree.keySet()) {
            // System.out.println("Subject : " + subject + ", Scores : " + subjectScoresOfLastThree.get(subject));
            // ArrayList<Integer> scores = subjectScoresOfLastThree.get(subject);
            // System.out.println("Subject : " + subject + ", Scores : " + scores.get(0) + ", " + scores.get(1) + ", " + scores.get(2));
            ArrayList<Integer> scores = subjectScoresOfLastThree.get(subject);
            System.out.print("Subject : " + subject + ", Scores : ");
            for (int n : scores) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

    }
}