package cn.wangshy.spring.bean;

/**
 * @PackageName:
 * @FileName:
 * @Description:
 * @Author: wangshy
 * @company: 上海势航网络科技有限公司
 * @Date 18/1/5
 */
public class UserDemo {
    public UserDemo() {
        System.out.println("空参构造方法");
    }

    private String uName;
    private String uPwd;

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPwd() {
        return uPwd;
    }

    public void setuPwd(String uPwd) {
        this.uPwd = uPwd;
    }

    public void init() {
        System.out.println("init初始化方法");
    }

    public void destroy() {
        System.out.println("destroy销毁方法");
    }
}
