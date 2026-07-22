import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

 class Students{
    int marks;
    String name;
     Students(int m, String n){
        marks=m;
        name=n;
    }
    void display(){
        System.out.println(name + " Scored : " + marks);
    }

    String getGrade(){
        if(marks>=90){
            return "EXCELLENT";
        }else if(marks>=80){
            return "VERY GOOD";
        }else{
            return "GOOD";
        }
    }
    
}

 class InvalidMarksException extends Exception{
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

    static void sortStudents(ArrayList<Students> student){
        for(int i=0; i<student.size(); i++){
            for(int j=i+1; j<student.size(); j++){
                if(student.get(i).marks < student.get(j).marks){
                    Students temp = student.get(i);
                    student.set(i, student.get(j));
                    student.set(j, temp);
                }
            }
        }
    }
    
    public static void main(String args[]){
        int marks;
        String name;
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> studentMap = new HashMap<>();
        ArrayList<Students> student = new ArrayList<>();

        try{
        System.out.print("Enter name : ");
        name= sc.nextLine();
        System.out.print("Enter Your Marks : ");
        marks= Integer.parseInt(sc.nextLine());

        validateMarks(marks);

        studentMap.put(name, marks);
        Students s1 = new Students(marks, name);
        student.add(s1);

        System.out.print("Enter name : ");
        name= sc.nextLine();
        System.out.print("Enter Your Marks : ");
        studentMap.put(name, marks);
        marks= Integer.parseInt(sc.nextLine());

        validateMarks(marks);


        Students s2 = new Students(marks, name);
        student.add(s2);

        marks = 0;
        for(Students s : student){
            if(marks < s.marks){
                marks = s.marks;
                name = s.name;
            }
            s.display();
            System.out.println("Grade : " + s.getGrade());
          
        }

        System.out.println("Highest Marks Scored by : " + name + " is : " + marks);

        System.out.print("Enter name to find the marks : ");
        name= sc.nextLine();
        if(studentMap.containsKey(name)){
            System.out.println(name + " Scored : " + studentMap.get(name));
        } else {
            System.out.println("Student not found");
        }

        sortStudents(student);
        System.out.println("Students Sorted by Marks : ");
        for(Students s : student){
            s.display();
            System.out.println("Grade : " + s.getGrade());
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