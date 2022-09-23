package singleTon;

/**
 * @author chennanjiang
 * @title demo5
 * @date 2022/7/27 11:33
 * @description 完美单例1  静态内部类
 *   由于外部类在加载时是不会加载内部类的，只有在调用内部类时才会加载内部类；所以可以利用内部类实现懒加载
 *
 *   实现关键： 私有化 静态   内部类
 *
 *`
 */
public class demo5 {
    private demo5(){};
    private static class demo5Holder{
        //内部类初始化实例对象
        private static final demo5 INSTANCE=new demo5();
    }

    public static demo5 getInstance(){
        //返回静态内部类的实例对象
        return  demo5Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i=0;i<=100;i++){
            new Thread(()->{
                System.out.println(demo5.getInstance().hashCode());
            }).start();
        }
    }
}
