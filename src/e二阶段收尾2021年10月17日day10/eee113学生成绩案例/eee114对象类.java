package e二阶段收尾2021年10月17日day10.eee113学生成绩案例;


import d二阶段收尾2021年10月2日.ddd083自然排序.ddd85对象类;

public class eee114对象类 {
    private String name;
    private String num;
    private int score_yw;
    private int score_math;
    private int score_en;
    private int score_all;

    public eee114对象类(String name, String num, int score_yw, int score_math, int score_en, int score_all) {
        this.name = name;
        this.num = num;
        this.score_yw = score_yw;
        this.score_math = score_math;
        this.score_en = score_en;
        this.score_all = score_all;
    }

    public eee114对象类() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getScore_yw() {
        return score_yw;
    }

    public void setScore_yw(int score_yw) {
        this.score_yw = score_yw;
    }

    public int getScore_math() {
        return score_math;
    }

    public void setScore_math(int score_math) {
        this.score_math = score_math;
    }

    public int getScore_en() {
        return score_en;
    }

    public void setScore_en(int score_en) {
        this.score_en = score_en;
    }

    public int getScore_all() {
        return score_all;
    }

    public void setScore_all(int score_all) {
        this.score_all = score_all;
    }

    // @Override
    // public int compareTo(eee114对象类 o) {
    //     int num = this.score_all - o.score_all;
    //     int num2 = num == 0 ? (this.name.compareTo(o.name)) : num;
    //     return num2;
    // }
}
