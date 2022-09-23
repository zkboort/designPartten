package concurrency.discuss.threadFeature;

import java.util.concurrent.CountDownLatch;

/**
 * @author chennanjiang
 * @title discuss01
 * @date 2022/8/13 1:30
 * @description 验证多线程代码执行的指令无序性，单线程也有无序性，指令重排
 */
public class discuss01 {
    private static int x=0,y=0;
    private static int a=0,b=0;

    public static void main(String[] args) throws InterruptedException {
        for (long i=0;i<Long.MAX_VALUE;i++){
            //每次循环开始都将变量重置为0
            x=0;
            y=0;
            a=0;
            b=0;
            //线程计数器
            CountDownLatch latch=new CountDownLatch(2);
            Thread one=new Thread(new Runnable() {
                @Override
                public void run() {
                    a=1;
                    x=b;
                    latch.countDown();
                }
            });
            Thread tow=new Thread(new Runnable() {
                @Override
                public void run() {
                    b=1;
                    y=a;
                    latch.countDown();
                }
            });

            one.start();
            tow.start();
            latch.await();
            String result="第"+i+"次"+"("+x+","+y+")";
            //只有两个线程内部的代码都出现代码顺序错乱才会有x=0且y=0的情况出现
            if(x==0&&y==0){
                System.out.println(result);
                break;
            }
        }
    }
}
