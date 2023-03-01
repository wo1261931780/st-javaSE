package wo1261931780.stjavaSE.history.c2stage_20220404.ccc113stage_project.src.java.bean;

/**
 * Created by Intellij IDEA.
 * Project:demo_project
 * Package:bean
 * User:  wo1261931780@gmail.com
 * Time:  2022-04-22-55  星期一
 */
public class ccc004business extends ccc002user {
    private String address;
    private String shop_name;

    public ccc004business() {
    }

    public ccc004business(String address, String shop_name) {
        this.address = address;
        this.shop_name = shop_name;
    }

    public ccc004business(String name, int tel, String account, String password, String sex, double balance, String address, String shop_name) {
        super(name, tel, account, password, sex, balance);
        this.address = address;
        this.shop_name = shop_name;
    }

    @Override
    public String toString() {
        return "ccc004business{" +
                "address='" + address + '\'' +
                ", shop_name='" + shop_name + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
