package nouns;

import attributes.Sturdy;

public class GreenHouse extends Noun implements Sturdy  {

    public GreenHouse() {
        attributes.addAll(Sturdy.STURDY_ATTRIBUTES);
    }
}
