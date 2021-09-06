package bbb041类和重新学习;

public class bbb042测试类 {
    String brand="";
    int price=0;
    public void pay(String brand,int price){
        System.out.println("使用类：");
        this.brand=brand;
        this.price=price;
        System.out.println("种类是："+brand+"，价格是："+price);
    }
}
