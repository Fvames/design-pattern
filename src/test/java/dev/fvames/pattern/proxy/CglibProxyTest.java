package dev.fvames.pattern.proxy;

import dev.fvames.pattern.factory.proxy.CEOLeader;
import dev.fvames.pattern.factory.proxy.CglibProxy;
import dev.fvames.pattern.factory.proxy.ILeader;

public class CglibProxyTest {

    public static void main(String[] args) {
        CEOLeader ceo = new CEOLeader();
        ILeader leader = (ILeader) new CglibProxy().getInstance(CEOLeader.class);
        leader.sign("二爷");
    }
}
