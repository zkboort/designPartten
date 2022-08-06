package proxy.staticProxy;

/**
 * @author chennanjiang
 * @title Test
 * @date 2022/8/5 12:51
 * @description TODO
 */
public class Test {
    public static void main(String[] args) {
        HelloService helloService=new HelloServiceimp();
        HelloService helloServiceProxy=new HelloServiceProxy(helloService);
        System.out.println(helloServiceProxy.echo("业务处理"));
    }
}
