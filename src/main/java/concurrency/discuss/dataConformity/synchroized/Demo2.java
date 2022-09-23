package concurrency.discuss.dataConformity.synchroized;

/**
 * @author chennanjiang
 * @title Demo2
 * @date 2022/9/23 12:09
 * @description synchronized作用于静态同步方法  使用当前类的Class对象为锁,会把类的全局锁住；使得同步执行
 */
public class Demo2 {
    public static void main(String[] args) {
        final Demo2 demo2a=new Demo2();
        final Demo2 demo2b=new Demo2();

        //两个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo2a.generalMethod1();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                demo2b.generalMethod2();
            }
        }).start();
    }

    public static synchronized void generalMethod1(){
        try {
            for(int i=1;i<4;i++){
                System.out.println("Method1方法执行"+i+"time");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static synchronized void generalMethod2(){
        try {
            for(int i=1;i<4;i++){
                System.out.println("Method2方法执行"+i+"time");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
