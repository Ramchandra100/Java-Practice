import java.util.Scanner;
public class Day1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name= "Ram";
        String jobTitle = "PM";
        int age = 23;
        int num=0;
        System.out.println("Name : "+name+" Age : "+age+" Job Title : "+jobTitle);
        System.out.print("Enter a number to check whether it is even or odd : ");
        num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("It is even number !");
        }else{
            System.out.println("It is Odd number !");
        }
    }
}