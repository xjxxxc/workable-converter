package com.liumapp.workable.converter.beans;

import java.util.HashMap;

/**
 * file UserPool.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/5/7
 */
public class UserPool {

    private static HashMap<Integer, User> userHashMap = new HashMap<>();

    public static HashMap<Integer, User> getInstance () {
        return userHashMap;
    }

}
