package dev.fvames.pattern.proxy;

import dev.fvames.pattern.factory.proxy.CEOLeader;
import dev.fvames.pattern.factory.proxy.ILeader;
import dev.fvames.pattern.factory.proxy.JDKProxy;

public class JDKProxyTest {
    public static void main(String[] args) {

        CEOLeader ceoLeader = new CEOLeader();
        ILeader iLeader = (ILeader) new JDKProxy().getInstance(ceoLeader);
        iLeader.sign("鸣佐");
    }

}
