package springTX.service;

import springTX.entity.TUser;

import java.util.List;

/**
 * @author chennanjiang
 * @title TUserService
 * @date 2022/8/12 16:15
 * @description TODO
 */
public interface TUserService {
    public int addUser(TUser user);
    public int updateUser(TUser user);
    public int deleteUser(int id);
    public int count();
    public TUser queryById(int id);
    public List<TUser> queryList();
}
