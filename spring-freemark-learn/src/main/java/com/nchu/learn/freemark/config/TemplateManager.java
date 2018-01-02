package com.nchu.learn.freemark.config;

import com.nchu.learn.freemark.model.DemoDo;
import freemarker.template.Configuration;
import freemarker.template.Template;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/1/2 18:31
 */
@Slf4j
@Component
public class TemplateManager implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        DemoDo demo = DemoDo.builder().name("kevin").age(10).build();
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_26);
        cfg.setClassForTemplateLoading(TemplateManager.class, "/template");
        Template template = cfg.getTemplate("demo.ftl");
        String demoTemp = FreeMarkerTemplateUtils.processTemplateIntoString(template, demo);
        log.info("temp: {}", demoTemp);
    }
}
