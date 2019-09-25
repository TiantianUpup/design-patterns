package com.h2t.study;

/**
 * 装饰器类
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/09/24 15:27
 */
public abstract class Decorator implements Resume {
    /**
     * 接口
     */
    private Resume resume;

    /**
     * 构造函数
     */
    public Decorator(Resume resume) {
        this.resume = resume;
    }

    @Override
    public void selfIntroduce() {
        //调用传入Resume实现类的方法
        resume.selfIntroduce();
    }
}
