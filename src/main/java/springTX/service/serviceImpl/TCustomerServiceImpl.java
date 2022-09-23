package springTX.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import springTX.dao.daoImpl.TCustomerDaoImpl;
import springTX.service.TCustomerService;

/**
 * @author chennanjiang
 * @title TCustomerServiceImpl
 * @date 2022/8/28 18:48
 * @description
 */

/** 事务的参数
 * 事务的传播行为：事务之间的交互方式  Propagation=
 *  (默认)required: 当前存在事务就加入到当前事务去执行，如果不存在事务就创建一个事务
 *  required_new: 它不管是否存在事务，它都会新开启一个事务来执行，新老事务相互独立的，外部事务抛出异常，并不会影响内部事务的一个正常提交
 *  supports:表示支持当前当前的事务，如果当前不存在事务，就以非事务的方式去执行
 *  not_support:表示以非事务的方式来运行，如果当前存在事务，就需要把当前的事务挂起来
 *  mandatory:它是一个强制的事务执行，如果当前不存在事务就抛出一个异常
 *  never:就是以非事务的方式来执行，如果当前存在事务则抛出一个异常
 *  nested:如果当前存在事务，就嵌套当前事务中去执行，如果当前没有事务，那么就新建一个事务，类似 REQUIRE_NEW这个样一个传播行为

 * 事务的隔离级别：isolation=
 *  不考虑事务隔离性的问题：脏读，不可重复读，幻读
 *          脏读：一个未提交的事务读到了另一个未提交事务的数据
 *          不可重复读：一个未提交事务读取到了另一个事务修改的数据
 *          幻读：一个未提交的事务读到了另一个未提交事务添加的数据
 *  read_uncommitted:读未提交     存在:脏读   不可重复读   幻读
 *  read_committed：读已提交      存在：不可重复读  幻读
 *  (默认)repeatable_read:可重复度      存在：幻读
 *  serializable:串行化           都不存在

 * 事务提交时间：超时回滚
 * timeout：
 *
 * 是否只读（只能查询,不可增删改）：readOnly=
 * false:默认
 * true:
 *
 * 异常回滚设置
 * rollbackFor: 异常.class
 * 不回滚异常设置：
 * noRollbackFor: 异常.class
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)      //事务注解可以添加到类或方法上，类上代表所有的方法都作为事务，方法上则代表此方法作为事务处理
public class TCustomerServiceImpl implements TCustomerService {
    @Autowired
    private TCustomerDaoImpl tCustomerDao;


    @Override
    public void accountMove() {
        /**
        //编程式操作 转账事务
        try {
            //开启事务
            tCustomerDao.expenditure();
            //模拟异常
            int i= 10/0;
            tCustomerDao.income();
        }catch (Exception e){
            //事务回滚

        }
        **/
        tCustomerDao.expenditure();
        //模拟异常
        //int i= 10/0;
        tCustomerDao.income();
    }





}
