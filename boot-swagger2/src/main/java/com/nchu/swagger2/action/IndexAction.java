package com.nchu.swagger2.action;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2017/12/8 11:30
 */
@RestController
public class IndexAction {

    @ApiOperation(value = "系统主页", notes = "123443sdrfefeer")
    @GetMapping("/index")
    public String index() {
        return "helle world";
    }
}
