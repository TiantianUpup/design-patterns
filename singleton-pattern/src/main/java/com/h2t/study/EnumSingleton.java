package com.h2t.study;

/**
 * 基于枚举的单例创建对象
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/09/25 21:03
 */
public enum EnumSingleton {
    INSTANCE;

    public static EnumSingleton getEnumSingleton() {
        return INSTANCE;
    }
}
