package concurrency.threadPool.use;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author chennanjiang
 * @title MyRegecteHander
 * @date 2022/9/9 17:10
 * @description 线程池的自定义拒绝规则
 */
public class MyRegecteHander implements RejectedExecutionHandler {
    private int clossThreadNum=5;
    private List<Runnable> clossThreadList=new ArrayList<Runnable>();
    //构造
    public MyRegecteHander(int clossThreadNum){
        this.clossThreadNum=clossThreadNum;
    }
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        if(executor.getQueue().size()>clossThreadNum){
            executor.getQueue().drainTo(clossThreadList,clossThreadNum);
            clossThreadList.clear();
            if(!executor.isShutdown()){
                executor.execute(r);
            }

            

        }
    }
}
