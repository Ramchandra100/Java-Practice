public class Day4 {
    public static void main(String[] args) {
        int n = 4321;
        String reverse = "";
        while (n>0) {
            int digit = n % 10;
            reverse += String.valueOf(digit);
            n /= 10;
        }
        System.out.println("The reverse of the number(" + 4321 + ") is: " + reverse);

        reverse = "Programming";
        reverse = reverse.toLowerCase();
        n=0;
        for (int i = 0; i < reverse.length(); i++) {
            if (reverse.charAt(i) == 'g') {
                n++;
            }
        }
        System.out.println("Occurrence of 'g': " + n);

        for (int i = 1; i <= 10; i++) {
            System.out.println("\n ================================ \n"+"Table of " + i + "\n ================================ \n");
            for(int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }
    }
}