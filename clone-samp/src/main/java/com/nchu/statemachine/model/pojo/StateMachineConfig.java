package com.nchu.statemachine.model.pojo;

import com.nchu.statemachine.model.enums.MachineEventEnum;
import com.nchu.statemachine.model.enums.MachineStateEunm;
import lombok.Builder;
import lombok.Data;

/**
 * 状态机配置表
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/21 10:15
 */
@Builder
@Data
public class StateMachineConfig extends BaseModel {

    private String machineCategory;

    private MachineStateEunm sourceState;

    private MachineStateEunm targetState;

    private MachineEventEnum event;

    private String executorContext;

    private String executorMethod;
}
