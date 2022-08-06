package proxy.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @author chennanjiang
 * @title Test
 * @date 2022/8/5 19:40
 * @description
 * newProxyInstance()方法的参数：
 *    ClassLoader:通过getClassLoader(),指定委托对象的类加载器，用于加载委托类及其接口的字节码文件；
 *    Class<>[] Interface: getInterfaces指定委托对象需要实现的接口列表；
 *    InvocationHandler: 增强方法的接口或实现类对象，用于处理事务以及非事务。
 */
public class Test {
    public static void main(String[] args) {
        Customer customer=new Customer();
        MyInvocationHandler handler=new MyInvocationHandler();
        //JDK的接口代理
        OrderService orderService=(OrderService) Proxy.newProxyInstance(customer.getClass().getClassLoader(), customer.getClass().getInterfaces(),handler);
        String result=orderService.order("衬衫");
        System.out.println(result);
    }
}
