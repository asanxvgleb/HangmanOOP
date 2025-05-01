import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WordProcessor {

    public String getRandomWordFromFile() {
        String word;
        try {
            List<String> words = Files.readAllLines(Path.of("words.txt"))
                    .stream()
                    .map(String::trim)
                    .filter(el -> !el.isEmpty())
                    .toList();
            Random random = new Random();
            word = words.get(random.nextInt(words.size()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return word;
    }

    public char[] makeMaskedWord(String word) {
        char[] maskedWord = word.toCharArray();
        Arrays.fill(maskedWord, '*');
        return maskedWord;
    }
}
