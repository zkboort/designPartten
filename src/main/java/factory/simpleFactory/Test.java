package factory.simpleFactory;

/**
 * @author chennanjiang
 * @title Test
 * @date 2022/7/28 14:54
 * @description TODO
 */
public class Test {
    public static void main(String[] args) {
        CoffeeStore store=new CoffeeStore();
        Coffee coffee = store.orderCoffee("american");
        System.out.println(coffee.getName());
    }
}
