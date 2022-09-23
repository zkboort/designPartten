package concurrency.discuss.threadFeature;

/**
 * @author chennanjiang
 * @title discuss02
 * @date 2022/8/13 18:37
 * @description ready这个资源对于另一个线程是可见的吗？
 *
 */
public class discuss02 {
    private static boolean ready=false;
    private static int number;
    //我们使用静态内部类起一个线程，这个线程的runnable任务是 当ready标志是TRUE时让当前线程让步放开线程资源，并打印出number
    private static class ReaderThread extends Thread{
        @Override
        public void run() {
            while (ready){
                Thread.yield();
            }
            System.out.println(number);
        }
    }
    public static void main(String[] args) throws Exception{
         Thread t=new ReaderThread();
         t.start();
         //子线程开启，但并不一定立马进入运行状态，我们在主线程对外部类的成员进行初始化
         number=42;
         ready=true;
         //子进程对象调用join方法，插入主线程之前执行
         t.join();
    }
}
