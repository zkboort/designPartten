package singleTon;

/**
 * @author chennanjiang
 * @title demo4
 * @date 2022/7/27 11:13
 * @description 同步锁范围优化    单例模式
 * volatile关键字：jvm底层指令重排
 */
public class demo4 {
    private static volatile demo4 INSTANCE;
    private demo4(){};

    /**
     * @description:
     *   这里如果在判断和锁住之间有多个线程进入，那么当一个线程执行完后就会释放锁让下一个接着执行
     * 导致也会有多个不同对象被创建。所以需要在同步代码块内部再进行一次判断，形成双层判断,才能保证
     * 只有一个实例。
     */

    public static demo4 getInstance(){
        if(INSTANCE==null){
            synchronized (demo4.class){
                if(INSTANCE==null){
                    //增加线程执行睡眠时间，增大多个线程进入概率
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    INSTANCE=new demo4();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i=0;i<=100;i++){
            new Thread(()->{
                System.out.println(demo4.getInstance().hashCode());
            }).start();
        }
    }
}
