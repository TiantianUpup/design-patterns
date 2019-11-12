package com.h2t.study;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射攻击测试
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/09/26 19:00
 */
public class ReflectAttackTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //静态内部类【存在反射攻击】
        LazyStaticSingleton lazyStaticSingleton = LazyStaticSingleton.getLazyStaticSingleton();
        //通过反射创建LazyStaticSingleton
        Constructor<LazyStaticSingleton> constructor = LazyStaticSingleton.class.getDeclaredConstructor();
        //调用setAccessible(true)调用私有的构造函数
        constructor.setAccessible(true);
        LazyStaticSingleton lazyStaticSingleton1 = constructor.newInstance();
        //打印结果为false，说明又创建了一个新对象
        System.out.println(lazyStaticSingleton == lazyStaticSingleton1);

        //synchronize【存在反射攻击】
        LazySynchronizeSingleton lazySynchronizeSingleton = LazySynchronizeSingleton.getLazySynchronizeSingleton();
        Constructor<LazySynchronizeSingleton> lazySynchronizeSingletonConstructor = LazySynchronizeSingleton.class.getDeclaredConstructor();
        lazySynchronizeSingletonConstructor.setAccessible(true);
        LazySynchronizeSingleton lazySynchronizeSingleton1 = lazySynchronizeSingletonConstructor.newInstance();
        System.out.println(lazySynchronizeSingleton == lazySynchronizeSingleton1);

        //lock【存在反射攻击】
        LazyLockSingleton lazyLockSingleton = LazyLockSingleton.getLazyLockSingleton();
        Constructor<LazyLockSingleton> lazyLockSingletonConstructor = LazyLockSingleton.class.getDeclaredConstructor();
        lazyLockSingletonConstructor.setAccessible(true);
        LazyLockSingleton lazyLockSingleton1 = lazyLockSingletonConstructor.newInstance();
        System.out.println(lazyLockSingleton == lazyLockSingleton1);

        //双重锁检查【存在反射攻击】
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getLazyDoubleCheckSingleton();
        Constructor<LazyDoubleCheckSingleton> lazyDoubleCheckSingletonConstructor = LazyDoubleCheckSingleton.class.getDeclaredConstructor();
        lazyDoubleCheckSingletonConstructor.setAccessible(true);
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton1 = lazyDoubleCheckSingletonConstructor.newInstance();
        System.out.println(lazyDoubleCheckSingleton == lazyDoubleCheckSingleton1);
    }
}
