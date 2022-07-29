package singleTon.breakSingleTone;

import java.io.Serializable;

/**
 * @author chennanjiang
 * @title singleTon
 * @date 2022/7/27 18:05
 * @description 一个静态内部类的单例
 */
public class SingleTon implements Serializable {
    private SingleTon(){};
    private static class singleTonHolder{
        //内部类初始化实例对象
        private static final SingleTon INSTANCE=new SingleTon();
    }

    public static SingleTon getInstance(){
        //返回静态内部类的实例对象
        return  SingleTon.singleTonHolder.INSTANCE;
    }
}
