import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean isAValid = b + c > a;
        boolean isBValid = a + c > b;
        boolean isCValid = a + b > c;
        if (isAValid && isBValid && isCValid) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}