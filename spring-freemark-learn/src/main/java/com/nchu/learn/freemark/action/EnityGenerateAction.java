package com.nchu.learn.freemark.action;

import com.alibaba.fastjson.JSON;
import com.nchu.learn.freemark.config.TemplateManager;
import com.nchu.learn.freemark.model.CommonEnity;
import com.nchu.learn.freemark.model.enums.FieldTypeEnum;
import com.nchu.learn.freemark.model.enums.NecessaryEnum;
import com.nchu.learn.freemark.service.CommonEnityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.EnumSet;
import java.util.List;
import java.util.Map;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/8 15:47
 */
@Controller
@Slf4j
@RequestMapping("/genEnity/")
public class EnityGenerateAction {

    @Autowired
    private TemplateManager templateManager;

    @Autowired
    private CommonEnityService commonEnityService;


    @GetMapping("list")
    public String genModeleList() {
        return "enity/genModelList";
    }

    @GetMapping("list/data")
    public @ResponseBody List<CommonEnity> obtainPageData(Map<String, Object> param) {
        List<CommonEnity> commonEnityList = this.commonEnityService.findAllList();
        return commonEnityList;
    }

    @GetMapping("before/gen")
    public String generatePage(ModelMap model) {
        model.put("necessaryList", EnumSet.allOf(NecessaryEnum.class));
        model.put("fieldTypeList", EnumSet.allOf(FieldTypeEnum.class));
        return "enity/generatePage";
    }

    @PostMapping("doing/gen")
    public @ResponseBody String generateCode(CommonEnity commonEnity) throws Exception {
        log.info("{}",commonEnity);
        String genCode = this.templateManager.genEnityCode(commonEnity);
        log.info("{}", genCode);
        return genCode;
    }

    @PostMapping("save/model")
    public String saveGenModel(CommonEnity commonEnity) {
        this.commonEnityService.create(commonEnity);
        return "redirect:/enity/list";
    }

}
