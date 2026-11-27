import java.util.Scanner;
class Operations{
    void fizbuz(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        if(n%3==0 && n%5==0){
        System.out.println("Fizbuz");
        }else if(n%3==0){
        System.out.println("Fiz");
        }else if(n%5==0){
        System.out.println("Buz");
        }else{
        System.out.println("Not fizbuz");
        }
    }

    void checkPrime(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        boolean prime= true;
        for(int i=2; i<n-1;i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
        if(prime){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }

    void palindrom(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        String rev="";
        for(int i = str.length()-1;i>=0;i--){
            rev+= str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not Palindrom");
        }
    }

    void sumDigit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            int rev = n%10;
            sum+=rev;
            n/=10;
        }
        System.out.println("Sum : "+sum);
    }

    void countVowels(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str =sc.nextLine();
        String vowels="aeiou";
        str=str.toLowerCase();
        int count =0;
        for(char ch : str.toCharArray()){
            if(vowels.contains(String.valueOf(ch)))
            count++;
        }
        System.out.println("Count : " + count);
    }
}

public class D4{
    public static void main(String[] args){
        Operations op = new Operations();
        op.fizbuz();
        op.checkPrime();
        op.palindrom();
        op.sumDigit();
        op.countVowels();
    }
}

