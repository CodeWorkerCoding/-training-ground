package com.nchu.statemachine.action;

import com.nchu.statemachine.config.CommonMachineProcessor;
import com.nchu.statemachine.dto.MQContextDo;
import com.nchu.statemachine.model.enums.MachineCategoryEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/21 13:13
 */
@Slf4j
@RestController
@RequestMapping("/index/")
public class IndexAction {

    @Autowired
    private CommonMachineProcessor commonMachineProcessor;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() throws Exception {
        MQContextDo context = MQContextDo.builder().machineCategory(MachineCategoryEnum.WASH_MACHINE).build();
        this.commonMachineProcessor.startMachine(context);
        return "success";
    }
}
