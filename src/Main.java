import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    WordProcessor wordProcessor = new WordProcessor();
    String word = wordProcessor.getRandomWordFromFile();
    char[]maskedWord = wordProcessor.makeMaskedWord(word);

    UserInputReader userInputReader = new UserInputReader(new Scanner(System.in));
    UserInputProcessor userInputProcessor = new UserInputProcessor(word, maskedWord);

    GameLoop gameLoop = new GameLoop(word, maskedWord, userInputReader, userInputProcessor);
    gameLoop.startGame();

    }
}
