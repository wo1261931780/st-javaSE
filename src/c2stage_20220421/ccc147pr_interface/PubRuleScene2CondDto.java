package c2stage_20220421.ccc147pr_interface;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Dto
 *
 * @author liujiajun_junw
 * @date 2022/4/22
 */
@ApiModel("")
public class PubRuleScene2CondDto {

    /**
     *
     */
    @ApiModelProperty("")
    private String id;

    /**
     *
     */
    @ApiModelProperty("")
    private String businessScenarioId;

    /**
     *
     */
    @ApiModelProperty("")
    private String pubConditionId;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBusinessScenarioId() {
        return this.businessScenarioId;
    }

    public void setBusinessScenarioId(String businessScenarioId) {
        this.businessScenarioId = businessScenarioId;
    }

    public String getPubConditionId() {
        return this.pubConditionId;
    }

    public void setPubConditionId(String pubConditionId) {
        this.pubConditionId = pubConditionId;
    }

}
