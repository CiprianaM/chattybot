import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int noOfParts = scanner.nextInt();
        int rejected = 0;
        int toFix = 0;
        int perfect = 0;
        for (int i = 0; i < noOfParts; i++) {
            int value = scanner.nextInt();
            if (value == 0) {
                perfect += 1;
            } else if (value == -1) {
                rejected += 1;
            } else {
                toFix += 1;
            }
        }
        System.out.printf("%s %s %s", perfect, toFix, rejected);
    }
}