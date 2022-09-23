package concurrency.discuss.dataConformity.synchroized;

/**
 * @author chennanjiang
 * @title Demo3
 * @date 2022/9/23 12:57
 * @description synchronized作用于代码块 锁住代码块中配置的对象
 */
public class Demo3 {
    String lockA="lockA";

    public static void main(String[] args) {
        Demo3 demo3a=new Demo3();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo3a.blockMethod();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }

    public void blockMethod(){
        try {
            synchronized (lockA){
                for(int i=1;i<4;i++){
                    System.out.println("blockMethod执行: "+i);
                    Thread.sleep(3000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void blockMethod2(){
        try {
            synchronized (lockA){
                for(int i=1;i<4;i++){
                    System.out.println("blockMethod2执行: "+i);
                    Thread.sleep(3000);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
