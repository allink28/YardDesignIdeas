package nouns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Noun {
    public List<String> attributes = new ArrayList<>(Arrays.asList("around", "facing", "between", "beside", "into", "before", "evolving into",
            "away from", "after", "and", "over", "on", "crossing", "under", "instead of", "near", "dispersed throughout",
            "north of", "south of", "east of", "west of"));

    public List<String> getAttributes() {
        return attributes;
    }
}
