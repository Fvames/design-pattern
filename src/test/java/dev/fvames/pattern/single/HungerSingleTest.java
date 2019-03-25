package dev.fvames.pattern.single;


public class HungerSingleTest {

    public static void main(String[] args) {

        HungerSingle singleClass1 = HungerSingle.getSingle();
        HungerSingle singleClass2 = HungerSingle.getSingle();

        System.out.println(singleClass1);
        System.out.println(singleClass2);

    }
}
