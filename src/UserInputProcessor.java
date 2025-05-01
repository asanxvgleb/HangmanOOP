public class UserInputProcessor {
    private final String word;
    private final char[] maskedWord;

    public UserInputProcessor(String word, char[]maskedWord) {
     this.word = word;
     this.maskedWord = maskedWord;
    }

    public boolean checkUserInput(char userInput){
        for(int i = 0; i<word.length();i++){
            if(word.charAt(i) == userInput){
                maskedWord[i] = userInput;
                System.out.println(userInput + " is in word");
                return true;
            }
        }
        return false;
    }

    public void showMaskedWord(){
            System.out.println(maskedWord);
            System.out.println("-------------");
        }

    public boolean isWordGuessed(){
        return word.equals(new String(maskedWord));
    }

}
