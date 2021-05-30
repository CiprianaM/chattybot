import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String yes = "YES";
        String no = "NO";
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        // attack on line or column
        // no other checks needed
        if (x1 == x2 || y1 == y2) {
            System.out.println(yes);
            return;
        }
        // sort the queens
        int firstQueenX = x1 < x2 ? x1 : x2;
        int firstQueenY = firstQueenX == x1 ? y1 : y2;
        boolean isSwitched = firstQueenX == x2;
        int secondQueenX = x2;
        int secondQueenY  = y2;
        if (isSwitched) {
            secondQueenX = x1;
            secondQueenY = y1;
        }
        boolean normalDiagonal = secondQueenY > firstQueenY;
        if (normalDiagonal) {
            int toDecreaseX = firstQueenX - 1;
            int toDecreaseY = firstQueenY - 1;
            firstQueenX = 1;
            firstQueenY = 1;
            secondQueenX = secondQueenX - toDecreaseX;
            secondQueenY = secondQueenY - toDecreaseY;
            if (secondQueenX == secondQueenY) {
                System.out.println(yes);
            } else {
                System.out.println(no);
            }
        } else {
            // reverse diagonal from top right corner towards left bottom
            int toDecreaseX = firstQueenX - 1;
            int toDecreaseY = secondQueenY - 1;
            firstQueenX = 1;
            firstQueenY = firstQueenY - toDecreaseY;
            secondQueenX = secondQueenX - toDecreaseX;
            secondQueenY = secondQueenY - toDecreaseY;
            if (firstQueenX == secondQueenY && firstQueenY == secondQueenX) {
                System.out.println(yes);
            } else {
                System.out.println(no);
            }
        }
    }
}