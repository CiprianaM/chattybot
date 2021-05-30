import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int noOfElements = scanner.nextInt();
        int sumOfDivisibleBySix = 0;
        for (int i = 0; i < noOfElements; i++) {
            int element = scanner.nextInt();
            if (element % 6 == 0) {
                sumOfDivisibleBySix += element;
            }
        }
        System.out.println(sumOfDivisibleBySix);
    }
}