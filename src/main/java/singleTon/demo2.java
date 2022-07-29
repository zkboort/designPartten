package singleTon;

/**
 * @author chengnanjiang
 * @title demo2
 * @date 2022/7/27 10:34
 * @description 懒汉式加载 单例模式
 */
public class demo2 {
    private demo2(){};


    //先不进行实例化
    private static demo2 INSTANCE;

    /**
     * @description:  新增多线程访问问题
     * 当多个线程同时进入此方法时，会同时执行多次构造方法创建多个不同的对象，导致单例被破坏失去意义
     */
    private static demo2 getInstance(){
        if(INSTANCE==null){
             // 增加线程执行停顿时间，增大多个线程进入概率
             // try {
             //    Thread.sleep(10);
             // } catch (InterruptedException e) {
             //    throw new RuntimeException(e);
             // }
            INSTANCE=new demo2();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i=0;i<=100;i++){
            new Thread(()->{
                //获取对象的hash码，如果有不同则表示出现了不同的对象实例
                System.out.println(demo2.getInstance().hashCode());
            }).start();
        }
    }
}
