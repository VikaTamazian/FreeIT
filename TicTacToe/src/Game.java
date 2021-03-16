import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) throws InterruptedException {
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_RESET = "\u001B[0m";
        String cross = "\u001B[31m" + "Х" + ANSI_RESET;
        String zero = "\u001B[33m" + "O" + ANSI_RESET;
        Random computer = new Random();
        int computerChoice = computer.nextInt(9) + 1;

        int userChoice = 0;
        int emptyField = 9;
        int i;
        int j;
        String[][] field = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
        for (i = 0; i < field.length; i++) {
            for (j = 0; j < field.length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }

        while (true) {

            System.out.println(ANSI_CYAN + "Choose number of field: " + ANSI_RESET);
            Scanner scanner = new Scanner(System.in);
            try {
                userChoice = scanner.nextInt();
                if (!(userChoice > 0 && userChoice < 10)) {
                    System.out.println("Oops! Please, enter correct number: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect number");
                e.printStackTrace();
            }

            switch (userChoice) {

                case 1:
                    if (!(field[0][0].equals(cross)) && !(field[0][0].equals(zero))) {
                        field[0][0] = cross;
                        break;
                    }
                case 2:
                    if (!(field[0][1].equals(cross)) && !(field[0][1].equals(zero))) {
                        field[0][1] = cross;
                        break;
                    }

                case 3:
                    if (!(field[0][2].equals(cross)) && !(field[0][2].equals(zero))) {
                        field[0][2] = cross;
                        break;
                    }

                case 4:
                    if (!(field[1][0].equals(cross)) && !(field[1][0].equals(zero))) {
                        field[1][0] = cross;
                        break;
                    }

                case 5:
                    if (!(field[1][1].equals(cross)) && !(field[1][1].equals(zero))) {
                        field[1][1] = cross;
                        break;
                    }

                case 6:
                    if (!(field[1][2].equals(cross)) && !(field[1][2].equals(zero))) {
                        field[1][2] = cross;
                        break;
                    }

                case 7:
                    if (!(field[2][0].equals(cross)) && !(field[2][0].equals(zero))) {
                        field[2][0] = cross;
                        break;
                    }

                case 8:
                    if (!(field[2][1].equals(cross)) && !(field[2][1].equals(zero))) {
                        field[2][1] = cross;
                        break;
                    }

                case 9:
                    if (!(field[2][2].equals(cross)) && !(field[2][2].equals(zero))) {
                        field[2][2] = cross;
                        break;
                    }
            }
            System.out.println(ANSI_CYAN + "Your choice: " + ANSI_RESET);
            Thread.sleep(1000);
            for (i = 0; i < field.length; i++) {
                for (j = 0; j < field.length; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }
            emptyField--;

            if ((field[0][0].equals(field[0][1])) && (field[0][0].equals(field[0][2]) && (field[0][0].equals(cross)))
                    || (field[1][0].equals(field[1][1])) && (field[1][0].equals(field[1][2])) && (field[1][0].equals(cross))
                    || (field[2][0].equals(field[2][1])) && (field[2][0].equals(field[2][2])) && (field[2][0].equals(cross))
                    || (field[0][0].equals(field[1][0])) && (field[0][0].equals(field[2][0])) && (field[0][0].equals(cross))
                    || (field[0][1].equals(field[1][1])) && (field[0][1].equals(field[2][1])) && (field[0][1].equals(cross))
                    || (field[0][2].equals(field[1][2])) && (field[0][2].equals(field[2][2])) && (field[0][2].equals(cross))
                    || (field[0][0].equals(field[1][1])) && (field[0][0].equals(field[2][2])) && (field[0][0].equals(cross))
                    || (field[0][2].equals(field[1][1])) && (field[0][2].equals(field[2][0])) && (field[0][2].equals(cross))) {
                System.out.println(ANSI_CYAN + "You're the winner!" + ANSI_RESET);
                break;

            } else if ((field[0][0].equals(field[0][1])) && (field[0][0].equals(field[0][2]) && (field[0][0].equals(zero)))
                    || (field[1][0].equals(field[1][1])) && (field[1][0].equals(field[1][2])) && (field[1][0].equals(zero))
                    || (field[2][0].equals(field[2][1])) && (field[2][0].equals(field[2][2])) && (field[2][0].equals(zero))
                    || (field[0][0].equals(field[1][0])) && (field[0][0].equals(field[2][0])) && (field[0][0].equals(zero))
                    || (field[0][1].equals(field[1][1])) && (field[0][1].equals(field[2][1])) && (field[0][1].equals(zero))
                    || (field[0][2].equals(field[1][2])) && (field[0][2].equals(field[2][2])) && (field[0][2].equals(zero))
                    || (field[0][0].equals(field[1][1])) && (field[0][0].equals(field[2][2])) && (field[0][0].equals(zero))
                    || (field[0][2].equals(field[1][1])) && (field[0][2].equals(field[2][0])) && (field[0][2].equals(zero))) {
                System.out.println(ANSI_CYAN + "You lose." + ANSI_RESET);
                break;

            } else if (emptyField == 0) {
                System.out.println(ANSI_CYAN + "No empty fields left." + ANSI_RESET);
                break;
            }

            while (true) {
                int firstNumber = computer.nextInt(3);
                int secondNumber = computer.nextInt(3);

                if (!(field[firstNumber][secondNumber].equals(cross)) && !(field[firstNumber][secondNumber].equals(zero))) {
                    field[firstNumber][secondNumber] = zero;
                    break;
                }
            }
            System.out.println(ANSI_CYAN + "Computer's choice: " + ANSI_RESET);
            Thread.sleep(3000);
            for (i = 0; i < field.length; i++) {
                for (j = 0; j < field.length; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }
            emptyField--;

            if ((field[0][0].equals(field[0][1])) && (field[0][0].equals(field[0][2]) && (field[0][0].equals(cross)))
                    || (field[1][0].equals(field[1][1])) && (field[1][0].equals(field[1][2])) && (field[1][0].equals(cross))
                    || (field[2][0].equals(field[2][1])) && (field[2][0].equals(field[2][2])) && (field[2][0].equals(cross))
                    || (field[0][0].equals(field[1][0])) && (field[0][0].equals(field[2][0])) && (field[0][0].equals(cross))
                    || (field[0][1].equals(field[1][1])) && (field[0][1].equals(field[2][1])) && (field[0][1].equals(cross))
                    || (field[0][2].equals(field[1][2])) && (field[0][2].equals(field[2][2])) && (field[0][2].equals(cross))
                    || (field[0][0].equals(field[1][1])) && (field[0][0].equals(field[2][2])) && (field[0][0].equals(cross))
                    || (field[0][2].equals(field[1][1])) && (field[0][2].equals(field[2][0])) && (field[0][2].equals(cross))) {
                System.out.println("You're the winner!");
                break;

            } else if ((field[0][0].equals(field[0][1])) && (field[0][0].equals(field[0][2]) && (field[0][0].equals(zero)))
                    || (field[1][0].equals(field[1][1])) && (field[1][0].equals(field[1][2])) && (field[1][0].equals(zero))
                    || (field[2][0].equals(field[2][1])) && (field[2][0].equals(field[2][2])) && (field[2][0].equals(zero))
                    || (field[0][0].equals(field[1][0])) && (field[0][0].equals(field[2][0])) && (field[0][0].equals(zero))
                    || (field[0][1].equals(field[1][1])) && (field[0][1].equals(field[2][1])) && (field[0][1].equals(zero))
                    || (field[0][2].equals(field[1][2])) && (field[0][2].equals(field[2][2])) && (field[0][2].equals(zero))
                    || (field[0][0].equals(field[1][1])) && (field[0][0].equals(field[2][2])) && (field[0][0].equals(zero))
                    || (field[0][2].equals(field[1][1])) && (field[0][2].equals(field[2][0])) && (field[0][2].equals(zero))) {
                System.out.println("You lose.");
                break;

            } else if (emptyField == 0) {
                System.out.println("No empty fields left.");
                break;
            }
        }
    }
}