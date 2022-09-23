package springTX.dao;

/**
 * @author chennanjiang
 * @title TCustomerDao
 * @date 2022/8/28 18:53
 * @description 单线程环境
 */
public interface TCustomerDao {
    //收入
    public void income();
    //支出
    public void expenditure();
}
