package cn.wangshy.spring.demo;

import cn.wangshy.spring.bean.UserDemo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @PackageName:
 * @FileName:
 * @Description:
 * @Author: wangshy
 * @company: 上海势航网络科技有限公司
 * @Date 18/1/5
 */
public class Demo {
    /**
     * 普通工厂
     */
    @Test
    public void fun1() {
        //1.创建容器
        //2.向容器要对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDemo userDemo = (UserDemo) context.getBean("userDemo");
        System.out.println(userDemo);
    }

    /**
     * 静态工厂
     */
    @Test
    public void fun2() {
        //1.创建容器
        //2.向容器要对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDemo userDemo = (UserDemo) context.getBean("createDemo");
        System.out.println(userDemo);
    }

    /**
     * 动态工厂
     */
    @Test
    public void fun3() {
        //1.创建容器
        //2.向容器要对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDemo userDemo = (UserDemo) context.getBean("createDemo1");
        System.out.println(userDemo);
    }
}
