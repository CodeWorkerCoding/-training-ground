package com.nchu.learn.freemark.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/8 17:44
 */
@Controller
public class IndexAction {

    @GetMapping("/index")
    public String index() {
        return "index_bootdo";
    }
}
