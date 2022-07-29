package factory.simpleFactory.configFactory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @author chennanjiang
 * @title CoffeeFactory
 * @date 2022/7/29 12:31
 * @description 咖啡静态工厂
 *    初步来看，这是个单例，但如果不想要单例，也可以改掉静态
 */
public class CoffeeFactory {

    //生产过程的前序控制，加载配置文件，获取全类名，创建对象 并 存储对象
    //根据名称存储对象
    private static HashMap<String,Coffee> map=new HashMap<>();

    /**
     *  加载配置文件（只在一次使用静态代码块），创建对象
     */
    static {
        Properties p=new Properties();
        //通过获取本类对象的类加载器的获取路径输入流，得到配置文件的输入流
        InputStream input=CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            p.load(input);
            //从p中获取全类名,通过返回的键的set集合， 获取值(全类名)，创建对象
            Set<Object> keys=p.keySet();
            for(Object key:keys){
                String className=p.getProperty((String) key);
                //通过反射,调用字节码对象的无参构造创建对象(Object类型)
                Class clazz=Class.forName(className);
                Coffee coffee=(Coffee)clazz.newInstance();
                //存储
                map.put((String)key,coffee);
            }
        } catch (Exception e) {
             e.printStackTrace();
        }
    }

    public static Coffee buildCoffee(String coffeeName){
        return map.get(coffeeName);
    }

}
