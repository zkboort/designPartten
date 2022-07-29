package factory.simpleFactory.configFactory;

/**
 * @author chennanjiang
 * @title Test
 * @date 2022/7/29 13:13
 * @description TODO
 */
public class Test {
    public static void main(String[] args) {
        Coffee coffee=CoffeeFactory.buildCoffee("american");
        System.out.println(coffee);

        Coffee coffee1=CoffeeFactory.buildCoffee("latte");
        System.out.println(coffee1);
    }
}
