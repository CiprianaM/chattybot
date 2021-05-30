import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int value = scanner.nextInt();
        if (value == length && value == width) {
            System.out.println("YES");
        } else {
            boolean isSubdivision = false;
            for (int i = 0; i <= length; i++) {
                if (i * width == value) {
                    isSubdivision = true;
                }
            }
            for (int i = 0; i <= width; i++) {
                if (i * length == value) {
                    isSubdivision = true;
                }
            }
            if (isSubdivision) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
