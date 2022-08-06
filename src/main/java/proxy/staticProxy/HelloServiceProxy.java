package proxy.staticProxy;

import java.util.Date;

/**
 * @author chennanjiang
 * @title HelloServiceProxy
 * @date 2022/8/5 12:35
 * @description TODO
 */
public class HelloServiceProxy implements HelloService {
    //很容易发现这里聚合了一个接口
    private  HelloService helloService;
    //构造器里面是实现了接口的对象
    public HelloServiceProxy(HelloService helloService){
        this.helloService=helloService;
    }
    public void setHelloService(HelloService helloService){
        this.helloService=helloService;
    }

    public String echo(String msg){
        //增加处理前的预处理
        System.out.println("before calling echo()");
        //调用委托者处理业务
        String result=helloService.echo("业务相关事务");
        //调用委托者处理业务
        System.out.println("after call echo()");
        return result;
    }
    public Date getTime(){
        //增加处理前的预处理
        System.out.println("before calling echo()");
        //调用委托者处理业务
        Date date=helloService.getTime();
        //调用委托者处理业务
        System.out.println("after call echo()");
        return date;
    }
}
