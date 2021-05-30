import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        String t = "True";
        String f = "False";
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > -15 && num <= 12) {
            System.out.println(t);
        } else if (num > 14 && num < 17) {
            System.out.println(t);
        } else if (num >= 19) {
            System.out.println(t);
        } else {
            System.out.println(f);
        }
    }
}