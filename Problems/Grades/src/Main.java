import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int noOfA = 0;
        int noOfB = 0;
        int noOfC = 0;
        int noOfD = 0;

        for (int i = 0; i < n; i++) {
            int noOfPoints = scanner.nextInt();
            if (noOfPoints == 5) {
                noOfA += 1;
            } else if (noOfPoints == 4) {
                noOfB += 1;
            } else if (noOfPoints == 3) {
                noOfC += 1;
            } else {
                noOfD += 1;
            }
        }
        System.out.printf("%s %s %s %s", noOfD, noOfC, noOfB, noOfA);
    }
}