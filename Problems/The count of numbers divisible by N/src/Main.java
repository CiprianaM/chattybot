import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int stop = scanner.nextInt();
        int divisor = scanner.nextInt();
        int noOfDivisible = 0;
        for (int i = start; i <= stop; i++) {
            if (i % divisor == 0) {
                noOfDivisible += 1;
            }
        }
        System.out.println(noOfDivisible);
    }
}