package factory.abstractFactory.demo01;

/**
 * @author chennanjiang
 * @title DessertFactory
 * @date 2022/7/29 11:31
 * @description 甜品抽象工厂
 *
 *     可以看到，这里无非就是将同一产品族不同产品的创转规范写在了一起，当我向里面新增一个产品类时意味着，具体工厂也要去新增代码，
 *     应用场景是：同一产品族要换换全套的情况下使用抽象工厂
 */
public interface DessertFactory {
    //生产咖啡
    Coffee buildCoffee();
    //生产甜品
    Dessert buildDessert();
}
