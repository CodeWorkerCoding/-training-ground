package com.nchu.learn.freemark.action;

import com.google.common.collect.Sets;
import com.nchu.learn.freemark.model.dto.OptionDo;
import com.nchu.learn.freemark.model.dto.PageRespDo;
import com.nchu.learn.freemark.model.enums.FieldTypeEnum;
import com.nchu.learn.freemark.model.enums.NecessaryEnum;
import com.nchu.learn.freemark.model.enums.ProjectEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * 系统元数据接口
 *
 * @author fujianjian
 * @project self-learn
 * @date 2018/2/2 15:31
 */
@RestController
@RequestMapping("/meta/")
public class MetaAction {

    @GetMapping("field/type")
    public PageRespDo fieldTypeList() {
        Set<OptionDo> fieldTypeList = Sets.newHashSet();
        OptionDo.OptionDoBuilder optionBuild = OptionDo.builder();
        for (FieldTypeEnum fieldTypeEnum : FieldTypeEnum.values()) {
            optionBuild.value(fieldTypeEnum.getPackagePath()).text(fieldTypeEnum.getAppearType());
            fieldTypeList.add(optionBuild.build());
        }
        PageRespDo.PageRespDoBuilder respBuilder = PageRespDo.builder();
        respBuilder.data(fieldTypeList);
        return respBuilder.build();
    }

    @GetMapping("field/necessary")
    public PageRespDo necessaryOptinList() {
        Set<OptionDo> necessaryOptionList = Sets.newHashSet();
        OptionDo.OptionDoBuilder optionBuild = OptionDo.builder();
        for (NecessaryEnum necessaryEnum : NecessaryEnum.values()) {
            optionBuild.value(necessaryEnum.name()).text(necessaryEnum.getDesc());
            necessaryOptionList.add(optionBuild.build());
        }
        PageRespDo.PageRespDoBuilder respBuilder = PageRespDo.builder();
        respBuilder.data(necessaryOptionList);
        return respBuilder.build();
    }

    @GetMapping("enity/project")
    public PageRespDo projectList() {
        Set<OptionDo> projectList = Sets.newHashSet();
        OptionDo.OptionDoBuilder optionBuild = OptionDo.builder();
        for (ProjectEnum projectEnum : ProjectEnum.values()) {
            optionBuild.value(projectEnum.name()).text(projectEnum.getDesc());
            projectList.add(optionBuild.build());
        }
        PageRespDo.PageRespDoBuilder respBuilder = PageRespDo.builder();
        respBuilder.data(projectList);
        return respBuilder.build();
    }

}
