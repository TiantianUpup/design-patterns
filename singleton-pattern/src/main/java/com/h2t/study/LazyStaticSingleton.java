package com.h2t.study;

import java.io.Serializable;

/**
 * 基于静态内部类的懒汉式单例对象创建
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/09/25 17:46
 */
public class LazyStaticSingleton implements Serializable {
    /**
     * 构造函数私有化
     */
    private LazyStaticSingleton() {
    }

    public static LazyStaticSingleton getLazyStaticSingleton() {
        return LazyStaticSingletonHolder.lazyStaticSingleton;
    }

    /**
     * 静态内部类
     */
    private static class LazyStaticSingletonHolder {
        private static LazyStaticSingleton lazyStaticSingleton = new LazyStaticSingleton();
    }

    private Object readResolve() {
        return LazyStaticSingletonHolder.lazyStaticSingleton;
    }
}
