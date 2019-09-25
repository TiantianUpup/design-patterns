package com.h2t.study;

/**
 * 线程不安全的懒汉式创建单例对象
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/09/25 17:22
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    /**
     * 构造函数私有化
     */
    private LazySingleton() {
    }

    private static LazySingleton getLazySingleton() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }

        return lazySingleton;
    }
}
