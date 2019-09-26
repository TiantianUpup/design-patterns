package com.h2t.study;

import org.apache.commons.lang3.SerializationUtils;

/**
 * 反序列化攻击测试
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/09/26 19:58
 */
public class SerializableAttackTest {
    public static void main(String[] args) {
        //懒汉式
        HungrySingleton hungrySingleton = HungrySingleton.getHungrySingleton();
        //序列化
        byte[] serialize = SerializationUtils.serialize(hungrySingleton);
        //反序列化
        HungrySingleton hungrySingleton1 = SerializationUtils.deserialize(serialize);
        System.out.println(hungrySingleton == hungrySingleton1);

        //双重锁
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getLazyDoubleCheckSingleton();
        byte[] serialize1 = SerializationUtils.serialize(lazyDoubleCheckSingleton);
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton11 = SerializationUtils.deserialize(serialize1);
        System.out.println(lazyDoubleCheckSingleton == lazyDoubleCheckSingleton11);

        //lock
        LazyLockSingleton lazyLockSingleton = LazyLockSingleton.getLazyLockSingleton();
        byte[] serialize2 = SerializationUtils.serialize(lazyLockSingleton);
        LazyLockSingleton lazyLockSingleton1 = SerializationUtils.deserialize(serialize2);
        System.out.println(lazyLockSingleton == lazyLockSingleton1);

        //synchronie
        LazySynchronizeSingleton lazySynchronizeSingleton = LazySynchronizeSingleton.getLazySynchronizeSingleton();
        byte[] serialize3 = SerializationUtils.serialize(lazySynchronizeSingleton);
        LazySynchronizeSingleton lazySynchronizeSingleton1 = SerializationUtils.deserialize(serialize3);
        System.out.println(lazySynchronizeSingleton == lazySynchronizeSingleton1);

        //静态内部类
        LazyStaticSingleton lazyStaticSingleton = LazyStaticSingleton.getLazyStaticSingleton();
        byte[] serialize4 = SerializationUtils.serialize(lazyStaticSingleton);
        LazyStaticSingleton lazyStaticSingleton1 = SerializationUtils.deserialize(serialize4);
        System.out.println(lazyStaticSingleton == lazyStaticSingleton1);

    }
}
