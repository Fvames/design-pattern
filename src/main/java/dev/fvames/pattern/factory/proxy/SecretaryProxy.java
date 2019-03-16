package dev.fvames.pattern.factory.proxy;

public class SecretaryProxy implements ILeader {

    private ILeader leader;

    public SecretaryProxy(ILeader leader) {
        this.leader = leader;
    }

    public void sign(String name) {
        System.out.println("secretary before");
        leader.sign(name);
        System.out.println("secretary after");
    }
}
