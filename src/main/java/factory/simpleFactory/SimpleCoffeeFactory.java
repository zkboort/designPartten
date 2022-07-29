package factory.simpleFactory;

/**
 * @author chennanjiang
 * @title SimpleCoffeeFactory
 * @date 2022/7/28 14:43
 * @description 咖啡类的简单工厂;    可以看见工厂具体的Coffee产品关联在一起的，这显然还是不完美！无法在增加新的coffe产品时不去修改此类
 *                                这不满足开闭原则。
 */
public class SimpleCoffeeFactory {
    public Coffee buildCoffee(String name){
        Coffee coffee=null;
        if(name=="american"){
            coffee=new AmericanCoffee();
        } else if (name=="latte") {
            coffee=new LatteCoffee();
        }else {
            System.out.println("sorry!there is no such type of coffee ar present");
        }
        return coffee;
    }
}
