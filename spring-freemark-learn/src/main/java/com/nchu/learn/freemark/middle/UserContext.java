package com.nchu.learn.freemark.middle;

import lombok.extern.slf4j.Slf4j;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/14 10:57
 */
@Slf4j
public final class UserContext {

    private final static ThreadLocal<String> userNameContext = new ThreadLocal<>();

    public static void setUserName(String userName) {
        log.info("setting username [{}] for UserContext!!!", userName);
        userNameContext.set(userName);
    }

    public static String getUserName() {
        String userName = userNameContext.get();
        log.info("getting username [] from UserContext!!!", userName);
        return userName;
    }
}
