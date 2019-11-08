package com.yao.thread;

/**
 * @className CreateThread
 * @description: TODO
 * @author: yaoyao
 * @create: 2019/11/07 20:59
 */
public class CreateThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println("xxx:"+i);
        }
    }
}
