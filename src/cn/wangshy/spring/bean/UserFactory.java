package cn.wangshy.spring.bean;

/**
 * @PackageName:
 * @FileName:
 * @Description:
 * @Author: wangshy
 * @company: 上海势航网络科技有限公司
 * @Date 18/1/5
 */
public class UserFactory {

    public static UserDemo createUserDemo() {
        return new UserDemo();
    }

    public UserDemo createUserDemo2() {
        return new UserDemo();
    }
}
