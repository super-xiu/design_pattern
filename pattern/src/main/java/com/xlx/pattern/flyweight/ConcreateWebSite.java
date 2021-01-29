package com.xlx.pattern.flyweight;

/**
 * @author xlx
 * @Date: 2021/1/28
 * @Description:com.xlx.pattern.flyWeight
 * @version:1.0
 */
public class ConcreateWebSite implements WebSite {
    //内部对象
    private String type;

    public ConcreateWebSite(String type) {
        this.type = type;
    }

    public void use(User user) {
        System.out.println("网站发布了，类型是："+type+",发布者是："+user.getName());
        Integer integer = Integer.valueOf(127);

    }
}
