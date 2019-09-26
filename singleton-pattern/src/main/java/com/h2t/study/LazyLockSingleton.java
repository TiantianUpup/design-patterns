package com.h2t.study;

import java.io.Serializable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 基于Lock加锁的懒汉式单例对象创建
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/09/25 17:36
 */
public class LazyLockSingleton implements Serializable {
    private static LazyLockSingleton lazyLockSingleton = null;

    /**
     * 锁
     **/
    private static Lock lock = new ReentrantLock();

    /**
     * 构造函数私有化
     */
    private LazyLockSingleton() {
    }

    public static LazyLockSingleton getLazyLockSingleton() {
        try {
            lock.lock();
            if (lazyLockSingleton == null) {
                lazyLockSingleton = new LazyLockSingleton();
            }
        } finally {
            lock.unlock();
        }

        return lazyLockSingleton;
    }
}
