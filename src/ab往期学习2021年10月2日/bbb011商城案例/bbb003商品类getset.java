package ab往期学习2021年10月2日.bbb011商城案例;

public class bbb003商品类getset {
    private String name;
    private int price;
    private int num;
    private int id;


    public bbb003商品类getset(String name, int price, int num, int id) {
        this.name = name;
        this.price = price;
        this.num = num;
        this.id = id;
    }

    public bbb003商品类getset() {
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
