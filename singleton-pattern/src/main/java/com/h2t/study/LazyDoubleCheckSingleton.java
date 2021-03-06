package com.h2t.study;

import java.io.Serializable;

/**
 * 基于双重锁检查的懒汉式创建单例对象
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/09/25 17:44
 */
public class LazyDoubleCheckSingleton implements Serializable {
    /**
     * 使用volatile进行修饰，禁止指令重排
     */
    private static volatile LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    /**
     * 构造函数私有化
     */
    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getLazyDoubleCheckSingleton() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }

        return lazyDoubleCheckSingleton;
    }

    private Object readResolve() {
        return lazyDoubleCheckSingleton;
    }
}
