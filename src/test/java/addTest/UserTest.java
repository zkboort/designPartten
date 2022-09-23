package addTest;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;
import springTX.entity.TUser;
import springTX.service.TCustomerService;
import springTX.service.serviceImpl.TCustomerServiceImpl;
import springTX.service.serviceImpl.TUserServiceImpl;

import java.util.Date;

/**
 * @author chennanjiang
 * @title UserTest
 * @date 2022/8/12 16:52
 * @description TODO
 */
public class UserTest {
    @Test
    public void testAddUser(){
        //创建容器
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //获取user的service对象
        TUserServiceImpl userServiceImpl=context.getBean("TUserServiceImpl", TUserServiceImpl.class);
        TUser user=new TUser();
        user.setId(3);
        user.setUserName("test");
        user.setUserPwd("123456");
        user.setEmail("285647510@ee.com");
        user.setUpdateTime(new Date());
        user.setCreateTime(new Date());
        user.setIsValid(1);
        userServiceImpl.addUser(user);
    }

    @Test
    public void testUpdate(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        TUserServiceImpl userServiceImpl=context.getBean("TUserServiceImpl", TUserServiceImpl.class);
        TUser user=new TUser();
        user.setId(3);
        user.setUserName("test");
        user.setUserPwd("123456789");
        user.setEmail("");
        user.setPhone("18324182141");
        user.setUpdateTime(new Date());
        user.setCreateTime(null);
        user.setIsValid(1);
        userServiceImpl.updateUser(user);
    }

    @Test
    public void testDelete(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        TUserServiceImpl userServiceImpl=context.getBean("TUserServiceImpl", TUserServiceImpl.class);
        userServiceImpl.deleteUser(3);
    }

    @Test
    public void accountMove(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        TCustomerServiceImpl tCustomerServiceImpl=context.getBean("TCustomerServiceImpl",TCustomerServiceImpl.class);
        tCustomerServiceImpl.accountMove();
    }
}
