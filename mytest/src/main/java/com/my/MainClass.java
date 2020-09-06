package com.my;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 源码阅读指南
 * https://zhuanlan.zhihu.com/p/81404427
 */
public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        MyBean bean = context.getBean(MyBean.class);
        bean.beanMethod();
    }
}
