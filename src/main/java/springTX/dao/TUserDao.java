package springTX.dao;

import springTX.entity.TUser;

import java.util.List;

/**
 * @author chennanjiang
 * @title TUserDao
 * @date 2022/8/12 16:15
 * @description TODO
 */
public interface TUserDao {
    public int add(TUser user);
    public int update(TUser user);
    public int deleteById(int id);
    public int count();
    public TUser queryById(int id);
    public List<TUser> queryList();
}
