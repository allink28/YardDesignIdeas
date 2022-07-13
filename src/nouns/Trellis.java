package nouns;

import attributes.Sturdy;

public class Trellis extends Noun implements Sturdy {

    public Trellis() {
        attributes.addAll(Sturdy.STURDY_ATTRIBUTES);
    }
}
