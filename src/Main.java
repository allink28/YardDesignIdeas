import java.util.List;

public class Main {
    public static void main(String[] args) {
        Generator generator = new Generator();
        List<String> sentences = generator.generateSentences(10);
        System.out.println(String.join("\n", sentences));
    }
}
