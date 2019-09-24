package com.h2t.study;

/**
 * 基本实现类
 *
 * @author hetiantian
 * @version 1.0
 * @Date 2019/09/24 14:54
 */
public class MyResume implements Resume {
    @Override
    public void selfIntroduce() {
        System.out.println("姓名: 何甜甜");
        System.out.println("求职方向：服务端开发");
    }
}
