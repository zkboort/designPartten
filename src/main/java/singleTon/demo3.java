package singleTon;

/**
 * @author chennanjiang
 * @title demo3
 * @date 2022/7/27 10:36
 * @description: 懒汉式加同步锁优化 单例模式
 */
public class demo3 {
    private static demo3 INSTANCE;
    private demo3(){};

    /**
     * @description: 将同步锁加在方法上，这个锁住的范围比较大，影响程效率
     */
    public static synchronized demo3 getInstance(){
        if(INSTANCE==null){
             //增加线程执行睡眠时间，增大多个线程进入概率
             try {
                Thread.sleep(10);
             } catch (InterruptedException e) {
                throw new RuntimeException(e);
             }
            INSTANCE=new demo3();
        }
        return INSTANCE;
    }


    public static void main(String[] args) {
        for (int i=0;i<=100;i++){
            new Thread(()->{
                //获取对象的hash码，如果有不同则表示出现了不同的对象实例
                System.out.println(demo3.getInstance().hashCode());
            }).start();
        }
    }
}
