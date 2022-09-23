package concurrency.discuss.dataConformity.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author chennanjiang
 * @title Demo2
 * @date 2022/9/23 15:15
 * @description 中断响应测试
 */
public class Demo2 {
    public ReentrantLock lock1=new ReentrantLock();
    public ReentrantLock lock2=new ReentrantLock();

    public static void main(String[] args) {
        long time=System.currentTimeMillis();
        Demo2 demo2=new Demo2();
        Thread thread1=demo2.lock1();
        Thread thread2=demo2.lock2();

        //等待时间长就中断操作
        while (true){
            if(System.currentTimeMillis()-time>3000){
                thread2.interrupt();//线程2中断线程，取消对lock1的申请并释放已经拿到的lock2
            }
        }
    }

    //新建两个线程，创造死锁
    public Thread lock1(){
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock1.lockInterruptibly();//判断是否被中断，获取锁lock1
                    Thread.sleep(500);//模拟业务处理
                    lock2.lockInterruptibly();//占用lock2

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    if(lock1.isHeldByCurrentThread()){
                        lock1.unlock();
                    }
                    if (lock2.isHeldByCurrentThread()){
                        lock2.unlock();
                    }
                    System.out.println(Thread.currentThread().getName()+"，退出");
                }
            }
        });
        t1.start();
        return t1;
    }
    public Thread lock2(){
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock2.lockInterruptibly();//占用lock2
                    Thread.sleep(500);//模拟业务处理
                    lock1.lockInterruptibly();//占用lock1


                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    if(lock1.isHeldByCurrentThread()){
                        lock1.unlock();
                    }
                    if (lock2.isHeldByCurrentThread()){
                        lock2.unlock();
                    }
                    System.out.println(Thread.currentThread().getName()+"，退出");
                }
            }
        });
        t2.start();
        return t2;
    }
}
