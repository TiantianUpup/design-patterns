package com.h2t.study;

import java.io.Serializable;

/**
 * 基于饿汉式创建单例对象
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/09/25 16:22
 */
public class HungrySingleton implements Serializable {
    /**
     * static修饰，在类加载时只初始化一次
     */
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    /**
     * 私有构造函数，不能被外部所访问
     */
    private HungrySingleton() {
    }

    /**
     * 返回单例对象
     */
    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }

    private Object readResolve() {
        return hungrySingleton;
    }
}
