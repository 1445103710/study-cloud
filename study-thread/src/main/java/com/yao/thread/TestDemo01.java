package com.yao.thread;

/**
 * @className TestDemo01
 * @description: TODO
 * @author: yaoyao
 * @create: 2019/11/07 20:59
 */
public class TestDemo01 {

    public static void main(String[] args) {
        CreateThread createThread = new CreateThread();
        createThread.start();
        System.out.println("结束");
    }
}
