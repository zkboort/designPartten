package springTX.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springTX.dao.TUserDao;
import springTX.entity.TUser;
import springTX.service.TUserService;

import java.util.List;

/**
 * @author chennanjiang
 * @title TUserServiceImpl
 * @date 2022/8/12 16:16
 * @description TODO
 */
@Service
public class TUserServiceImpl implements TUserService {
    @Autowired
    private TUserDao userDao;

    @Override
    public int addUser(TUser user) {
        return userDao.add(user);
    }

    @Override
    public int updateUser(TUser user) {
        return userDao.update(user);
    }

    @Override
    public int deleteUser(int id) {
        return userDao.deleteById(id);
    }

    @Override
    public int count() {
        return userDao.count();
    }

    @Override
    public TUser queryById(int id) {
        return userDao.queryById(id);
    }

    @Override
    public List<TUser> queryList() {
        return userDao.queryList();
    }
}
