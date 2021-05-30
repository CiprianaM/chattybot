import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int noOfSolutions = 0;
        for (int i = 0; i <= 1000 && noOfSolutions < 3; i++) {
            double first = a * Math.pow(i, 3);
            double second = b * Math.pow(i, 2);
            double third = c * i;
            double result = first + second + third + d;
            if (result == 0) {
                noOfSolutions += 1;
                System.out.println(i);
            }
        }
    }
}