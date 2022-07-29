package singleTon.breakSingleTone;

import java.lang.reflect.Constructor;

/**
 * @author chennanjiang
 * @title reflectBreak
 * @date 2022/7/27 17:58
 * @description 反射破坏单例
 *   由于通过反射可以访问到我们设置为私有的构造方法，所以用户就可以通过构造方法创建多个不同的对象
 */
public class ReflexBreak {
    public static void main(String[] args) throws Exception{
        //获取单例对象的字节码文件
        Class tonClass=SingleTon.class;
        //获取无参构造方法对象
        Constructor constructor= tonClass.getDeclaredConstructor();
        //取消访问检查
        constructor.setAccessible(true);
        //创建对象
        SingleTon singleTon1=(SingleTon) constructor.newInstance();
        SingleTon singleTon2=(SingleTon) constructor.newInstance();
        System.out.println(singleTon1==singleTon2);

    }

}
