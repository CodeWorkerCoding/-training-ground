//package com.nchu.statemachine.repo;
//
//import com.nchu.statemachine.model.enums.MachineEventEnum;
//import com.nchu.statemachine.model.enums.MachineStateEunm;
//import com.nchu.statemachine.model.pojo.StateMachineConfig;
//import org.apache.ibatis.annotations.Param;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
///**
// * @author fujianjian
// * @project self-learn
// * @date 2017/11/21 10:50
// */
//@Repository
//public interface StateMachineConfigRepository extends BaseRepository<StateMachineConfig, String> {
//
//    List<StateMachineConfig> findByMachineCategory(@Param("machineCategory") String machineCategory);
//
//    StateMachineConfig findByCategorySourceAndEvent(@Param("machineCategory") String category,
//                                                    @Param("stateSource") MachineStateEunm source, @Param("event") MachineEventEnum target);
//}
