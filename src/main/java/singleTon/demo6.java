package singleTon;

import com.sun.jdi.PathSearchingVirtualMachine;

/**
 * @author chennanjiang
 * @title demo6
 * @date 2022/7/27 11:47
 * @description 最完美单例 枚举单例
 *  可以解决线程同步问题，还可以防止反序列化
 *  枚举类没有构造方法，无法通过反射获取到对象，只能获取到单例的同一个对象demo6
 * 实现关键词： 枚举类特性
 */
public enum demo6 {
    INSTANCE;
    public static void main(String[] args) {
        for (int i=0;i<=100;i++){
            new Thread(()->{
                System.out.println(demo6.INSTANCE.hashCode());
            }).start();
        }
    }
}
