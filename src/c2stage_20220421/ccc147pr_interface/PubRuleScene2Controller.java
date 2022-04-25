package c2stage_20220421.ccc147pr_interface;

/**
 * Controller
 *
 * @author liujiajun_junw
 * @date 2022/4/22
 */
// @RestController
// @RequestMapping("pubRuleScene2")
// @Api(tags = " Controller")
// public class PubRuleScene2Controller extends BaseController {

// @Resource
// private PubRuleScene2Service pubRuleScene2Service;


// @ApiOperation("新增规则引擎数据")
// @ResponseBody
// @PostMapping(value = "/addPubRules", produces = "application/json;charset=UTF-8")
// public ResponseDto<?> addPubRules(@RequestBody PubRuleMergeDto requestDto) throws Exception {
//     pubRuleScene2Service.addPubRules(requestDto);
//     return getResponseDto();
// }

// @ApiOperation("查询规则明细")
// @ResponseBody
// @PostMapping(value = "/getPubRuleDetail", produces = "application/json;charset=UTF-8")
// public ResponseDto<?> getPubRuleDetail(@RequestBody PubRuleMergeDto requestDto) throws Exception {
//     return getResponseDto(pubRuleScene2Service.getPubRuleDetail(requestDto));
// }

// @ApiOperation("删除规则引擎数据")
// @ResponseBody
// @PostMapping(value = "/deletePubRules", produces = "application/json;charset=UTF-8")
// public ResponseDto<?> deletePubRules(@RequestBody PubRuleMergeDto requestDto) throws Exception {
//     pubRuleScene2Service.deletePubRules(requestDto);
//     return getResponseDto();
// }

// @ApiOperation("修改规则引擎数据")
// @ResponseBody
// @PostMapping(value = "/updatePubRules", produces = "application/json;charset=UTF-8")
// public ResponseDto<?> updatePubRules(@RequestBody PubRuleMergeDto requestDto) throws Exception {
//     pubRuleScene2Service.updatePubRules(requestDto);
//     return getResponseDto();
// }
//
// @ApiOperation("分页查询")
// @ResponseBody
// @PostMapping(value = "/queryByPage", produces = "application/json;charset=UTF-8")
// public ResponseDto<PubRuleScene2Dto> queryByPage(@RequestBody PageRequestDto<PubRuleScene2Dto> pageRequest) throws Exception {
//     Page page = pageRequest.getPage();
//     PubRuleScene2Dto condition = pageRequest.getData();
//     return getResponseDto(pubRuleScene2Service.queryByPage(page, condition));
// }
//
// //-------------------------------------------------------------------------------------------------
// @ApiOperation("默认查询所有的页面")
// @ResponseBody
// @PostMapping(value = "/selectallpages", produces = "application/json;charset=UTF-8")
// public ResponseDto<PubRuleScene2Dto> selectallpages(@RequestBody PubresponseDto pubresponseDto) throws Exception {
//     // PubRuleScene2Dto condition = pubresponseDto.getData();
//     PubRuleScene2Dto condition = new PubRuleScene2Dto();
//     return getResponseDto(pubRuleScene2Service.selectallpages(condition));
// }
//-------------------------------------------------------------------------------------------------
// 一个完整的接口开发流程
// 1.首先获得对应的dto，controller，module，service，mapper，这几个文件都可以在后端生成器中自动生成
// 2.设置接口的名称，上面value和方法名，分别代表了方法和接口的路径
// 3.在controller中一般都有一个service对象，我们直接构建一个service对象，然后xx_service.getid之类的方法就可以使用service中的接口
// 4.service是一个抽象类，所以只会定义方法体，具体的实现逻辑在service的子类中实现，一般就是impl实现类
// 5.进入实现类，首先重写方法，然后看注解，保证添加进入了框架中
// 下面是一个插入实现类
//-------------------------------------------------------------------------------------------------
    /*
    * 我们的业务场景是，三张表通过一个id字段执行关联
    * 因此需要在一个dto中，定义出他们共同的字段，在后续的赋值过程中，执行插入和读取数据的工作
    * 一般是一个id主键，一个list1，一个list2
    * 在接口抽象出来的方法中，调用一个我们自己定义出来的dto
    *    @Override
    public void addPubRules(PubRuleMergeDto requestDto) throws Exception {
   这里首先调用我们定义出来的dto，然后做字段的判断，如果必要的字段为空，那么就直接抛出异常
    //-------------------------------------------------------------------------------------------------
        //情景参数空判断
        if (EmptyUtil.isEmpty(requestDto.getBusinessScenarioType())) {
            throw new BizException(CommMessageCode.ERR_REQ_PAR_EMPTY, "情景设定条件不能为空");
        } else if (EmptyUtil.isEmpty(requestDto.getSceneExpr())) {
            throw new BizException(CommMessageCode.ERR_REQ_PAR_EMPTY, "情景表达式 不能为空");
        }
    //-------------------------------------------------------------------------------------------------
        //规则条件，这个list是我们要读取的表格1
        List<PubRuleScene2CondDto> condList = requestDto.getCondList();
        //规则结果，这个是表格2
        List<PubRuleScene2ResultDto> resultList = requestDto.getResultList();
        * 将两个表格分别物理化，然后就能执行读取和插入操作
    //-------------------------------------------------------------------------------------------------
        //规则主表数据加工，新建一个主表的物理表对象，
        PubRuleScene2Model ruleModel = new PubRuleScene2Model();
        // 使用封装好的beanutil工具，
        * 拷贝标准的表格属性，和我们自己定义出来的请求dto--requestDto
        BeanUtil.copyProperties(ruleModel, requestDto);// 拷贝属性
    //-------------------------------------------------------------------------------------------------
    * 使用封装好的工具，随机生成一个自定义的id，因为我们是通过scene2表格来关联，
    * 所以这里要判断scene2中是否有对应的id存在
        String id = IdUtil.nextId("pub_rule_scene2"); // 获取主键
    //-------------------------------------------------------------------------------------------------
    * 生成好id以后，设置表格对象的id，
    * 之后我们对所有的表格处理，都会通过这个id进行，也因此将三张表进行了绑定
   //-------------------------------------------------------------------------------------------------
        ruleModel.setId(id);
   //-------------------------------------------------------------------------------------------------
   * 因为这个字段是默认存在的，新建的时候，就默认将其设置为启用，
   * 为了保证关联一致，这里就调用封装好的常量
        ruleModel.setEnableFlg(BizCommonConstants.BOOLEAN_FLAG_YES);
        //ruleModel.setSceneExpr(requestDto.getSceneExpr());// 设置情景表达式
   //-------------------------------------------------------------------------------------------------
        //新增主表，直接在持久层，使用插入语句，就生成了对应的数据
        * 但是这里只插入了一张表格，所以我们需要使用多个插入语句，在不同的表格中执行插入操作
        efPersistenceService.insert(ruleModel);
  //-------------------------------------------------------------------------------------------------
        //新增条件列表，直接使用遍历操作，
        for (PubRuleScene2CondDto cond : condList) {
        * 设置所有的id为上面生成的
            cond.setBusinessScenarioId(id);


        * 新建一个对应dto的表格，所以字段也可以这样获取
            PubRuleScene2CondModel condModel = new PubRuleScene2CondModel();

        * 新建一个标准对象，参数是上面新建的表格，加上我list中遍历出来的dto对象
            BeanUtil.copyProperties(condModel, cond);
        * 这里执行插入语句
            efPersistenceService.insert(condModel);
        }
  //-------------------------------------------------------------------------------------------------
  * 下面是一模一样的
        //新增结果列表
        for (PubRuleScene2ResultDto resultDto : resultList) {
            resultDto.setBusinessScenarioId(id);
            PubRuleScene2ResultModel resultModel = new PubRuleScene2ResultModel();
            BeanUtil.copyProperties(resultModel, resultDto);
            efPersistenceService.insert(resultModel);
        }
    }*/

// }
