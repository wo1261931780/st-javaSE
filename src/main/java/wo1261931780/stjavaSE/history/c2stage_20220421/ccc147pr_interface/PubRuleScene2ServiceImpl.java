// package com.eternalinfo.bizservice.pub.rule;
//
// import com.eternalinfo.dto.*;
// import com.eternalinfo.framework.dto.Page;
// import com.eternalinfo.framework.dto.PaginationDto;
// import com.eternalinfo.framework.persistence.EfPersistenceService;
// import com.eternalinfo.mapper.pub.PubRuleScene2Mapper;
// import com.eternalinfo.model.pub.PubRuleScene2Model;
// import com.eternalinfo.utils.BeanUtil;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import org.springframework.transaction.annotation.Propagation;
// import org.springframework.transaction.annotation.Transactional;
//
// import javax.annotation.Resource;
// import java.util.ArrayList;
// import java.util.List;
//
// /**
//  * 新版规则场景service实现
//  *
//  * @author liujiajun_junw
//  * @date 2022/4/22
//  */
// @Service
// @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
// public class PubRuleScene2ServiceImpl implements PubRuleScene2Service {
//
//     @Resource
//     private EfPersistenceService efPersistenceService;
//     @Autowired
//     private PubRuleScene2Mapper pubRuleScene2Mapper;
//
//     @Override
//     @Transactional(rollbackFor = Exception.class)
//     public int add(PubRuleScene2Dto pubRuleScene2Dto) {
//         PubRuleScene2Model pubRuleScene2Model = new PubRuleScene2Model();
//         BeanUtil.copyProperties(pubRuleScene2Model, pubRuleScene2Dto);
//         return efPersistenceService.insert(pubRuleScene2Model);
//     }
//
//     @Override
//     @Transactional(rollbackFor = Exception.class)
//     public int[] addBatch(List<PubRuleScene2Dto> pubRuleScene2Dtos) {
//         List<PubRuleScene2Model> pubRuleScene2ModelList = new ArrayList<>();
//         for (PubRuleScene2Dto pubRuleScene2Dto : pubRuleScene2Dtos) {
//             PubRuleScene2Model pubRuleScene2Model = new PubRuleScene2Model();
//             BeanUtil.copyProperties(pubRuleScene2Model, pubRuleScene2Dto);
//             pubRuleScene2ModelList.add(pubRuleScene2Model);
//         }
//         return efPersistenceService.addBatch(pubRuleScene2ModelList);
//     }
//
//     @Override
//     @Transactional(rollbackFor = Exception.class)
//     public int remove(PubRuleScene2Dto condition) {
//         PubRuleScene2Model pubRuleScene2Model = new PubRuleScene2Model();
//         BeanUtil.copyProperties(pubRuleScene2Model, condition);
//         return efPersistenceService.delete(PubRuleScene2Model.class, pubRuleScene2Model);
//     }
//
//     @Override
//     @Transactional(rollbackFor = Exception.class)
//     public int removeByIds(String[] ids) {
//         return efPersistenceService.deleteByIds(PubRuleScene2Model.class, ids);
//     }
//
//     @Override
//     @Transactional(rollbackFor = Exception.class)
//     public int modify(PubRuleScene2Dto pubRuleScene2Dto, PubRuleScene2Dto condition) {
//         PubRuleScene2Model pubRuleScene2Model = new PubRuleScene2Model();
//         BeanUtil.copyProperties(pubRuleScene2Model, pubRuleScene2Dto);
//         PubRuleScene2Model modelCondition = new PubRuleScene2Model();
//         BeanUtil.copyProperties(modelCondition, condition);
//         return efPersistenceService.update(pubRuleScene2Model, true, true, modelCondition);
//     }
//
//     @Override
//     @Transactional(rollbackFor = Exception.class)
//     public int modifyById(PubRuleScene2Dto pubRuleScene2Dto) {
//         PubRuleScene2Model pubRuleScene2Model = new PubRuleScene2Model();
//         BeanUtil.copyProperties(pubRuleScene2Model, pubRuleScene2Dto);
//         return efPersistenceService.updateById(pubRuleScene2Model, true, true);
//     }
//
//     @Override
//     public PaginationDto<PubRuleScene2Dto> queryByPage(Page page, PubRuleScene2Dto condition) {
//         PubRuleScene2Model modelCondition = new PubRuleScene2Model();
//         BeanUtil.copyProperties(modelCondition, condition);
//         return efPersistenceService.query(PubRuleScene2Dto.class, page, PubRuleScene2Model.class, null, modelCondition, null, null);
//     }
//
//     @Override
//     public PubRuleScene2Dto getById(String id) {
//         return efPersistenceService.getById(PubRuleScene2Dto.class, PubRuleScene2Model.class, id);
//     }
//
//     @Override
//     public PubRuleScene2Dto getOne(PubRuleScene2Dto condition) {
//         PubRuleScene2Model modelCondition = new PubRuleScene2Model();
//         BeanUtil.copyProperties(modelCondition, condition);
//         return efPersistenceService.getOne(PubRuleScene2Dto.class, PubRuleScene2Model.class, modelCondition);
//     }
//
//     @Override
//     public List<PubRuleScene2Dto> query(PubRuleScene2Dto condition) {
//         PubRuleScene2Model modelCondition = new PubRuleScene2Model();
//         BeanUtil.copyProperties(modelCondition, condition);
//         return efPersistenceService.query(PubRuleScene2Dto.class, PubRuleScene2Model.class, modelCondition);
//     }
//
//     @Override
//     public List<PubRuleScene2Dto> selectAll(PubRuleScene2Dto condition) {
//         PubRuleScene2Model modelCondition = new PubRuleScene2Model();
//         BeanUtil.copyProperties(modelCondition, condition);
//         return pubRuleScene2Mapper.selectAll(condition);
//     }
//
//     // @Override
//     // public void addPubRules(PubRuleMergeDto requestDto) throws Exception {
//     //     //情景参数空判断
//     //     if (EmptyUtil.isEmpty(requestDto.getBusinessScenarioType())) {
//     //         throw new BizException(CommMessageCode.ERR_REQ_PAR_EMPTY, "情景设定条件不能为空");
//     //     } else if (EmptyUtil.isEmpty(requestDto.getSceneExpr())) {
//     //         throw new BizException(CommMessageCode.ERR_REQ_PAR_EMPTY, "情景表达式 不能为空");
//     //     }
//     //     //规则条件
//     //     List<PubRuleScene2CondDto> condList = requestDto.getCondList();
//     //     //规则结果
//     //     List<PubRuleScene2ResultDto> resultList = requestDto.getResultList();
//     //     //规则主表数据加工
//     //     PubRuleScene2Model ruleModel = new PubRuleScene2Model();
//     //     BeanUtil.copyProperties(ruleModel, requestDto);// 拷贝属性
//     //     String id = IdUtil.nextId("pub_rule_scene2"); // 获取主键
//     //     ruleModel.setId(id);
//     //     ruleModel.setEnableFlg(BizCommonConstants.BOOLEAN_FLAG_YES);
//     //     //ruleModel.setSceneExpr(requestDto.getSceneExpr());// 设置情景表达式
//     //     //新增主表
//     //     efPersistenceService.insert(ruleModel);
//     //     //新增条件列表
//     //     for (PubRuleScene2CondDto cond : condList) {
//     //         cond.setBusinessScenarioId(id);
//     //         PubRuleScene2CondModel condModel = new PubRuleScene2CondModel();
//     //         BeanUtil.copyProperties(condModel, cond);
//     //         efPersistenceService.insert(condModel);
//     //     }
//     //     //新增结果列表
//     //     for (PubRuleScene2ResultDto resultDto : resultList) {
//     //         resultDto.setBusinessScenarioId(id);
//     //         PubRuleScene2ResultModel resultModel = new PubRuleScene2ResultModel();
//     //         BeanUtil.copyProperties(resultModel, resultDto);
//     //         efPersistenceService.insert(resultModel);
//     //     }
//     //
//     // }
//
//
//     // @Override
//     // public PubRuleMergeDto getPubRuleDetail(PubRuleMergeDto ruleMergeDto) throws Exception {
//     //     String ruleId = ruleMergeDto.getRuleId();
//     //     if (EmptyUtil.isEmpty(ruleId)) {
//     //         throw new BizException(CommMessageCode.ERR_REQ_PAR_EMPTY, "规则主表id不能为空");
//     //     }
//     //     //主表查询,如果场景类型为空就再查询一次主表
//     //     if (EmptyUtil.isEmpty(ruleMergeDto.getBusinessScenarioType())) {
//     //         PubRuleScene2Dto ruleDto = efPersistenceService.getById(PubRuleScene2Dto.class, PubRuleScene2Model.class, ruleId);
//     //         if (EmptyUtil.isNotEmpty(ruleDto)) {
//     //             ruleMergeDto.setBusinessScenarioName(ruleDto.getBusinessScenarioName());
//     //             ruleMergeDto.setBusinessScenarioType(ruleDto.getBusinessScenarioType());
//     //             ruleMergeDto.setSceneExpr(ruleDto.getSceneExpr());
//     //         }
//     //     }
//     //
//     //     //条件列表查询
//     //     PubRuleScene2CondDto condition = new PubRuleScene2CondDto();
//     //     condition.setBusinessScenarioId(ruleId);
//     //     List<PubRuleScene2CondDto> condList = efPersistenceService.query(PubRuleScene2CondDto.class, PubRuleScene2CondModel.class, condition);
//     //     ruleMergeDto.setCondList(condList);
//     //
//     //     //结果列表查询
//     //     PubRuleScene2ResultDto resultConditon = new PubRuleScene2ResultDto();
//     //     resultConditon.setBusinessScenarioId(ruleId);
//     //     List<PubRuleScene2ResultDto> resultList = efPersistenceService.query(PubRuleScene2ResultDto.class, PubRuleScene2ResultModel.class, resultConditon);
//     //     ruleMergeDto.setResultList(resultList);
//     //
//     //     return ruleMergeDto;
//     // }
//
//
//     // @Override
//     // public void deletePubRules(PubRuleMergeDto ruleMergeDto) throws Exception {
//     //     String ruleId = ruleMergeDto.getRuleId();
//     //     if (EmptyUtil.isEmpty(ruleId)) {
//     //         throw new BizException(CommMessageCode.ERR_REQ_PAR_EMPTY, "规则主表id不能为空");
//     //     }
//     //     //删除主表
//     //     efPersistenceService.deleteById(PubRuleScene2Model.class, ruleId);
//     //     //删除条件表
//     //     PubRuleScene2CondModel condCondtion = new PubRuleScene2CondModel();
//     //     condCondtion.setBusinessScenarioId(ruleId);
//     //     efPersistenceService.delete(PubRuleScene2CondModel.class, condCondtion);
//     //     //删除结果表
//     //     PubRuleScene2ResultModel resultConditon = new PubRuleScene2ResultModel();
//     //     resultConditon.setBusinessScenarioId(ruleId);
//     //     efPersistenceService.delete(PubRuleScene2ResultModel.class, resultConditon);
//     // }
//
//     @Override
//     public void updatePubRules(PubRuleMergeDto ruleMergeDto) throws Exception {
//         //先删除
//         this.deletePubRules(ruleMergeDto);
//         //后新增
//         this.addPubRules(ruleMergeDto);
//     }
//
// }
