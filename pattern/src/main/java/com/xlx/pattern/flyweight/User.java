package com.xlx.pattern.flyweight;

import lombok.Data;

/**
 * @author xlx
 * @Date: 2021/1/28
 * @Description:com.xlx.pattern.flyWeight
 * @version:1.0
 */
@Data
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }
}
