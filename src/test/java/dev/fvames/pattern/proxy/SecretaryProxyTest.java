package dev.fvames.pattern.proxy;

import dev.fvames.pattern.factory.proxy.CEOLeader;
import dev.fvames.pattern.factory.proxy.ILeader;
import dev.fvames.pattern.factory.proxy.SecretaryProxy;

public class SecretaryProxyTest {

    public static void main(String[] args) {
        CEOLeader ceo = new CEOLeader();
        ILeader leader = new SecretaryProxy(ceo);
        leader.sign("secretary");
    }
}
