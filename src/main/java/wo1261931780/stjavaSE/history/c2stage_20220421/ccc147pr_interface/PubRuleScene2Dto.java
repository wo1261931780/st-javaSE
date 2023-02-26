// package c2stage_20220421.ccc147pr_interface;
//
// import io.swagger.annotations.ApiModel;
// import io.swagger.annotations.ApiModelProperty;
//
// import javax.persistence.Id;
// import java.util.Date;
//
// /**
//  * Dto
//  *
//  * @author liujiajun_junw
//  * @date 2022/4/22
//  */
// @ApiModel("")
// public class PubRuleScene2Dto {
//
//     /**
//      *
//      */
//     @ApiModelProperty("")
//     private String id;
//
//     /**
//      * 场景类型,详见码表business_scenario_type
//      */
//     @ApiModelProperty("场景类型,详见码表business_scenario_type")
//     private String businessScenarioType;
//
//     /**
//      * 场景名称，唯一命名
//      */
//     @Id
//     @ApiModelProperty("场景名称，唯一命名")
//     private String businessScenarioName;
//
//     /**
//      * 情景表达式
//      */
//     @ApiModelProperty("情景表达式")
//     private String sceneExpr;
//
//     /**
//      *
//      */
//     @ApiModelProperty("")
//     private String sysEntyId;
//
//     /**
//      * 删除标识
//      */
//     @ApiModelProperty("删除标识")
//     private String sysDelFlg;
//
//     /**
//      * 创建人
//      */
//     @ApiModelProperty("创建人")
//     private String sysCrtUser;
//
//     /**
//      * 创建日期
//      */
//     @ApiModelProperty("创建日期")
//     private Date sysCrtDt;
//
//     /**
//      * 最后编辑人
//      */
//     @ApiModelProperty("最后编辑人")
//     private String sysModifyUser;
//
//     /**
//      * 最后修改日期
//      */
//     @ApiModelProperty("最后修改日期")
//     private Date sysModifyDt;
//
//     /**
//      * 允许标志,1-是 0-否
//      */
//     @ApiModelProperty("允许标志,1-是 0-否")
//     private String enableFlg;
//
//     public String getId() {
//         return this.id;
//     }
//
//     public void setId(String id) {
//         this.id = id;
//     }
//
//     public String getBusinessScenarioType() {
//         return this.businessScenarioType;
//     }
//
//     public void setBusinessScenarioType(String businessScenarioType) {
//         this.businessScenarioType = businessScenarioType;
//     }
//
//     public String getBusinessScenarioName() {
//         return this.businessScenarioName;
//     }
//
//     public void setBusinessScenarioName(String businessScenarioName) {
//         this.businessScenarioName = businessScenarioName;
//     }
//
//     public String getSceneExpr() {
//         return this.sceneExpr;
//     }
//
//     public void setSceneExpr(String sceneExpr) {
//         this.sceneExpr = sceneExpr;
//     }
//
//     public String getSysEntyId() {
//         return this.sysEntyId;
//     }
//
//     public void setSysEntyId(String sysEntyId) {
//         this.sysEntyId = sysEntyId;
//     }
//
//     public String getSysDelFlg() {
//         return this.sysDelFlg;
//     }
//
//     public void setSysDelFlg(String sysDelFlg) {
//         this.sysDelFlg = sysDelFlg;
//     }
//
//     public String getSysCrtUser() {
//         return this.sysCrtUser;
//     }
//
//     public void setSysCrtUser(String sysCrtUser) {
//         this.sysCrtUser = sysCrtUser;
//     }
//
//     public Date getSysCrtDt() {
//         return this.sysCrtDt;
//     }
//
//     public void setSysCrtDt(Date sysCrtDt) {
//         this.sysCrtDt = sysCrtDt;
//     }
//
//     public String getSysModifyUser() {
//         return this.sysModifyUser;
//     }
//
//     public void setSysModifyUser(String sysModifyUser) {
//         this.sysModifyUser = sysModifyUser;
//     }
//
//     public Date getSysModifyDt() {
//         return this.sysModifyDt;
//     }
//
//     public void setSysModifyDt(Date sysModifyDt) {
//         this.sysModifyDt = sysModifyDt;
//     }
//
//     public String getEnableFlg() {
//         return this.enableFlg;
//     }
//
//     public void setEnableFlg(String enableFlg) {
//         this.enableFlg = enableFlg;
//     }
//
// }
