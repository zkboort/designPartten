package singleTon;

/**
 * @author chennanjiang       通常开发单例由框架去保证：如spring框架等
 * @title demo01
 * @date 2022/7/27 10:05
 * @description：  饿汉式 单例模式
 *     单例的意思是：无论对象创建多少次，内存当中都只会有一个实例被创建引用
 *
 *     实现关键词： 私有    静态
 *
 *     使用静态关键词的弊端是，static使得只要代码加载到jvm内存就会完成初始化
 */
public class demo1 {
    //私有化构造方法
    private demo1(){};

    //添加静态的私有变量 存放构造的对象实例，由于是静态所以一到内存就会执行实例化，并为变量进行初始化
    private static  final demo1 INSTANCE=new demo1();

    //增加对外公开的 获取对象实例的静态方法
    public static demo1 getInstance(){
         return  INSTANCE;
    }


}
