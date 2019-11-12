package com.h2t.study;

import org.apache.commons.lang3.SerializationUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 饿汉式创建对象序列化攻击、反射攻击测试
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/11/12 13:41
 */
public class HungrySingletonTest {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        HungrySingleton hungrySingleton = HungrySingleton.getHungrySingleton();
        //序列化攻击
        byte[] serialize = SerializationUtils.serialize(hungrySingleton);
        HungrySingleton hungrySingleton1 = SerializationUtils.deserialize(serialize);
        System.out.println(hungrySingleton == hungrySingleton1);

        //反射攻击
        Constructor<HungrySingleton> hungrySingletonConstructor = HungrySingleton.class.getDeclaredConstructor();
        hungrySingletonConstructor.setAccessible(true);
        HungrySingleton hungrySingleton2 = hungrySingletonConstructor.newInstance();
        System.out.println(hungrySingleton == hungrySingleton2);
    }
}
