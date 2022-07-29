package factory.abstractFactory.demo01;

/**
 * @author chennanjiang
 * @title AmericanDessertFactory
 * @date 2022/7/29 11:33
 * @description 美式风格甜品工厂
 */
public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee buildCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert buildDessert() {
        return new mochaMousse();
    }
}
