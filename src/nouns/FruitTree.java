package nouns;

import attributes.Sturdy;

public class FruitTree extends Noun implements Sturdy {

    public FruitTree() {
        attributes.addAll(Sturdy.STURDY_ATTRIBUTES);
    }
}
