package c2stage_20220329.ccc102stream_case;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220331.ccc001stream_case
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-21-10  ÐÇÆÚËÄ
 */
public class ccc001object {
    private String name;
    private int profit;
    private String record;
    private int sex;

    public ccc001object() {
    }

    public ccc001object(String name, int profit, String record, int sex) {
        this.name = name;
        this.profit = profit;
        this.record = record;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
