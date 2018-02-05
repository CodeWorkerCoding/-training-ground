package com.nchu.learn.freemark.action;

/**
 * Created by fujianjian on 2018/1/23.
 */
public abstract class CommonAction {

    /**
     * 当前页码字段名
     */
    protected final static String PAGENO_FIELD = "pageno";

    /**
     * 每页数量字段名
     */
    protected final static String PAGESIZE_FIELD = "pageSize";

    /**
     * 当前页码
     */
    protected final static String PAGENO = "0";

    /**
     * 每页数量
     */
    protected final static String PAGESIZE = "20";

    protected final static Integer S200 = 200;
    protected final static Integer F400 = 400;
    protected final static Integer F401 = 401;
    protected final static Integer F403 = 403;
    protected final static Integer F404 = 404;
    protected final static Integer F500 = 500;

    protected final static String S_MSG = "处理成功";
    protected final static String F_MSG = "处理失败";

}
