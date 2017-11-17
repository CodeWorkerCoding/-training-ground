package com.nchu.learn.lombok;

import com.alibaba.fastjson.JSON;
import com.nchu.learn.model.entity.Region;
import org.junit.Test;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/17 14:35
 */
public class RegionTest {

    @Test
    public void testLombokBuilder() {
        Region builderRegion = Region.builder().code(1).name("qwerere").id("12345626").build();
        String string = JSON.toJSONString(builderRegion);
        System.out.println(string);
        System.out.println(builderRegion.toString());
    }
}
