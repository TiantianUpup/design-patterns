package com.h2t.study;

/**
 * 其他装饰类
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/09/24 15:37
 */
public class OtherDecorator extends Decorator {
    /**
     * 构造函数
     *
     * @param resume
     */
    public OtherDecorator(Resume resume) {
        super(resume);
    }

    @Override
    public void selfIntroduce() {
        super.selfIntroduce();
        //添加其他信息，比如github、个人博客
        System.out.println("博客：https://juejin.im/user/5b8f8cc05188255c735f3f1d");
        System.out.println("github：https://github.com/TiantianUpup");
    }
}
