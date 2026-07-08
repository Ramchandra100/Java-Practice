import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] agrs){
        int number = 1;
        double demcimal = 20.02;
        char Letter = 'A' ;
        String wordLine = "By String";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Letter Please : ");
        //Read the next word and grab just the first character
        Letter = sc.nextLine().charAt(0);
        System.out.println("\n" + "This Letter '"+ Letter + "' was typed by you.");
    }
}