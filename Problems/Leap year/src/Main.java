import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        String leap = "Leap";
        String regular = "Regular";
        if (year % 400 == 0) {
            System.out.println(leap);
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(leap);
        } else {
            System.out.println(regular);
        }
    }
}