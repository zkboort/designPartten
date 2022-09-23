package springTX.dao.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import springTX.dao.TCustomerDao;

/**
 * @author chennanjiang
 * @title TCustomerDaoImpl
 * @date 2022/8/28 18:53
 * @description TODO
 */
@Repository
public class TCustomerDaoImpl implements TCustomerDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    //李华支付1000给南柯
    @Override
    public void income() {
        String sql="update t_customer set account_balances=account_balances+? where name=?";
        jdbcTemplate.update(sql,1000,"南柯");
    }

    @Override
    public void expenditure() {
        String sql="update t_customer set account_balances=account_balances-? where name=?";
        jdbcTemplate.update(sql,1000,"李华");
    }
}
