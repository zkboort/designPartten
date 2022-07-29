package factory.abstractFactory.demo01;

/**
 * @author chennanjiang
 * @title Test
 * @date 2022/7/29 11:40
 * @description 咖啡店没了
 */
public class Test {
    public static void main(String[] args) {
        ItalyDessertFactory factory=new ItalyDessertFactory();
        Coffee coffee=factory.buildCoffee();
        Dessert dessert=factory.buildDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
