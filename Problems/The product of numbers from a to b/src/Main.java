import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int stop = scanner.nextInt();
        long product = 1;
        for (int i = start; i < stop; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}