import java.util.Scanner;

class MarkException extends Exception{
    MarkException(String m){
        super(m);
    }
}


class Operations{
    void marksExp(int n) throws MarkException{
        if(n>100 || n<0){
            throw new MarkException("Invaild Marks");
        }
        System.out.println("Marks : "+ n);
    }


}

public class D6{
    public static void main(String[] args){
        Operations op = new Operations();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Mark : ");
        try{
        int n = Integer.parseInt(sc.nextLine());
        op.marksExp(n);
        }catch(MarkException e){
            System.out.println(e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("Please Enter a number!!!");
        }finally{
            System.out.println("Here program Ends....");
        }
    }
}