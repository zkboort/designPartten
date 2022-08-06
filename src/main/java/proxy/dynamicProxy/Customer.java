package proxy.dynamicProxy;

/**
 * @author chennanjiang
 * @title Customer
 * @date 2022/8/5 19:26
 * @description TODO
 */
public class Customer implements OrderService{
    @Override
    public String order(String name) {
        return "已经下单的商品"+name;
    }
}
