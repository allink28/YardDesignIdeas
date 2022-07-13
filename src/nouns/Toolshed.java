package nouns;

import attributes.Sturdy;

public class Toolshed extends Noun implements Sturdy {

    public Toolshed() {
        attributes.addAll(STURDY_ATTRIBUTES);
    }
}
