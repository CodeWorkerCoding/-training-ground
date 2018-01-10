package com.nchu.learn.freemark.action;

import com.nchu.learn.freemark.model.CommonEnity;
import com.nchu.learn.freemark.model.enums.FieldTypeEnum;
import com.nchu.learn.freemark.model.enums.NecessaryEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.EnumSet;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/8 15:47
 */
@Controller
@Slf4j
@RequestMapping("/enity/")
public class EnityGenerateAction {


    @GetMapping("before/gen")
    public String generatePage(ModelMap model) {
        model.put("necessaryList", EnumSet.allOf(NecessaryEnum.class));
        model.put("fieldTypeList", EnumSet.allOf(FieldTypeEnum.class));
        return "enity/generatePage";
    }

    @PostMapping("doing/gen")
    public String generateCode(CommonEnity commonEnity) {
        return "";
    }

}
