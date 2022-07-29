package singleTon.breakSingleTone;

/**
 * @author chennanjiang
 * @title SingleTone2
 * @date 2022/7/27 18:57
 * @description 解决反序列化和反射破坏单例的方法
 */
public class SingleTon2 {
    /**
     * @description:  防止反射破坏单例的方法
     */
    private static boolean flag=false;

    private SingleTon2(){
        synchronized (SingleTon2.class){
            //判断flag是否TRUE，是则说明不是第一次创建对象，直接抛出异常，false则可以直接正常创建
            if(flag){
                throw new RuntimeException("不可再创建新的对象");
            }
            flag=true;
        }
    };

    private static class singleTonHolder{
        //内部类初始化实例对象
        private static final SingleTon2 INSTANCE=new SingleTon2();
    }

    public static SingleTon2 getInstance(){
        //返回静态内部类的实例对象
        return  SingleTon2.singleTonHolder.INSTANCE;
    }

    //解决反序列化破坏单例,进行反序列化时，FileInputStream的readObjet()会自动调用该方法，将该方法的返回值直接返回
    public Object readResolve(){
        return singleTonHolder.INSTANCE;
    }
}
