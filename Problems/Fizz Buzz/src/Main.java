import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String fizzBuzz = "FizzBuzz";
        String fizz = "Fizz";
        String buzz = "Buzz";
        int start = scanner.nextInt();
        int stop = scanner.nextInt();
        for (int i = start; i <= stop; i++) {
            if (i % 15 == 0) {
                System.out.println(fizzBuzz);
            } else if (i % 5 == 0) {
                System.out.println(buzz);
            } else if (i % 3 == 0) {
                System.out.println(fizz);
            } else {
                System.out.println(i);
            }
        }
    }
}