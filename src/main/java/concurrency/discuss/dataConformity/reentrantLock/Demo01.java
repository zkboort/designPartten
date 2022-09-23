package concurrency.discuss.dataConformity.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author chennanjiang
 * @title Demo01
 * @date 2022/9/23 14:53
 * @description 可重入 使用
 */
public class Demo01 implements Runnable{
    public static ReentrantLock lock=new ReentrantLock();
    public static int i=0;

    @Override
    public void run() {
        for(int j=0;j<10;j++){
            //加锁,可重入锁，可以加多次锁
            //lock.lock();
            lock.lock();
            try {
                i++;
            } finally {
                //释放锁,加了多少次就释放多少次锁;
                //lock.unlock();
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) throws Exception{
        Demo01 demo01=new Demo01();
        Thread t1=new Thread(demo01);
        t1.start();
        t1.join();
        System.out.println(i);
    }
}
