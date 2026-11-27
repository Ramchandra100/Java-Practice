import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

class MarksException extends Exception{
    MarksException(String m){
        super(m);
    }
}

class ValidateMarks{
    void Validate(double marks) throws MarksException{
        if(marks<0 || marks>100){
            throw new MarksException("Please enter marks within 0-100");
        }
    }
}

class Operations{
    void average(ArrayList<Students> StudentList){
        double averagemarks=0.00, sum=0.00;
        for(int i=0; i<StudentList.size();i++){
            Students student = StudentList.get(i);
            sum+=student.marks;
            averagemarks++;
        }
        System.out.println("Average marks of "+ averagemarks +" students : "+(sum/averagemarks));
    }

    void topper(ArrayList<Students> StudentList){
        int index = -1;
        double high=-1;
        for(int i=0; i< StudentList.size();i++){
            if(StudentList.get(i).marks>high){
                index=i;
                high=StudentList.get(i).marks;
            }
        }
        System.out.println("Toper is \nName : "+ StudentList.get(index).name +"\nMarks : "+ StudentList.get(index).marks);
    }

    HashMap<String,Double> giveHashMap(ArrayList<Students> StudentList){
        HashMap<String,Double> studentMap = new HashMap<>();
        for(Students student : StudentList){
            studentMap.put(student.name,student.marks);
        }
        return studentMap;
    }

    void search(String name, HashMap<String,Double> studentMap){
        System.out.print("Student "+name+" has marks : "+studentMap.get(name));
    }
    
}

class Students{
    String name;
    double marks;
    Students(String name, double marks){
        this.marks=marks;
        this.name=name;
    }

    void display(){
        System.out.println("Name : " + name + " and marks : "+ marks);
    }
}

public class D7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Students> StudentList = new ArrayList<>();
        ValidateMarks check = new ValidateMarks();
        Operations op = new Operations();

        try{
        for(int i=1; i<=2; i++){
            System.out.println("Enter "+i+" student detail:- ");
            System.out.print("Enter Name : ");
            String name = sc.nextLine();
            System.out.print("Enter Marks : ");
            double marks = Double.parseDouble(sc.nextLine());
            check.Validate(marks);
            Students student = new Students(name,marks);
            StudentList.add(student);
        }
        }catch(MarksException e){
            System.out.println(e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("Enter a number !!!");
        }

        StudentList.get(0).display();
        op.average(StudentList);
        op.topper(StudentList);

        System.out.print("Enter name to search marks of that student : ");
        String name = sc.nextLine();
        HashMap<String,Double> studentMap = op.giveHashMap(StudentList);
        op.search(name,studentMap);
    }
}