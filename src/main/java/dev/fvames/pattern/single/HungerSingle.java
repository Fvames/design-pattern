package dev.fvames.pattern.single;


public class HungerSingle {

    private final static HungerSingle single = new HungerSingle();

    private HungerSingle() {
    }

    public final static HungerSingle getSingle() {
        return single;
    }

}
