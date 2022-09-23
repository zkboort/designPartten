package concurrency.discuss.threadFeature;

/**
 * @author chennanjiang
 * @title discuss03
 * @date 2022/8/13 19:03
 * @description 构造方法里启动线程的弊端
 *
 *       对象的加载过程是，先new申请一块内存空间赋默认值，在调用构造方法进行初始化，最后将变量与空间关联
 *       如果在构造方法中执行线程，意味着可能资源还未初始化就开始执行任务。
 */
public class discuss03 {
    private int num=0;
    //构造方法
    public discuss03(){
        //在构造时新建一个线程去做任务
        new Thread(()-> System.out.println(this.num)).start();
    }

    public static void main(String[] args) throws Exception{
            new discuss03();
            System.out.println();
    }
}
