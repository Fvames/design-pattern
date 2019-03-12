package dev.fvames.pattern.single;

public class LazyInnerClassSingleton {

    // 默认不加载
    private static class LazyHolder{
        public static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

    // static 是为了单例空间共享
    // final 是为了避免被重写，重载
    static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

}
