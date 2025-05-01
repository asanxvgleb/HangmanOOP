public class GameLoop {
    private final UserInputProcessor inputProcessor;
    private final UserInputReader inputReader;
    private int attempts = 6;

    public GameLoop(UserInputReader inputReader, UserInputProcessor inputProcessor) {
        this.inputReader = inputReader;
        this.inputProcessor = inputProcessor;
    }

    public void startGame() {
        while (attempts > 0) {
            System.out.print("Enter a letter: ");
            char userChar = inputReader.readUserInput();

            boolean correct = inputProcessor.checkUserInput(userChar);
            if (!correct) {
                attempts--;
                System.out.println("Wrong! Attempts left: " + attempts);
            }

            inputProcessor.showMaskedWord();

            if (inputProcessor.isWordGuessed()) {
                System.out.println("You won! Word: " + inputProcessor.displayWord());
                break;
            }
        }
        if (attempts == 0) {
            System.out.println("You lost. The word was: " + inputProcessor.displayWord());
        }
    }

}
