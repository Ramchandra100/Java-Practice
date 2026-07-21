import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Students{
    int marks;
    String name;
     Students(int m, String n){
        marks=m;
        name=n;
    }
    void display(){
        System.out.println(name + " Scored : " + marks);
    }
}

public class InvalidMarksException extends Exception{
    public InvalidMarksException(String message){
    super(message);
    }
}


public class Day7{
    
    static void validateMarks(int marks) throws InvalidMarksException{
        if(marks>100 || marks < 0){
            throw new InvalidMarksException("Please Enter marks Between 0-100");
        }
        System.out.println("You Scored : " + marks);
    }
    
    public static void main(String args[]){
        int marks;
        String name;
        Scanner sc = new Scanner(System.in);
        ArrayList<Students> student = new ArrayList<>();

        try{
        System.out.print("Enter name : ");
        name= sc.nextLine();
        System.out.print("Enter Your Marks : ");
        marks= Integer.parseInt(sc.nextLine());

        validateMarks(marks);

        Students s1 = new Students(marks, name);
        student.add(s1);

        System.out.print("Enter name : ");
        name= sc.nextLine();
        System.out.print("Enter Your Marks : ");
        marks= Integer.parseInt(sc.nextLine());

        validateMarks(marks);


        Students s2 = new Students(marks, name);
        student.add(s2);

        for(Students s : student){
            s.display();
        }
        } catch(InvalidMarksException e){
            System.out.println(e.getMessage());
        } catch(NumberFormatException e){
            System.out.println("Please Enter Valid Marks");
        } finally{
            sc.close();
        }
    }
}