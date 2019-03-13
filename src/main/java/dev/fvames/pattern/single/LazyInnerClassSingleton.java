package dev.fvames.pattern.single;

public class LazyInnerClassSingleton implements Runnable {

    public void run() {
        System.out.println("currentThreadName：" + Thread.currentThread().getName() + ", " + getInstance());
    }

    // 默认不加载内部类
    private static class LazyHolder{
        public static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

    // static 是为了单例空间共享
    // final 是为了避免被重写，重载
    static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

}
