package com.h2t.study;

/**
 * 测试类
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/09/24 15:46
 */
public class Test {
    public static void main(String[] args) {
        Resume resume = new MyResume();
        //1.添加工作经历
        resume = new WorkExperienceDecorator(resume);
        //2.添加github、博客
        resume = new OtherDecorator(resume);

        //hr读简历
        HrReader hrReader = new HrReader();
        hrReader.read(resume);
    }
}
