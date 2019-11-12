package com.h2t.study;

import org.apache.commons.lang3.SerializationUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 枚举创建单例对象攻击测试
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/09/27 10:18
 */
public class EnumAttackTest {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        EnumSingleton enumSingleton = EnumSingleton.getEnumSingleton();
        //序列化攻击
        byte[] serialize4 = SerializationUtils.serialize(enumSingleton);
        EnumSingleton enumSingleton2 = SerializationUtils.deserialize(serialize4);
        System.out.println(enumSingleton == enumSingleton2);

        //反射攻击
        Constructor<EnumSingleton> enumSingletonConstructor = EnumSingleton.class.getDeclaredConstructor();
        enumSingletonConstructor.setAccessible(true);
        EnumSingleton enumSingleton1 = enumSingletonConstructor.newInstance();
        System.out.println(enumSingleton == enumSingleton1);
    }
}
