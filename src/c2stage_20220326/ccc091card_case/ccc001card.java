package c2stage_20220326.ccc091card_case;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220326.ccc091card_case
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-21-50  ÐÇÆÚÁù
 */
public class ccc001card {
    private String color;
    private String num;

    public ccc001card() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return color + num;
    }
}
