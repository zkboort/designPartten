package factory.abstractFactory.demo01;

/**
 * @author chennanjiang
 * @title ItalyDessrtFactory
 * @date 2022/7/29 11:35
 * @description 意大利风格甜品工厂
 */
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee buildCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert buildDessert() {
        return new Trimisu();
    }
}
