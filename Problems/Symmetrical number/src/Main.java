import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanenr = new Scanner(System.in);
        int num = scanenr.nextInt();
        int firstDigit = num / 1000;
        int secondDigit = num % 1000 / 100;
        int thirdDigit = num % 100 / 10;
        int fourthDigit = num % 10;
        if (firstDigit == fourthDigit && secondDigit == thirdDigit) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}