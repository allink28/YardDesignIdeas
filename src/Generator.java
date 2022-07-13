import nouns.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Generator {
    List<Noun> nouns = Arrays.asList(new Chicken(), new GreenHouse(), new Pond(), new FruitTree(), new Hedgerow(),
            new Trellis(), new CompostPile(), new Vine(), new Toolshed());

    public List<String> generateSentences(int sentenceLimit) {
        Random random = new Random();
        List<String> sentences = new ArrayList<>(sentenceLimit);
        for (int i = 0; i < sentenceLimit; ++i) {
            int r0 = random.nextInt(nouns.size());
            int r1 = random.nextInt(nouns.size());
            while (r0 == r1) {
                r1 = random.nextInt(nouns.size());
            }
            int r2 = random.nextInt(nouns.size());
            while (r0 == r2 || r1 == r2) {
                r2 = random.nextInt(nouns.size());
            }
            Noun noun0 = nouns.get(r0);
            Noun noun1 = nouns.get(r1);
            Noun noun2 = nouns.get(r2);
            sentences.add(noun0.getClass().getSimpleName() + " " + noun1.getAttributes().get(random.nextInt(noun1.getAttributes().size())) + " " +
                    noun1.getClass().getSimpleName() + " " + noun2.getAttributes().get(random.nextInt(noun2.getAttributes().size())) + " " +
                    noun2.getClass().getSimpleName());
        }
        return sentences;
    }
}
