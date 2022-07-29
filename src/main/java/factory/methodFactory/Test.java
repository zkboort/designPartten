package factory.methodFactory;

/**
 * @author chennanjiang
 * @title Test
 * @date 2022/7/28 15:43
 * @description TODO
 */
public class Test {
    public static void main(String[] args) {
        //咖啡店对象
        CoffeeStore store=new CoffeeStore();
        //具体生产工厂对象
        CoffeeFactory factory=new AmericanCoffeeFactory();
        //咖啡店设置具体的工厂
        store.setFactory(factory);

        //点咖啡
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
