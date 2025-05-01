import java.util.Scanner;

public class UserInputReader {
    private final Scanner scanner;

    public UserInputReader(Scanner scanner) {
        this.scanner = new Scanner(System.in);
    }

    public char readUserInput() {
        return scanner.next().toLowerCase().charAt(0);
    }

}
