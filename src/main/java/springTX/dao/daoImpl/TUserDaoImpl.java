package springTX.dao.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import springTX.dao.TUserDao;
import springTX.entity.TUser;

import java.util.List;


/**
 * @author chennanjiang
 * @title TUserDaoImpl
 * @date 2022/8/12 16:19
 * @description TODO
 */
@Repository
public class TUserDaoImpl implements TUserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(TUser user) {
        String sql="insert into t_user values(?,?,?,?,?,?,?,?)";
        Object[] args={user.getId(),user.getUserName(),user.getUserPwd(),user.getEmail(),user.getPhone(),user.getUpdateTime(),user.getCreateTime(),user.getIsValid()};
        int rows=jdbcTemplate.update(sql,args);
        return rows;
    }

    @Override
    public int update(TUser user) {
        String sql="update t_user set user_name=?,user_pwd=?,email=?,phone=?,update_time=?,create_time=?,is_valid=? where id=?";
        Object[] args={user.getUserName(),user.getUserPwd(),user.getEmail(),user.getPhone(),user.getUpdateTime(),user.getCreateTime(),user.getIsValid(),user.getId()};
        int rows=jdbcTemplate.update(sql,args);
        return rows;
    }

    @Override
    public int deleteById(int id) {
        String sql="delete from t_user where id=?";
        int rows=jdbcTemplate.update(sql,id);
        return rows;
    }

    @Override
    public int count() {
        String sql="select count(*) from t_user";
        int count=jdbcTemplate.queryForObject(sql,Integer.class);
        return count;
    }

    @Override
    public TUser queryById(int id) {
        String sql="select * from t_user where id=?";
        TUser user=jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<TUser>(TUser.class),id);
        return user;
    }

    @Override
    public List<TUser> queryList() {
        String sql="select * from t_user ";
        List<TUser> users=jdbcTemplate.query(sql,new BeanPropertyRowMapper<TUser>(TUser.class));
        return users;
    }
}
