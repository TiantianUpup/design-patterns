# 单例模式

### 单例模式模块内容介绍
- main目录
    - HungrySingleton => 基于饿汉式创建单例对象
    - LazySingleton => 线程不安全的懒汉式创建单例对象
    - LazySynchronizeSingleton => 基于synchronize加锁的懒汉式单例对象创建
    - LazyLockSingleton => 基于Lock加锁的懒汉式单例对象创建
    - LazyDoubleCheckSingleton => 基于双重锁检查的懒汉式创建单例对象
    - LazyStaticSingleton => 基于静态内部类的懒汉式单例对象创建
    - EnumSingleton => 基于枚举的单例创建对象
- test目录
    - ReflectAttackTest => 反射攻击测试
    - SerializableAttackTest => 反序列化攻击测试
 

附：[相关文章](https://juejin.im/post/5d8cc45ae51d4577ef53de12)