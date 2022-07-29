package factory.methodFactory;

/**
 * @author chennanjiang
 * @title WhiteCoffeeFactory
 * @date 2022/7/28 16:05
 * @description TODO
 */
public class WhiteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee buildCoffee() {
        return new WhiteCoffee();
    }
}
