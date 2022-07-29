package factory.methodFactory;

/**
 * @author chennanjiang
 * @title AmericanCoffeeFactory
 * @date 2022/7/28 15:31
 * @description 美式咖啡工厂
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    /**
     * @description:   生产美式咖啡
     * @date 2022/7/28 15:35
     * @author chennanjiang
     * @params  * @param null
     * @return {@link null}
     */

    @Override
    public Coffee buildCoffee() {
        return new AmericanCoffee();
    }
}
