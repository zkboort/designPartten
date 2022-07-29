package factory.methodFactory;

/**
 * @author chennanjiang
 * @title CoffeeStore
 * @date 2022/7/28 15:27
 * @description 咖啡店
 */
public class CoffeeStore {
    private CoffeeFactory factory;

    //利用设值方法完成成员变量的外部赋值，与控制反转内容相关
    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    /**
     * @description: 调用者（咖啡店）只需要知道具体工厂对象即可完成产品的创建，不要关心创建过程；但是每添加一个产品，就需要添加一个对应的工厂
     *               这也是非常麻烦冗余的工作。
     */
    public Coffee orderCoffee(){
        Coffee coffee = factory.buildCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
