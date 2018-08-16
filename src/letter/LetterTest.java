package letter;

public class LetterTest {

    public static void main(String[] args) {
        Letter lt = new Letter("a", "b");
        lt.appendMessage("Hello World");
        lt.insertMessage("Hello", " this is my");
        System.out.println(lt);
    }
}
