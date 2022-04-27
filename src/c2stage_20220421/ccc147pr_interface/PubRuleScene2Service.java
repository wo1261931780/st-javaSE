// package c2stage_20220421.ccc147pr_interface;
//
// import com.eternalinfo.dto.PubRuleMergeDto;
// import com.eternalinfo.dto.PubRuleScene2Dto;
// import com.eternalinfo.dto.PubresponseDto;
// import com.eternalinfo.framework.dto.Page;
// import com.eternalinfo.framework.dto.PaginationDto;
//
// import java.util.List;
//
//
// /**
//  * Service接口
//  *
//  * @author liujiajun_junw
//  * @date 2022/4/22
//  */
// public interface PubRuleScene2Service {
//
//     /**
//      * 新增
//      *
//      * @param pubRuleScene2Dto 记录Dto
//      * @return int 新增成功记录数
//      */
//     int add(PubRuleScene2Dto pubRuleScene2Dto);
//
//     /**
//      * 批量新增
//      *
//      * @param pubRuleScene2Dtos 记录Dto列表
//      * @return int 新增成功记录数
//      */
//     int[] addBatch(List<PubRuleScene2Dto> pubRuleScene2Dtos);
//
//     /**
//      * 根据条件删除记录
//      *
//      * @param condition SQL条件
//      * @return int 删除成功记录数
//      */
//     int remove(PubRuleScene2Dto condition);
//
//     /**
//      * 根据id删除记录
//      *
//      * @param ids id数组
//      * @return int 删除成功记录数
//      */
//     int removeByIds(String[] ids);
//
//     /**
//      * 根据条件修改记录
//      *
//      * @param pubRuleScene2Dto 更新记录数据Dto
//      * @param condition        SQL条件
//      * @return int 修改成功记录数
//      */
//     int modify(PubRuleScene2Dto pubRuleScene2Dto, PubRuleScene2Dto condition);
//
//     /**
//      * 根据id修改记录
//      *
//      * @param pubRuleScene2Dto 更新记录数据Dto
//      * @return int 修改成功记录数
//      */
//     int modifyById(PubRuleScene2Dto pubRuleScene2Dto);
//
//     /**
//      * 分页查询
//      *
//      * @param page      分页参数
//      * @param condition SQL条件
//      * @return PaginationDto<PubRuleScene2Dto> 分页查询结果
//      */
//     PaginationDto<PubRuleScene2Dto> queryByPage(Page page, PubRuleScene2Dto condition);
//
//     /**
//      * 根据id查询记录
//      *
//      * @param id id
//      * @return PubRuleScene2Dto 查询结果
//      */
//     PubRuleScene2Dto getById(String id);
//
//     /**
//      * 根据条件查询单条记录
//      *
//      * @param condition 查询条件bean
//      * @return PubRuleScene2Dto 查询结果
//      */
//     PubRuleScene2Dto getOne(PubRuleScene2Dto condition);
//
//     /**
//      * 根据条件查询多条记录
//      *
//      * @param condition 查询条件bean
//      * @return List<PubRuleScene2Dto> 查询结果
//      */
//     List<PubRuleScene2Dto> query(PubRuleScene2Dto condition);
//
//     List<PubRuleScene2Dto> selectAll(PubRuleScene2Dto pubRuleScene2Dto);
//
//     /**
//      * 新增规则引擎数据
//      *
//      * @param requestDto
//      * @throws Exception
//      */
//     void addPubRules(PubRuleMergeDto requestDto) throws Exception;
//
//     /**
//      * 查询规则引擎数据
//      *
//      * @param ruleMergeDto
//      * @return
//      * @throws Exception
//      */
//     PubRuleMergeDto getPubRuleDetail(PubRuleMergeDto ruleMergeDto) throws Exception;
//
//     /**
//      * 删除数据
//      *
//      * @param ruleMergeDto
//      * @return
//      * @throws Exception
//      */
//     void deletePubRules(PubRuleMergeDto ruleMergeDto) throws Exception;
//
//     /**
//      * 更新数据
//      *
//      * @param ruleMergeDto
//      * @return
//      * @throws Exception
//      */
//     void updatePubRules(PubRuleMergeDto ruleMergeDto) throws Exception;
//
//     /**
//      * 查询数据
//      *
//      * @param PubresponseDto
//      * @return
//      * @throws Exception
//      */
//     PubresponseDto selectallpages(PubRuleScene2Dto condition);
// }
