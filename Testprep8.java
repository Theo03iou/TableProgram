import java.util.Scanner;

public class Testprep8 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        System.out.println("Enter the number of rows: \nMust be less than or equal to 10");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        System.out.println("Enter your first number: ");
        int firstNum = scanner.nextInt();

        System.out.println("Enter your second number: ");
        int secondNum = scanner.nextInt();

        if (rows <= 10) {
            printRows(rows, firstNum, secondNum);
        } else {
            start();
        }
    }

    private static void printRows(int rows, int firstNum, int secondNum) {
        String numString = "";

            for (int j = 1; j < ((rows * 10) + 1); j++) {
                String temp = Integer.toString(j);
                String blank = "** ";

                 if (j % 10 == 0) {
                    numString += "\n";
                 }
                if (j % firstNum == 0|| j % secondNum == 0) {
                    numString += blank;

                }  else {
                    numString += temp + " ";
                }
            }

        System.out.println(numString);
    }
}

