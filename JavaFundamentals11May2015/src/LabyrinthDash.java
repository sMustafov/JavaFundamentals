import java.util.Scanner;

public class LabyrinthDash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        char[][] map = new char[n][];

        for (int i = 0; i < n; i++) {
            map[i] = sc.nextLine().toCharArray();
        }

        char[] commands = sc.nextLine().toCharArray();

        int row = 0;
        int col = 0;
        int moves = 0;
        int lives = 3;

        for (int i = 0; i < commands.length; i++){

            int iRow = row;
            int iCol = col;

            switch (commands[i]) {
                case '>':
                    col++;
                    break;
                case '<':
                    col--;
                    break;
                case 'v':
                    row++;
                    break;
                case '^':
                    row--;
                    break;
            }

            if (cellIsOutsideLabyrinth(row, col, map)) {
                moves++;
                System.out.println("Fell off a cliff! Game Over!");
                break;
            } else if (cellIsWall(row, col, map)) {
                row = iRow;
                col = iCol;
                System.out.println("Bumped a wall.");
            } else if (cellIsObstacle(row, col, map)) {
                moves++;
                lives--;
                System.out.printf("Ouch! That hurt! Lives left: %d%n", lives);

                if (lives == 0) {
                    System.out.println("No lives left! Game Over!");
                    break;
                }
            } else if (cellIsLife(row, col, map)) {
                moves++;
                lives++;
                map[row][col] = '.';
                System.out.printf("Awesome! Lives left: %d%n", lives);
            } else {
                moves++;
                System.out.println("Made a move!");
            }
        }

        System.out.printf("Total moves made: %d", moves);
    }
    private static boolean cellIsOutsideLabyrinth(int row, int col, char[][] labyrinth) {
        if (row < 0 || row >= labyrinth.length) {
            return true;
        }

        if (col < 0 || col >= labyrinth[row].length) {
            return true;
        }

        return labyrinth[row][col] == ' ';
    }

    private static boolean cellIsWall(int row, int col, char[][] labyrinth) {
        return labyrinth[row][col] == '|' || labyrinth[row][col] == '_';
    }

    private static boolean cellIsObstacle(int row, int col, char[][] labyrinth) {
        return labyrinth[row][col] == '@' || labyrinth[row][col] == '#' || labyrinth[row][col] == '*';
    }

    private static boolean cellIsLife(int row, int col, char[][] labyrinth) {
        return labyrinth[row][col] == '$';
    }
}
