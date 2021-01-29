package com.xlx.pattern.flyweight;

import java.util.HashMap;

/**
 * 网站工厂类，没有则创建，有则使用
 * @author xlx
 * @Date: 2021/1/28
 * @Description:com.xlx.pattern.flyWeight
 * @version:1.0
 */
public class WebSiteFactory {

    private HashMap<String, ConcreateWebSite> pool = new HashMap<String, ConcreateWebSite>();

    public WebSite getWebSiteCategory(String type){

        if (!pool.containsKey(type)){
            //创建一个
            ConcreateWebSite webSite = new ConcreateWebSite(type);
            pool.put(type,webSite);
        }
        return pool.get(type);

    }

    public Integer getCountConcreateWebSite(){
        return pool.size();
    }
}
