package com.nchu.statemachine.helper;

import java.util.UUID;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/21 10:59
 */
public final class UUIdHelper {

    public static String uuid() {
        return UUID.randomUUID().toString().replace(Constant.SHORT_HR, Constant.EMPTY_STR);
    }
}
