package concurrency.discuss.dataConformity.synchroized;

/**
 * @author chennanjiang
 * @title Demo01
 * @date 2022/9/23 11:26
 * @description 基本使用1 锁住普通同步方法时 synchronized使用的当前类的实例对象为锁
 */
public class Demo01 {
    //程序的主线程
    public static void main(String[] args) {
        //final关键字使得我们的实例demo01的地址指向不能改变，即不能指向其他引用
        final Demo01 demo01=new Demo01();

        //新建线程
        new Thread(new Runnable(){
            @Override
            public void run() {
                //执行方法1
                demo01.generalMethod1();
            }
        }).start();

        new Thread(new Runnable(){
            @Override
            public void run() {
                //执行方法2
                demo01.generalMethod2();
            }
        }).start();
    }

    //其他线程,普通方法被synchronized修饰，使得程序方法不再并发执行而是同步执行
    public synchronized void generalMethod1(){
        try {
            for(int i=1;i<4;i++){
                System.out.println("Method1方法执行"+i+"time");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void generalMethod2(){
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
