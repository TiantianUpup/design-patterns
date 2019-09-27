package com.h2t.study;

import java.io.Serializable;

/**
 * 基于synchronize加锁的懒汉式单例对象创建
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/09/25 17:36
 */
public class LazySynchronizeSingleton implements Serializable {
    /**
     * 是否已经调用过一次构造函数
     */
    private static boolean flag = false;

    private static LazySynchronizeSingleton lazySynchronizeSingleton = null;

    /**
     * 构造函数私有化
     */
    private LazySynchronizeSingleton() {
        //flag为线程间共享，进行加锁控制
        synchronized (LazySynchronizeSingleton.class) {
            if (flag == false) {
                flag = !flag;
            } else {
                throw new RuntimeException("单例模式被攻击");
            }
        }
    }

    public synchronized static LazySynchronizeSingleton getLazySynchronizeSingleton() {
        if (lazySynchronizeSingleton == null) {
            lazySynchronizeSingleton = new LazySynchronizeSingleton();
        }

        return lazySynchronizeSingleton;
    }

    private Object readResolve() {
        return lazySynchronizeSingleton;
    }
}
