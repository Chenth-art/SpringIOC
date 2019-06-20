package com;

import com.pojo.User;
import com.sun.jmx.snmp.SnmpPduBulk;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//通过porm.xml中的 spring-test提供的测试 RunWith（）小括号里是测试模块
/*@RunWith(SpringJUnit4ClassRunner.class)//使用前需要导入spring-test jar包
@ContextConfiguration(locations = "classpath:/appContext.xml")*/
public class TestUser {

    //@Autowired//作用是创建对象，给属性入参 和类里@Component配合使用
    //private User user;
    @Test
    public void test1(){
        //System.out.println(user);


    }
    @Test
    public void test2(){
          /*加载配置文件    通过ClassPathXmlApplicationContext读取
         配置文件applicationContext.xml 生成应用上下文（类似于工程的对象）*/
        ApplicationContext ctx = new ClassPathXmlApplicationContext("appContext.xml");
        //通过id创建对象
        User user = (User)ctx.getBean("user");
        System.out.println(user);
        User user2 = (User) ctx.getBean("user2");
        System.out.println(user2);
        User user3 = (User) ctx.getBean("user3");
        System.out.println(user3);
        User user01 = (User) ctx.getBean("user01");
        System.out.println(user01);
        User user02 = (User)ctx.getBean("user01");
        System.out.println(user01==user02);
    }
}
