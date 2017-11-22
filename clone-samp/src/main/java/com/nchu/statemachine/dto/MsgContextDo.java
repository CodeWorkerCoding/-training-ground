package com.nchu.statemachine.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/21 11:51
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MsgContextDo {

    private Object executeParam;

    private String machineId;

    private String machineCategory;

    private boolean auto;
}
