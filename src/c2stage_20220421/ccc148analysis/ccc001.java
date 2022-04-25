package c2stage_20220421.ccc148analysis;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220421.ccc148analysis
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-22-20  星期一
 */
public class ccc001 {
    // @Override
    // public PubRuleMergeDto getPubRuleDetail(PubRuleMergeDto ruleMergeDto) throws Exception {
    //     String ruleId = ruleMergeDto.getRuleId();
    //     if (EmptyUtil.isEmpty(ruleId)) {
    //         throw new BizException(CommMessageCode.ERR_REQ_PAR_EMPTY, "规则主表id不能为空");
    //     }
    //     //主表查询,如果场景类型为空就再查询一次主表
    //     if (EmptyUtil.isEmpty(ruleMergeDto.getBusinessScenarioType())) {
    //-------------------------------------------------------------------------------------------------
    // 使用持久层封装好的方法，
    // 使用指定的dto类型，指定的表格类型，传入获取的id，
    // 定位对应的dto数据
    // efPersistenceService.getById(PubRuleScene2Dto .class, PubRuleScene2Model.class, ruleId);
    //-------------------------------------------------------------------------------------------------
    // 同样的，根据对应的条件，查询dto
    // efPersistenceService.query(PubRuleScene2CondDto.class, PubRuleScene2CondModel.class, condition);
    //-------------------------------------------------------------------------------------------------
    //         PubRuleScene2Dto ruleDto = efPersistenceService.getById(PubRuleScene2Dto.class, PubRuleScene2Model.class, ruleId);
    //         if (EmptyUtil.isNotEmpty(ruleDto)) {
    //             ruleMergeDto.setBusinessScenarioName(ruleDto.getBusinessScenarioName());
    //             ruleMergeDto.setBusinessScenarioType(ruleDto.getBusinessScenarioType());
    //             ruleMergeDto.setSceneExpr(ruleDto.getSceneExpr());
    //         }
    //     }
    //-------------------------------------------------------------------------------------------------
    //     //条件列表查询
    //     PubRuleScene2CondDto condition = new PubRuleScene2CondDto();
    //     condition.setBusinessScenarioId(ruleId);
    //     List<PubRuleScene2CondDto> condList = efPersistenceService.query(PubRuleScene2CondDto.class, PubRuleScene2CondModel.class, condition);
    //     ruleMergeDto.setCondList(condList);

    //     //结果列表查询
    //     PubRuleScene2ResultDto resultConditon = new PubRuleScene2ResultDto();
    //     resultConditon.setBusinessScenarioId(ruleId);
    //     List<PubRuleScene2ResultDto> resultList = efPersistenceService.query(PubRuleScene2ResultDto.class, PubRuleScene2ResultModel.class, resultConditon);
    //     ruleMergeDto.setResultList(resultList);
    //-------------------------------------------------------------------------------------------------
    // 不管过程如何，最终返回一个dto就可以
    //     return ruleMergeDto;
    // }
}
