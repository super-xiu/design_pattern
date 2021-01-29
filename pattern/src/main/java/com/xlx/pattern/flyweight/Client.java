package com.xlx.pattern.flyweight;

/**
 * @author xlx
 * @Date: 2021/1/28
 * @Description:com.xlx.pattern.flyWeight
 * @version:1.0
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite webSite1 = factory.getWebSiteCategory("新闻");
        webSite1.use(new User("张三"));

        WebSite webSite2 = factory.getWebSiteCategory("微信");
        webSite2.use(new User("李四"));

        WebSite webSite3 = factory.getWebSiteCategory("微信");
        webSite3.use(new User("王无"));

        System.out.println("对象池的大小："+factory.getCountConcreateWebSite());

    }

}
