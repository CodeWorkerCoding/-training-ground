package com.nchu.learn.freemark.action;

import com.nchu.learn.freemark.model.CommonEnity;
import com.nchu.learn.freemark.model.dto.PageRespDo;
import com.nchu.learn.freemark.service.CommonEnityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by fujianjian on 2018/1/23.
 */
@Slf4j
@RestController
@RequestMapping("/enity/")
public class EnityAction extends CommonAction {

    @Autowired
    private CommonEnityService commonEnityService;


    @GetMapping("list")
    public PageRespDo enitryList(Map map,
                                 @RequestParam(value = PAGENO_FIELD, defaultValue = PAGENO) Integer pageno,
                                 @RequestParam(value = PAGESIZE_FIELD, defaultValue = PAGESIZE) Integer pageSize) {
        PageRespDo.PageRespDoBuilder respBuilder = PageRespDo.builder();


        return respBuilder.build();
    }

    @PostMapping("create")
    public PageRespDo createEnity(CommonEnity commonEnity) {
        PageRespDo.PageRespDoBuilder respBuilder = PageRespDo.builder();
        this.commonEnityService.create(commonEnity);
        respBuilder.code(S200).msg(S_MSG);
        return respBuilder.build();
    }
}
