package com.nchu.statemachine.service.impl;

import com.nchu.statemachine.helper.UUIdHelper;
import com.nchu.statemachine.model.enums.ExecutorContextEnum;
import com.nchu.statemachine.model.enums.MachineCategoryEnum;
import com.nchu.statemachine.model.enums.MachineEventEnum;
import com.nchu.statemachine.model.enums.MachineStateEunm;
import com.nchu.statemachine.model.pojo.StateMachineConfig;
//import com.nchu.statemachine.repo.StateMachineConfigRepository;
import com.nchu.statemachine.service.StateMachineConfigService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2017/11/21 10:48
 */
@Service
@Slf4j
public class StateMachineConfigServiceImpl implements StateMachineConfigService {

    //@Autowired
    //private StateMachineConfigRepository stateMachineConfigRepository;

    private static Map<MachineStateEunm, StateMachineConfig> tempMap = new HashMap<>();

    static {
        StateMachineConfig.StateMachineConfigBuilder configBuilder = StateMachineConfig.builder();
        tempMap.put(MachineStateEunm.INIT, configBuilder.machineCategory(MachineCategoryEnum.WASH_MACHINE.getCategory())
                .sourceState(MachineStateEunm.INIT).targetState(MachineStateEunm.DIRTY).event(MachineEventEnum.SUBMIT_WASH)
                .executorContext(ExecutorContextEnum.SUBMIT_WASH_EXECUTE.getExecutorContext()).executorMethod(ExecutorContextEnum.SUBMIT_WASH_EXECUTE.getExecutorMethod())
                .build());
        tempMap.put(MachineStateEunm.DIRTY, configBuilder.machineCategory(MachineCategoryEnum.WASH_MACHINE.getCategory())
                .sourceState(MachineStateEunm.DIRTY).targetState(MachineStateEunm.WET).event(MachineEventEnum.PRE_WASH)
                .executorContext(ExecutorContextEnum.PRE_WASH_EXECUTE.getExecutorContext()).executorMethod(ExecutorContextEnum.PRE_WASH_EXECUTE.getExecutorMethod())
                .build());
        tempMap.put(MachineStateEunm.WET, configBuilder.machineCategory(MachineCategoryEnum.WASH_MACHINE.getCategory())
                .sourceState(MachineStateEunm.WET).targetState(MachineStateEunm.CLEAN).event(MachineEventEnum.WASHING)
                .executorContext(ExecutorContextEnum.WASHING_EXECUTE.getExecutorContext()).executorMethod(ExecutorContextEnum.WASHING_EXECUTE.getExecutorMethod())
                .build());
        tempMap.put(MachineStateEunm.CLEAN, configBuilder.machineCategory(MachineCategoryEnum.WASH_MACHINE.getCategory())
                .sourceState(MachineStateEunm.CLEAN).targetState(MachineStateEunm.DRYING).event(MachineEventEnum.DRY)
                .executorContext(ExecutorContextEnum.DRY_EXECUTE.getExecutorContext()).executorMethod(ExecutorContextEnum.DRY_EXECUTE.getExecutorMethod())
                .build());
        tempMap.put(MachineStateEunm.DRYING, configBuilder.machineCategory(MachineCategoryEnum.WASH_MACHINE.getCategory())
                .sourceState(MachineStateEunm.DRYING).targetState(MachineStateEunm.DONE).event(MachineEventEnum.POST_WASH)
                .executorContext(ExecutorContextEnum.POST_WASH_EXECUTE.getExecutorContext()).executorMethod(ExecutorContextEnum.POST_WASH_EXECUTE.getExecutorMethod())
                .build());
    }

    @Override
    public StateMachineConfig findById(String s) {
        //return this.stateMachineConfigRepository.findByPrimaryKey(s);
        return null;
    }

    @Override
    public StateMachineConfig save(StateMachineConfig stateMachineConfig) {
        stateMachineConfig.setId(UUIdHelper.uuid());
        stateMachineConfig.setCreatedTime(new Date());
        //this.stateMachineConfigRepository.insertObject(stateMachineConfig);
        return stateMachineConfig;
    }

    @Override
    public StateMachineConfig update(StateMachineConfig stateMachineConfig) {
        return null;
    }

    @Override
    public void deleteEnity(StateMachineConfig stateMachineConfig) {
        //this.stateMachineConfigRepository.deleteByPrimaryKey(stateMachineConfig.getId());
    }

    @Override
    public void deleteById(String s) {
        //this.stateMachineConfigRepository.deleteByPrimaryKey(s);
    }

    @Override
    public List<StateMachineConfig> findByStateCategory(String machineCategory) {
        List<StateMachineConfig> list = new ArrayList<>();
        tempMap.forEach((k,v) -> list.add(v));
        return list;
    }

    @Override
    public StateMachineConfig findByCategorySourceAndEvent(String category, MachineStateEunm source, MachineEventEnum event) {
        StateMachineConfig stateMachineConfig = tempMap.get(source);
        return stateMachineConfig;
    }
}
