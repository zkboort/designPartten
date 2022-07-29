package factory.methodFactory;

/**
 * @author chennanjiang
 * @title LatteCoffeeFactory
 * @date 2022/7/28 15:35
 * @description TODO
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee buildCoffee() {
        return new LatteCoffee();
    }
}
