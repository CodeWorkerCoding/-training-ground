package com.nchu.statemachine.service;

import com.nchu.statemachine.model.enums.MachineEventEnum;
import com.nchu.statemachine.model.enums.MachineStateEunm;
import com.nchu.statemachine.model.pojo.StateMachineConfig;

import java.util.List;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/21 10:44
 */
public interface StateMachineConfigService extends BaseService<StateMachineConfig, String> {

    List<StateMachineConfig> findByStateCategory(String machineCategory);

    StateMachineConfig findByCategorySourceAndEvent(String category, MachineStateEunm source, MachineEventEnum event);
}
