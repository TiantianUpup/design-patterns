package com.h2t.study;

/**
 * 工作经历装饰类
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/09/24 15:31
 */
public class WorkExperienceDecorator extends Decorator {
    /**
     * 构造函数
     *
     * @param resume
     */
    public WorkExperienceDecorator(Resume resume) {
        super(resume);
    }

    @Override
    public void selfIntroduce() {
        super.selfIntroduce();
        //在装饰一下简历，添加工作奖励
    }

    public void addWorkExperience() {
        System.out.println("2018-2019：xxx公司打杂");
    }
}
