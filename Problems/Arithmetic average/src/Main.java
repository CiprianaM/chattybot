import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int stop = scanner.nextInt();
        int total = 0;
        double noOfDivisible = 0;
        for (int i = start; i <= stop; i++) {
            if (i % 3 == 0) {
                total += i;
                noOfDivisible += 1;
            }
        }
        double average = 0;
        if (noOfDivisible > 0) {
            average = Double.valueOf(total) / noOfDivisible;
        }
        System.out.println(average);
    }
}