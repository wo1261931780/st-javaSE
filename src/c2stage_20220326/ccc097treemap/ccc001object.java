package c2stage_20220326.ccc097treemap;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220326.ccc097treemap
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-20-58  ÐÇÆÚÈÕ
 */
public class ccc001object implements Comparable<ccc001object> {
    private String name;
    private int price;

    public ccc001object() {
    }

    public ccc001object(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ccc001object{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(ccc001object o) {
        return this.price - o.price >= 0 ? 1 : -1;
    }
}
