package wo1261931780.stjavaSE.history.c2stage_20220404.ccc113stage_project.src.java.bean;

/**
 * Created by Intellij IDEA.
 * Project:demo_project
 * Package:PACKAGE_NAME
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-22-20  星期一
 */
public class ccc001movie {
    private String movie_name;
    private int movie_score;
    private String movie_time;
    private double movie_price;
    private String movie_actor;
    private int movie_remain_tickets;

    public ccc001movie() {
    }

    public ccc001movie(String movie_name, int movie_score, String movie_time, double movie_price, String movie_actor, int movie_remain_tickets) {
        this.movie_name = movie_name;
        this.movie_score = movie_score;
        this.movie_time = movie_time;
        this.movie_price = movie_price;
        this.movie_actor = movie_actor;
        this.movie_remain_tickets = movie_remain_tickets;
    }

    @Override
    public String toString() {
        return "ccc001movie{" +
                "movie_name='" + movie_name + '\'' +
                ", movie_score=" + movie_score +
                ", movie_time='" + movie_time + '\'' +
                ", movie_price=" + movie_price +
                ", movie_actor='" + movie_actor + '\'' +
                ", movie_remain_tickets=" + movie_remain_tickets +
                '}';
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public int getMovie_score() {
        return movie_score;
    }

    public void setMovie_score(int movie_score) {
        this.movie_score = movie_score;
    }

    public String getMovie_time() {
        return movie_time;
    }

    public void setMovie_time(String movie_time) {
        this.movie_time = movie_time;
    }

    public double getMovie_price() {
        return movie_price;
    }

    public void setMovie_price(double movie_price) {
        this.movie_price = movie_price;
    }

    public String getMovie_actor() {
        return movie_actor;
    }

    public void setMovie_actor(String movie_actor) {
        this.movie_actor = movie_actor;
    }

    public int getMovie_remain_tickets() {
        return movie_remain_tickets;
    }

    public void setMovie_remain_tickets(int movie_remain_tickets) {
        this.movie_remain_tickets = movie_remain_tickets;
    }
}
