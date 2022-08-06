package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author chennanjiang
 * @title MyInvocationHandler
 * @date 2022/8/5 18:55
 * @description 增强类
 * nvocationHandler接口的Invoke()的方法参数：
 *   Object proxy:代理对象的一个引用，newpPoxyInstance()的返回值
 *   Method method: 代理对象的业务方法执行时触发了Invoke()方法,通过反射到委托对象那里去执行，返回执行结果
 *   Object args: 代理对象调用方法时实际传递的参数
 */
public class MyInvocationHandler implements InvocationHandler {
    /*

     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //对需要增强的方法进行判断
        if("order".equals(method.getName())){
            //可加其他处理
            System.out.println("订单生成");
            //业务方法对象表示的底层方法,指定委托对象，拿到业务方法对象和业务执行需要的参数
            Object result=method.invoke(new Customer(),args);
            //可加其他处理
            System.out.println("生成完毕");
            return result;
        }else{
            return method.invoke(new Customer(),args);
        }



    }

}
