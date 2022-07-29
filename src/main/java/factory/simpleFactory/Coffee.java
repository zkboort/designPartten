package factory.simpleFactory;

/**
 * @author chennanjiang
 * @title Coffee
 * @date 2022/7/28 14:34
 * @description 定义咖啡类的抽象
 */
public abstract class Coffee {
    public abstract String getName();
    //加糖
    public void addSugar(){
        System.out.println("放糖");
    };
    //加奶
    public void addMilk(){
        System.out.println("加奶");
    };
}
