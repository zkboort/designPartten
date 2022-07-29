package factory.simpleFactory;

/**
 * @author chennanjiang
 * @title CoffeeStore
 * @date 2022/7/28 14:41
 * @description 咖啡店             咖啡店和工厂进行的关联
 */
public class CoffeeStore {
    public Coffee orderCoffee(String name){
        //调用工厂方法生产Coffee
        SimpleCoffeeFactory coffeeFactory=new SimpleCoffeeFactory();
        Coffee coffee=coffeeFactory.buildCoffee(name);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
