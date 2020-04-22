package com.gdpph.o1kuaixue.demo.chapter15.section2.section2;

/**
 * throws定义方法异常
 *
 * @author 零壹学堂
 */
public class ThrowsDemo {
    public static void main(String[] args) {
        test();
    }
    public static void test() throws Exception {
        throw new IllegalArgumentException("方法内抛出异常");
    }
}
