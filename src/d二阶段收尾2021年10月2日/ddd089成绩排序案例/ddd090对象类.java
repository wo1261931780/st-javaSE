package d二阶段收尾2021年10月2日.ddd089成绩排序案例;

public class ddd090对象类 {
    private String name;
    private int ywscore;
    private int mathscore;
    private int totalscore;

    public ddd090对象类() {
    }

    public ddd090对象类(String name, int ywscore, int mathscore, int totalscore) {
        this.name = name;
        this.ywscore = ywscore;
        this.mathscore = mathscore;
        this.totalscore = totalscore;
    }

    public int getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(int totalscore) {
        this.totalscore = totalscore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYwscore() {
        return ywscore;
    }

    public void setYwscore(int ywscore) {
        this.ywscore = ywscore;
    }

    public int getMathscore() {
        return mathscore;
    }

    public void setMathscore(int mathscore) {
        this.mathscore = mathscore;
    }

    /**
     * 常见的方法，不是直接设置一个总分数据
     * 而是提供一个总分方法
     */
    public int getsum() {
        return this.ywscore + this.mathscore;
    }
}
