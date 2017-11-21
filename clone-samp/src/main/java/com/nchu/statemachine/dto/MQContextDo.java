package com.nchu.statemachine.dto;

import com.nchu.statemachine.model.enums.MachineCategoryEnum;
import com.nchu.statemachine.model.enums.MachineEventEnum;
import lombok.Builder;
import lombok.Data;

/**
 * 消息上下文模型
 *
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/21 13:20
 */
@Data
@Builder
public class MQContextDo {

    private MachineCategoryEnum machineCategory;

    private String orderId;
}
